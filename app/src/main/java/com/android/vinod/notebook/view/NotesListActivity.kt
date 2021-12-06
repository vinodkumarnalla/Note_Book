package com.android.vinod.notebook.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.vinod.notebook.view.composeviews.OnFloatingButtonClickListener
import com.android.vinod.notebook.view.composeviews.showFloatingActionButton
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotesListActivity : AppCompatActivity(),OnFloatingButtonClickListener {

    private lateinit var viewModel: NotesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            val floatingListener = this
            Column(
            ) {
                showFloatingActionButton(floatingListener)
            }

        }
        viewModel = ViewModelProvider(this)[NotesViewModel::class.java]
        initObservers()
    }




    private fun initObservers() {
        viewModel.getNotesLiveData().observe(this, Observer {
            it?.let {

            }
        })
    }

    override fun onFloatingButtonClick() {
        val intent = Intent(this, CreateNotesActivity::class.java)
        startActivity(intent)
    }


}