package com.ajc.tasty.model.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "food_db")
data class FoodEntity(
    @ColumnInfo(name = "Name") val Name: String,
    @ColumnInfo(name = "ImageUrl") val ImageUrl: String,
    @ColumnInfo(name = "Description") val Desc: String,
    @ColumnInfo(name = "Language") val Lang: String,
    @ColumnInfo(name = "Preparation Time") val PreparationTime: String,
    @ColumnInfo(name = "Video") val Video: String,
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int? = null
}