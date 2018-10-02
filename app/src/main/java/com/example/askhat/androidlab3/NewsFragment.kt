package com.example.askhat.androidlab3

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.news_fragment.view.*

class NewsFragment(): Fragment(){
    var context:MainActivity ?= null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.news_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (context?.resources?.configuration?.orientation== Configuration.ORIENTATION_LANDSCAPE) {
            view.newsList.layoutManager = GridLayoutManager(context,2)
            view.newsList.adapter = NewsListAdapter(context?.news!!,context!!)
        }
        else{
            view.newsList.layoutManager = LinearLayoutManager(context)
            view.newsList.adapter = NewsListAdapter(context?.news!!,context!!)
        }

    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        this.context = context as MainActivity

    }
}