package com.example.todoapp;

//define table name

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "table_name")
public class MainData implements Serializable {
    //create id column
    // The entity class represents a table in the Room database.
    // Primary Key column
    @PrimaryKey(autoGenerate = true)

    private int ID;

    //create text column
    @ColumnInfo(name = "text")

    private String text;

    //generate getter abd setter or Getter and Setter methods for ID
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    // Getter and Setter methods for text
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
