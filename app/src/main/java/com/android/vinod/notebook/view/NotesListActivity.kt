package com.android.vinod.notebook.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.vinod.notebook.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotesListActivity : AppCompatActivity() {

    private lateinit var viewModel:NotesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_main)
        viewModel= ViewModelProvider(this).get(NotesViewModel::class.java)
        initObservers()
    }

    private fun initObservers() {
        viewModel.getNotesLiveData().observe(this, Observer {
            it?.let {
                Toast.makeText(this,it.size,Toast.LENGTH_SHORT).show()
            }
        })
    }
}