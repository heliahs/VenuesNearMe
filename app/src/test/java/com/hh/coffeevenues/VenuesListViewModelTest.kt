package com.hh.coffeevenues

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.hh.coffeevenues.data.Resource
import com.hh.coffeevenues.data.models.Meta
import com.hh.coffeevenues.data.models.Venues
import com.hh.coffeevenues.data.models.VenuesResponse
import com.hh.coffeevenues.data.repositories.VenuesListRepository
import com.hh.coffeevenues.ui.vanuesList.VenuesListViewModel
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.timeout
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.*
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.mock

class VenuesListViewModelTest {

/*

    private lateinit var viewModel: VenuesListViewModel
    private lateinit var repository: VenuesListRepository
    private lateinit var observer: Observer<Resource<VenuesResponse>>
    private val successResource = Resource.Success(VenuesResponse(fackData))

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @ObsoleteCoroutinesApi
    private val mainThreadSurrogate = newSingleThreadContext("UI thread")

    @ExperimentalCoroutinesApi
    @ObsoleteCoroutinesApi
    @Before
    fun setUp() {
        Dispatchers.setMain(mainThreadSurrogate)
        repository = mock()
        runBlocking {
            whenever(repository.getVenues("10")).thenReturn(successResource)

        }
        viewModel = VenuesListViewModel(repository)
        observer = mock()
    }

    @ObsoleteCoroutinesApi
    @ExperimentalCoroutinesApi
    @After
    fun tearDown() {
        Dispatchers.resetMain()
        mainThreadSurrogate.close()
    }

    @Test
    fun `when GetVenues is called , then observer is updated with success`(): Unit = runBlocking {
        viewModel.venues.observeForever(observer)
        viewModel.getVenues("10")
        delay(10)
        verify(repository).getVenues("10")
        verify(observer, timeout(50)).onChanged(Resource.Loading)
        verify(observer, timeout(50)).onChanged(successResource)
    }

//val fackData = arrayOf(Venues)
*/

}