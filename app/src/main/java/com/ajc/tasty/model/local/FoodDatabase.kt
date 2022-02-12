package com.ajc.tasty.model.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [FoodEntity::class], version = 1)

abstract class FoodDatabase : RoomDatabase() {
    abstract fun getFood(): Dao

    companion object {
        private var instance: FoodDatabase? = null
        fun getFoodDatabase(context: Context): FoodDatabase {
            if (instance != null) {
                return instance!!
            } else {
                val builder = Room.databaseBuilder(
                    context.applicationContext,
                    FoodDatabase::class.java,
                    "food_db"
                )
                builder.fallbackToDestructiveMigration()
                instance = builder.build()
                return instance!!
            }
        }
    }
}