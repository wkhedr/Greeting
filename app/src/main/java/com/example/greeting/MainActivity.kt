package com.example.greeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val btn = findViewById<Button>(R.id.button2)
        btn.setOnClickListener {
            val et = findViewById<EditText>(R.id.editText1)
            val name = et.text.toString()
            val tv = findViewById<TextView>(R.id.textView2)
            tv.text = getString(R.string.hello_str, name)
        }*/
    }

    fun OnGreetingsClick(view: View) {
        val et = findViewById<EditText>(R.id.editText1)
        val name = et.text.toString()
        val tv = findViewById<TextView>(R.id.textView2)
        tv.text = getString(R.string.hello_str, name)

    }
}