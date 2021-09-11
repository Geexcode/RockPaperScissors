package com.geeb.rockpaperscissors

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseCompatLoadingForDrawables")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv_rock_1.setOnClickListener {
            fl_rock_1.background= resources.getDrawable(R.drawable.selector_bg, null)
            fl_paper_1.background = null
            fl_scissors_1.background = null
        }

        iv_paper_1.setOnClickListener {
            fl_paper_1.background= resources.getDrawable(R.drawable.selector_bg, null)
            fl_rock_1.background = null
            fl_scissors_1.background = null
        }

        iv_scissors_1.setOnClickListener {
            fl_scissors_1.background= resources.getDrawable(R.drawable.selector_bg, null)
            fl_paper_1.background = null
            fl_rock_1.background = null
        }

        iv_rock_2.setOnClickListener {
            fl_rock_2.background= resources.getDrawable(R.drawable.selector_bg, null)
            fl_paper_2.background = null
            fl_scissors_2.background = null
        }

        iv_paper_2.setOnClickListener {
            fl_paper_2.background= resources.getDrawable(R.drawable.selector_bg, null)
            fl_rock_2.background = null
            fl_scissors_2.background = null
        }

        iv_scissors_2.setOnClickListener {
            fl_scissors_2.background= resources.getDrawable(R.drawable.selector_bg, null)
            fl_paper_2.background = null
            fl_rock_2.background = null
        }

        iv_reset.setOnClickListener {
            fl_rock_1.background = null
            fl_paper_1.background = null
            fl_scissors_1.background = null
            fl_rock_2.background = null
            fl_paper_2.background = null
            fl_scissors_2.background = null
        }
    }






}