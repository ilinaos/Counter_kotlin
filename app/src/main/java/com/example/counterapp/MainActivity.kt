package com.example.counterapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById <TextView> (R.id.textView)
    }

    fun Reset (view: View) {
        textView.text="6";
    }

    fun Count (view: View) {
        val num = textView.text.toString()
        var count: Int=Integer.parseInt(num)
        count++
        textView.text=count.toString();
    }
}