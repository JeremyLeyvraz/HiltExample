package com.lj.repositories

import javax.inject.Inject

class PersonRepositoryImpl @Inject constructor(
    private val cityRepository: CityRepository
): PersonRepository {
    override fun getPresentation(): String {
        return "My name is BabaYaga. And I'm from ${cityRepository.getCity()}"
    }
}