package com.ajc.tasty.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ajc.tasty.model.local.FoodEntity
import com.ajc.tasty.model.remote.ResponseDTO
import com.ajc.tasty.repository.DataRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
/*
In this article, we are going to discuss the internals of ViewModel which is a part of Android Architecture Components. We will first briefly discuss the usages of ViewModel in Android and then we will go in detail about how ViewModel actually works and how it retains itself on configuration changes.

According to the documentation, the ViewModel class is designed to store and manage UI-related data in a lifecycle conscious way.
The ViewModel class allows data to survive configuration changes such as screen rotations.
 */
class MainViewModel(private val dataRepository: DataRepository) : ViewModel() {

    fun createTransaction() {
        viewModelScope.launch(Dispatchers.IO) {
            dataRepository.getData()
        }
    }

    val user: LiveData<ResponseDTO> get() = dataRepository.user

    fun insertDataInDb(itunesDbTable: FoodEntity) {
        dataRepository.insertDataInDb(itunesDbTable)
    }

    fun deleteDataFromDb() {
        dataRepository.deleteDataFromDb()
    }

    fun getDataFromDb() {
        dataRepository.getDataFromDb()
    }

    fun getData(): LiveData<List<FoodEntity>> {
        return dataRepository.getDataFromDb()
    }
}
