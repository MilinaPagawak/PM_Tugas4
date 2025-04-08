package com.example.lgf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.app.Activity
import android.content.ClipData.Item
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    private lateinit var movieRecyclerView: RecyclerView
    private  lateinit var movieAdap : MovieAdapter
    private  lateinit var ListMovie : ArrayList<ItemData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        movieRecyclerView = findViewById(R.id.movieRV)
        ListMovie = ArrayList()

        ListMovie.add(ItemData(R.drawable.bullettrain, "Bullet Train", "2022", "Action,Comedy"))
        ListMovie.add(ItemData(R.drawable.deadpool, "Deadpool 2", "2018", "Action,Comedy"))
        ListMovie.add(ItemData(R.drawable.dune, "Dune", "2021", "Sci-Fi,Fantasy"))
        ListMovie.add(ItemData(R.drawable.forrestgump, "Forrest Gump", "1994", "Drama,Romance"))
        ListMovie.add(ItemData(R.drawable.freeguy, "Free Guy", "2021", "Adventure,Comedy"))
        ListMovie.add(ItemData(R.drawable.oppenheimer, "Oppenheimer", "2023", "Biography,Drama"))
        ListMovie.add(ItemData(R.drawable.theadamproject, "The Adam Project", "2022", "Action,Comedy"))
        ListMovie.add(ItemData(R.drawable.thebatman, "The Batman", "2022", "Action,Crime"))
        ListMovie.add(ItemData(R.drawable.theconjuring, "The Conjuring", "2013", "Horror,Thriller"))
        ListMovie.add(ItemData(R.drawable.thehangover, "The Hangover", "2009", "Comedy"))

        movieRecyclerView.layoutManager = LinearLayoutManager(this)
        movieRecyclerView.setHasFixedSize(true)
        movieAdap = MovieAdapter(ListMovie)
        movieRecyclerView.adapter = movieAdap
    }
}