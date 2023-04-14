package com.example.lkhome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class ContactActivity : AppCompatActivity() {
    lateinit var mContacts:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        mContacts = findViewById(R.id.mList)
        mContacts.setOnItemClickListener { adapterView, view, i, l ->
            val name = adapterView.getItemAtPosition(i).toString()
            Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        }
    }
}