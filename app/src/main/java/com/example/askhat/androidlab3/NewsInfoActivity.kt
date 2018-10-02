package com.example.askhat.androidlab3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_news_info.*

class NewsInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_info)
        val news= intent.getSerializableExtra("object") as News
        setSupportActionBar(toolbarInfo)
        val actionbar: ActionBar? = supportActionBar
        actionbar?.apply {
            title = news.title
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp)

        }
    }
}
