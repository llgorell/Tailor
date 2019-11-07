package com.example.tailoring.Models;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_Personal")
public class Person {

    @PrimaryKey(autoGenerate = true)
    int id;

    @ColumnInfo(name = "First Name")
    String firstName;

    @ColumnInfo(name = "Last Name")
    String lastName;

    @ColumnInfo(name = "Mobile Number")
    int mobNumber;

    public Person(String firstName, String lastName, int mobNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobNumber = mobNumber;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(int mobNumber) {
        this.mobNumber = mobNumber;
    }
}
