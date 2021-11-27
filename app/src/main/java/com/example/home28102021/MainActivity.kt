package com.example.home28102021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout_stive: LinearLayout = findViewById(R.id.layout_stive_jobs);
        val layout_pavel: LinearLayout = findViewById(R.id.layout_pavel_durov);
        val layout_bill: LinearLayout = findViewById(R.id.layout_bill_gates);
        val layout_mark: LinearLayout = findViewById(R.id.layout_mark_zuckerberg);

        layout_stive.setOnClickListener {
            val intent = Intent(this, first_activity::class.java)
            startActivity(intent)

        }
        layout_mark.setOnClickListener {
            val intent = Intent(this, four_activity::class.java)
            startActivity(intent)

        }

        layout_pavel.setOnLongClickListener {
            val intent = Intent(this,second_activity::class.java)
            startActivity(intent)

            return@setOnLongClickListener false
        }

        layout_bill.setOnLongClickListener {
            val intent = Intent(this, three_activity::class.java)
            startActivity(intent)

            return@setOnLongClickListener false
        }
    }
}