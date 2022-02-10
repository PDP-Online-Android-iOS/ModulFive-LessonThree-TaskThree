package dev.ogabek.kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.adapter.ImgAdapter
import dev.ogabek.kotlin.model.Img

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        recyclerView = findViewById(R.id.rv_main)

        recyclerView.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false)

        val adapter = ImgAdapter(prepareImgList())

        recyclerView.adapter = adapter

    }

    private fun prepareImgList(): List<Img> {
        val list = ArrayList<Img>()

        list.add(Img(R.drawable.first))
        list.add(Img(R.drawable.second))
        list.add(Img(R.drawable.third))
        list.add(Img(R.drawable.fouth))

        return list
    }


}