package com.anmol.musicelle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox

class PlaylistL : AppCompatActivity() {
    lateinit var english: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist_l)
        val values = intent.getSerializableExtra("languages")
    }
}