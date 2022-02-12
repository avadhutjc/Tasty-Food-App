package com.ajc.tasty.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ajc.tasty.model.local.FoodEntity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_layout.view.*

class ViewHolder(itemView: View, private val onClick: OnClick) : RecyclerView.ViewHolder(itemView) {

    fun setData(result: FoodEntity) {

        itemView.apply {
            CardView1.setOnClickListener {
                onClick.setOnClick(result)
            }
            tvTitle1.text = result.Name
            tvDesc1.text = result.Desc


//     videoView1.setVideoURI() = result.Video
//            videoView1.setVideoPath("http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4")
//            videoView1.start()
            Glide.with(Img1).load(result.ImageUrl).into(Img1)
        //    Glide.with(Img3).load(result.ImageUrl).into(Img3)

        }
    }
}