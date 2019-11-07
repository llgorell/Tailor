package com.example.tailoring.Models;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import java.util.List;

public class RepositoryPerson {


    private LiveData<List<Person>> listPerson;
    private DaoPerson daoPerson;

    public RepositoryPerson(Application application) {
        DataBasePerson db = DataBasePerson.getInstance(application);
        daoPerson = db.daoPerson();
        listPerson = daoPerson.getAllPerson();
    }

    public void insertPerson(Person person){new InsertPersonAsynkTask(daoPerson).execute(person);}
    public LiveData<List<Person>> getAllPerson(){return listPerson;}
}
     class InsertPersonAsynkTask extends AsyncTask<Person,Void,Void>{

        DaoPerson daoPerson;

         public InsertPersonAsynkTask(DaoPerson daoPerson) {
             this.daoPerson = daoPerson;
         }

         @Override
         protected Void doInBackground(Person... people) {
             daoPerson.insertPerson(people[0]);
             return null;
         }
     }
