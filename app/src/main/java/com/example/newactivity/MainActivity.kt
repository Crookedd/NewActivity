package com.example.newactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.btn_show_pic)

        myButton.setOnClickListener{
            val intent = Intent(this, PicActivity::class.java)
            intent.putExtra("pitLinc", "https://sun9-57.userapi.com/impg/_w4kt2hDe0r6lNTmT1TRJn43_uGHvA7w6FiYMw/KoYm5g_tViY.jpg?size=736x913&quality=95&sign=24b10631467d694f61cc17093ee2c95f&type=album")
            startActivity(intent)
        }

    }
}