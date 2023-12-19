package com.example.newactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class PicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic)
        val View: ImageView = findViewById(R.id.picView)
        this.title = "Art"

        Glide.with(this).load(intent.getStringExtra("pitLinc")).into(View)
    }
}