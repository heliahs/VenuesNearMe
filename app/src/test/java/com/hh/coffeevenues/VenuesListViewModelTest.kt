package com.hh.coffeevenues

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.hh.coffeevenues.data.Resource
import com.hh.coffeevenues.data.models.*
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


class VenuesListViewModelTest {

    val location = Location(1000)
    val venue = Venue("1",location,"costa" )
    val itam = Item(venue)
    val group = Group(items = listOf(itam))
    val fackData = Response(listOf(group))

    private val myLocation = "51.648520441313714,-0.179409587946961"

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
            whenever(repository.getVenues(myLocation)).thenReturn(successResource)

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
        viewModel.getVenues(myLocation)
        delay(10)
        verify(repository).getVenues(myLocation)
        verify(observer, timeout(50)).onChanged(Resource.Loading)
        verify(observer, timeout(50)).onChanged(successResource)
    }



}