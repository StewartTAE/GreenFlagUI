package com.example.greenflagui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

     

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mbutton: Button = findViewById<Button>(R.id.create_btn)

        mbutton.setOnClickListener {
            val intent = Intent(this, Create_account_screen::class.java)
            startActivity(intent)
        }

    }


}