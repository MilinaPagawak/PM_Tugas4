package com.example.lgf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_forget.*

class Forget : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget)

        textBack.setOnClickListener(View.OnClickListener {startActivity(Intent(this, MainActivity::class.java)) })
    }
}