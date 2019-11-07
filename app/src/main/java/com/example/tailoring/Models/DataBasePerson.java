package com.example.tailoring.Models;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Person.class},version = 1)
public abstract class DataBasePerson extends RoomDatabase {

    public static final String TABLE_NAME = "table_person.db";
    public static DataBasePerson instance;
    public abstract DaoPerson daoPerson();

    public static synchronized DataBasePerson getInstance(Context context){

        if (instance == null){

            return Room.databaseBuilder(context.getApplicationContext(),
                    DataBasePerson.class,
                    TABLE_NAME)
                    .addCallback(callback)
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

    private static RoomDatabase.Callback callback = new RoomDatabase.Callback(){};
}
