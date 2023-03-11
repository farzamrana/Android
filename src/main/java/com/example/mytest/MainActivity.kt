package com.example.mytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text: TextView = findViewById(R.id.textView)
        val tvInput: Button = findViewById(R.id.button)
        Log.d("aa","hello MY" +
                "APP" +
                "IS" +
                "RUNNING")
       text.setOnClickListener { makeText(this, "hey", Toast.LENGTH_SHORT).show() }
        tvInput.setOnClickListener {
            makeText(
                this,
                "this is my first message in order to write my code",
                Toast.LENGTH_SHORT
            ).show()
            Log.d("message","button clicked")
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}