package com.example.todoapp;

//add database entities
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import android.content.Context;

@Database(entities = {MainData.class},version = 1,exportSchema = false)

public abstract class RoomDB extends RoomDatabase {
    //create database instance or The Room database class manages the database instance.
    private static RoomDB databse;

    //define db name
    private static String DATABASE_NAME="database";

    // Create a synchronized method to get the database instance
    public  synchronized static RoomDB getInstance(Context context){
        if(databse==null){
            //when db is null
            //initialize db
            // When the database instance is null, initialize the database
            databse= Room.databaseBuilder(context.getApplicationContext(),RoomDB.class,DATABASE_NAME)
                    .allowMainThreadQueries() // Allow queries on the main thread (for simplicity, not recommended)
                    .fallbackToDestructiveMigration() // If the version number is increased, recreate the database
                    .build();
        }

        //return db
        return databse;
    }

    //create Dao

    public abstract MainDao mainDao();

}
