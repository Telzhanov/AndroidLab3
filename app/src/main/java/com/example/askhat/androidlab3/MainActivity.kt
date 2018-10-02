package com.example.askhat.androidlab3

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var news = ArrayList<News>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbarNews)
        val actionbar: ActionBar? = supportActionBar
        actionbar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp)
            setDisplayShowTitleEnabled(false)
        }
        news.apply {
            add(News("Facebook reports jump in profits","25-05-2018"))
            add(News("Lorem de ipsum more more in lorem","25-05-2018"))
            add(News("Facebook reports jump in profits","25-05-2018"))
            add(News("Lorem de ipsum more more in lorem","25-05-2018"))
            add(News("Facebook reports jump in profits","25-05-2018"))
            add(News("Lorem de ipsum more more in lorem","25-05-2018"))
            add(News("Facebook reports jump in profits","25-05-2018"))
            add(News("Lorem de ipsum more more in lorem","25-05-2018"))
            add(News("Facebook reports jump in profits","25-05-2018"))
            add(News("Lorem de ipsum more more in lorem","25-05-2018"))
        }
        val pager = CategoryPageAdapter(supportFragmentManager)
        categoryPager.adapter = pager
        tabCategory.setupWithViewPager(categoryPager)
    }
}
