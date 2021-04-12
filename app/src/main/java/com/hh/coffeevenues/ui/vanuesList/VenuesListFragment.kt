package com.hh.coffeevenues.ui.vanuesList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hh.coffeevenues.data.Resource
import com.hh.coffeevenues.databinding.VenuesFragmentBinding
import com.hh.coffeevenues.ui.adapters.VenuesAdapterClickListener
import com.hh.coffeevenues.ui.adapters.VenuesListAdapter
import com.hh.coffeevenues.ui.handleApiError
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class VenuesListFragment : Fragment() {

    private val viewModel by viewModels<VenuesListViewModel>()
    lateinit var binding: VenuesFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = VenuesFragmentBinding.inflate(inflater)

        val adapter = VenuesListAdapter(VenuesAdapterClickListener {
            it.let {

            }
        })

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(activity)


        val location = VenuesListFragmentArgs.fromBundle(requireArguments()).location
        viewModel.getVenues(location)
        viewModel.venues.observe(viewLifecycleOwner, Observer {
            when (it) {
                is Resource.Loading -> {
                    binding.loading.visibility = View.VISIBLE
                }
                is Resource.Success -> {
                    binding.loading.visibility = View.GONE

                    adapter.submitList(it.value.response.groups[0].items)
                }
                is Resource.Failure -> {
                    binding.loading.visibility = View.GONE
                    handleApiError(it)

                }
            }
        })
        return binding.root
    }
}