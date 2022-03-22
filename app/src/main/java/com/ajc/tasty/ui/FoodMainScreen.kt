package com.ajc.tasty.ui

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ajc.tasty.R
import com.ajc.tasty.model.local.Dao
import com.ajc.tasty.model.local.FoodEntity
import com.ajc.tasty.model.local.FoodDatabase
import com.ajc.tasty.model.remote.Result
import com.ajc.tasty.model.remote.api.ApiService
import com.ajc.tasty.model.remote.api.Network
import com.ajc.tasty.repository.DataRepository
import com.ajc.tasty.ui.adapter.Adapter
import com.ajc.tasty.ui.adapter.OnClick
import com.ajc.tasty.viewmodel.MainViewModel
import com.ajc.tasty.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FoodMainScreen : AppCompatActivity(), OnClick {
    private lateinit var adapterjoin: Adapter
    private lateinit var mainviewmodel: MainViewModel
    private lateinit var repository: DataRepository
    private var list = mutableListOf<Result>()
    private var foodList = mutableListOf<FoodEntity>()
    private lateinit var dao: Dao
    private var manager: LinearLayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manager = LinearLayoutManager(this)
        dao = FoodDatabase.getFoodDatabase(this).getFood()

        val userApi = Network.getInstance().create(ApiService::class.java)
        repository = DataRepository(userApi, dao)
        val factory = ViewModelFactory(repository)
        mainviewmodel = ViewModelProviders.of(this, factory).get(MainViewModel::class.java)

        if (isNetworkAvailable()) {
            loadApi()
        }

        mainviewmodel.getData().observe(this, Observer {
            foodList.addAll(it)
            setRecycle()
        })
    }

    private fun isNetworkAvailable(): Boolean {
        val connectivityManager =
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }

    private fun insertDataToDb(resultModels: List<Result>) {
        mainviewmodel.deleteDataFromDb()
        resultModels.forEach {
            val foodDb =
                it.name?.let { it1 ->
                    it.thumbnailUrl?.let { it2 ->
                        it.description?.let { it3 ->
                            it.language?.let { it4 ->
                                it.originalVideoUrl?.let { it5 ->
                                    FoodEntity(
                                        it1,
                                        it2, it3, it4, it.prepTimeMinutes.toString(),it5
                                    )
                                }
                            }
                        }
                    }
                }
            if (foodDb != null) {
                mainviewmodel.insertDataInDb(foodDb)
            }
        }
    }

//    private fun loadApi() {
//        mainviewmodel.createTransaction()
//        mainviewmodel.user.observe(this, Observer {
//            list.clear()
//            if (it != null) {
//                CoroutineScope(Dispatchers.IO).launch {
//                    it.results?.let { it1 -> insertDataToDb(it1) }
//                }
//            }
//            list.addAll(it.results as MutableList<Result>)
//        })
//    }

    private fun setRecycle() {
        adapterjoin = Adapter(foodList, this, this)
        recycle.adapter = adapterjoin
        recycle.layoutManager = GridLayoutManager(this,2)
    }

    override fun setOnClick(result: FoodEntity) {
        //  val url = result.ImageUrl
        val intent = Intent(this, FoodDetailsScreen::class.java)
        intent.putExtra("name", result.Name)
        intent.putExtra("desc", result.Desc)
        intent.putExtra("lang", result.Lang)
        intent.putExtra("preparationTime", result.PreparationTime)
        intent.putExtra("originalVideo", result.Video)
        // intent.putExtra("url", url)
        startActivity(intent)
    }
}