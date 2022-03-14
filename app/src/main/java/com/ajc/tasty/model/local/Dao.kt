package com.ajc.tasty.model.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.*

@Dao
interface Dao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addDataFromAPI(result: FoodEntity)

    @Query("select * from food_db")
    fun getResponseFromDb(): LiveData<List<FoodEntity>>

    @Query("delete from food_db")
    fun deleteAllDataFromDB()
}