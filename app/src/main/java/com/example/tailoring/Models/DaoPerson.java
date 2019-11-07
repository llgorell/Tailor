package com.example.tailoring.Models;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DaoPerson {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertPerson(Person person);

    @Query("SELECT * FROM table_Personal")
    LiveData<List<Person>> getAllPerson();

}
