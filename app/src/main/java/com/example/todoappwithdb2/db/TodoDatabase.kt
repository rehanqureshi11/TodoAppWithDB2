package com.example.todoappwithdb2.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.todoappwithdb2.Todo


@Database(entities = [Todo::class], version = 1)
@TypeConverters(Converter::class)
abstract class TodoDatabase: RoomDatabase() {

companion object{
    const val DB_NAME = "todo.db"

}
    abstract fun getTodoDao(): TodoDao
}