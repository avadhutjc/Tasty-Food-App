package com.ajc.tasty.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ajc.tasty.model.local.Dao
import com.ajc.tasty.model.local.FoodEntity
import com.ajc.tasty.model.remote.ResponseDTO
import com.ajc.tasty.model.remote.api.ApiService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DataRepository(private val userApi: ApiService, private val dao: Dao) {

    private val userLiveData = MutableLiveData<ResponseDTO>()

    val user: LiveData<ResponseDTO> get() = userLiveData

    suspend fun getData() {
        val result = userApi.getData(
            "0",
            "20",
            "tasty.p.rapidapi.com",
            "dac3c9770bmsh0ad63fe981f1e6dp1b1a5bjsn5a2f7ca41c47"
        )
        if (result.body() != null) {
            userLiveData.postValue(result.body())
        }
    }

    fun insertDataInDb(newsTable: FoodEntity) {
        CoroutineScope(Dispatchers.IO).launch {
            dao.deleteAllDataFromDB()
            dao.addDataFromAPI(newsTable)
        }
    }

    fun getDataFromDb(): LiveData<List<FoodEntity>> {
        return dao.getResponseFromDb()
    }

    fun deleteDataFromDb() {
       dao.deleteAllDataFromDB()
    }

}