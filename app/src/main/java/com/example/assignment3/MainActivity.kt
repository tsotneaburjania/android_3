package com.example.assignment3

import android.R.id
import android.os.Bundle
import android.text.Html
import android.text.SpannableStringBuilder
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.bold


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
//      უცნაური გამოსავალია, მაგრამ სხვა ვერაფერი მოვიფიქრე.
        val createAccTextEl: TextView = findViewById(R.id.createAccText)
        val createAccText = SpannableStringBuilder()
            .append("Not registered? ")
            .bold { append("Create Account") }
        createAccTextEl.text = createAccText
    }
}