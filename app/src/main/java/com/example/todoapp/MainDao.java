package com.example.todoapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface MainDao {
    //insert query or The DAO interface defines the database operations.
    @Insert(onConflict = REPLACE)
    void insert(MainData mainData);

    //delete a single task
    @Delete
    void delete(MainData mainData);

    //delete all tasks
    @Delete
    void reset(List<MainData> mainData);

    //update a task's text
    @Query("UPDATE Table_name SET text =:sText WHERE ID = :sID")
    void upate(int sID,String sText);

    //get all data(texts)
    @Query("SELECT * FROM table_name")
    List<MainData> getAll();
}
