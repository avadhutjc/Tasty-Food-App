package com.ajc.tasty.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ajc.tasty.model.local.FoodEntity
import com.ajc.tasty.model.remote.ResponseDTO
import com.ajc.tasty.repository.DataRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

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
