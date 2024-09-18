package com.example.eletriccarapp.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.eletriccarapp.R
import com.example.eletriccarapp.ui.adapter.CarAdapter
import com.example.eletriccarapp.data.CarFactory
import com.example.eletriccarapp.ui.adapter.TabAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var btnCalcular: Button
    private lateinit var lista: RecyclerView
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Lifestyle", "Create")
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setupView()
        setupTab()
    }

    override fun onResume(){
        super.onResume()
        Log.d("Lifestyle", "Resume")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifestyle", "Start")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifestyle", "Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifestyle", "Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifestyle", "Destroy")
    }

    private fun setupView() {
        tabLayout = findViewById(R.id.tl_table)
        viewPager = findViewById(R.id.vp_pager)

    }



    private fun setupTab(){
        val tabsAdapter = TabAdapter(this)
        viewPager.adapter = tabsAdapter
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let {
                    viewPager.currentItem = it.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.getTabAt(position)?.select()
            }
        })
    }
}