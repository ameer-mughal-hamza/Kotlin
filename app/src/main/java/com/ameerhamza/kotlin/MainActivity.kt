package com.ameerhamza.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val showBtn = findViewById(R.id.showButton) as Button
        val textView = findViewById(R.id.textView) as TextView
        val editText = findViewById(R.id.editText) as EditText
        showBtn.setOnClickListener {
            textView.setText(editText.text)
            Toast.makeText(this@MainActivity, editText.text, Toast.LENGTH_LONG).show()
        }
    }
}
