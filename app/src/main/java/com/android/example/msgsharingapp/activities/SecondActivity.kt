package com.android.example.msgsharingapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.android.example.msgsharingapp.R
import com.android.example.msgsharingapp.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity  : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle: Bundle?= intent.extras
        bundle?.let{
            val msg= bundle.getString("user_message")
            if (msg != null) {
                showToast(msg)
            }
            txtUserMessage.text=msg
        }


    }
}