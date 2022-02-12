package com.ajc.tasty.ui

import android.app.ProgressDialog
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ajc.tasty.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_food_details_screen.*

class FoodDetailsScreen : AppCompatActivity() {
    private var name: String = ""
    private var desc: String = ""
    private var lang: String = ""
    private var preparationTime: String = ""
    private var originalVideo: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details_screen)

        val intent = intent
        name = intent.getStringExtra("name").toString()
        desc = intent.getStringExtra("desc").toString()
        lang = intent.getStringExtra("lang").toString()
        preparationTime = intent.getStringExtra("preparationTime" + "Preparation Time : ").toString()
        originalVideo = intent.getStringExtra("originalVideo").toString()

        tvTitle.text = name
        tvDesc.text = desc
        tvLang.text = lang
        tvPreparationTime.text = preparationTime

        //  Glide.with(ivImageView).load(url).into(ivImageView)

//https://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4
//https://img.buzzfeed.com/video-transcoder-prod/output/227746/square_320/1640809759_00001.png
        val progressDialog = ProgressDialog(this)
//        progressDialog.setMessage("WAIT"); progressDialog.show();
      //  val uri = Uri.parse(url)
        val uri = Uri.parse(originalVideo)

        video1.setVideoURI(uri);
        video1.start()
        video1.setOnClickListener {
            MediaPlayer.OnPreparedListener {
                progressDialog.dismiss()
            }
        }
//        video1.setOnPreparedListener(new MediaPlayer . OnPreparedListener ()
//        {
//            @Override public void onPrepared(MediaPlayer mp)
//            { progressDialog.dismiss(); }
//        }); }

    }
}