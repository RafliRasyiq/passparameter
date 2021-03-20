package com.example.passparameter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btnIntent)

        val btnIntentData = findViewById<Button>(R.id.btnIntent)

        btnIntent.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnIntent -> run{
                val intentBiasa = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intentBiasa)
            }
            R.id.btnIntent -> run{
                val intentData = Intent(this@MainActivity, IntentDenganData::class.java)
                intentData.putExtra(IntentDenganData.EXTRA_TEXT, "Selamat Anda Sudah Login")
                startActivity(intentData)
            }
        }
    }
}