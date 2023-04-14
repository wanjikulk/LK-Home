package com.example.lkhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var mCalc:Button
    lateinit var mContact:Button
    lateinit var mWebsite:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mCalc = findViewById(R.id.mBtnCalc)
        mContact = findViewById(R.id.mBtnContacts)
        mWebsite = findViewById(R.id.mBtnWeb)


        mCalc.setOnClickListener {
            val kik = Intent(this, CalculatorActivity::class.java)
            startActivity(kik)

        }
        mContact.setOnClickListener {
            val watu = Intent(this, ContactActivity::class.java)
            startActivity(watu)

        }
        mWebsite.setOnClickListener {
            val neti = Intent(this, WebsiteActivity::class.java)
            startActivity(neti)

        }
    }

}