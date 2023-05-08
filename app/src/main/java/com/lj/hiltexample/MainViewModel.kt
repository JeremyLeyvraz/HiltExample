package com.lj.hiltexample

import androidx.lifecycle.ViewModel
import com.lj.repositories.PersonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val personRepository: PersonRepository
) : ViewModel() {

    fun getPresentation(): String = personRepository.getPresentation()

}