package com.example.tailoring.ViewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.tailoring.Models.Person;
import com.example.tailoring.Models.RepositoryPerson;

import java.util.List;

public class ViewModelPerson extends AndroidViewModel {

   public LiveData<List<Person>> listPerson;
   private RepositoryPerson repositoryPerson;


    public ViewModelPerson(@NonNull Application application) {
        super(application);
       repositoryPerson = new RepositoryPerson(application);
       listPerson = repositoryPerson.getAllPerson();
    }

    public void insertPerson(Person person){
        repositoryPerson.insertPerson(person);
    }

    public LiveData<List<Person>> getAllPerson(){return repositoryPerson.getAllPerson();}
}
