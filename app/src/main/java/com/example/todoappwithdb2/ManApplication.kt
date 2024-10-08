package com.example.todoappwithdb2

import android.app.Application
import androidx.room.Room
import com.example.todoappwithdb2.db.TodoDatabase

class ManApplication : Application(){

    companion object{
        lateinit var todoDatabase: TodoDatabase
    }
    override fun onCreate() {
        super.onCreate()
        todoDatabase = Room.databaseBuilder(this,
            TodoDatabase::class.java,
            TodoDatabase.DB_NAME).build()
    }

}