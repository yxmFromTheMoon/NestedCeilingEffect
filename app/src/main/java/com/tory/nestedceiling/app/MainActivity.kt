package com.tory.nestedceiling.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.tory.nestedceiling.app.page.NestedParentRecyclerViewActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        btn1.setOnClickListener {
            val intent = Intent(this, NestedParentRecyclerViewActivity::class.java)
            intent.putExtra("isViewPager2", false)
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, NestedParentRecyclerViewActivity::class.java)
            intent.putExtra("isViewPager2", true)
            startActivity(intent)
        }
    }
}