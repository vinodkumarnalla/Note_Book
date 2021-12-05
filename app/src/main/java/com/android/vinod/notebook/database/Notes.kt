package com.android.vinod.notebook.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Notes {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    var notes: String? = null
}