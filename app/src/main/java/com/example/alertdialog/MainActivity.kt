package com.example.alertdialog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var Btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Btn = findViewById(R.id.Btn)
        Btn.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            val view = layoutInflater.inflate(R.layout.alerteditied, null)

            builder.setView(view)

            val TvBtn = view.findViewById<Button>(R.id.TvBtn)
            val GoBtn = view.findViewById<Button>(R.id.GoBtn)
            val TV = view.findViewById<TextView>(R.id.TV)
            val ET = view.findViewById<EditText>(R.id.ET)

            builder.setNegativeButton("Close"){_, _ ->}
            builder.create().show()

            TvBtn.setOnClickListener(View.OnClickListener {
                TV.text = ET.text
            })

            GoBtn.setOnClickListener {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("text", "${ET.text}")
                startActivity(intent)
            }
        }

    }//emd oncreate
}//end class