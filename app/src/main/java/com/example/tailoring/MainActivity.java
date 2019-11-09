package com.example.tailoring;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;



import android.os.Bundle;
import android.view.MenuItem;

import com.example.tailoring.Fragments.FragmentFavorite;
import com.example.tailoring.Fragments.FragmentHome;
import com.example.tailoring.Fragments.FragmentMeasure;
import com.google.android.material.bottomnavigation.BottomNavigationView;



public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnv;
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.l_main);
        toolbar = findViewById(R.id.toolbar);
        bnv = findViewById(R.id.navigationView);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, new FragmentHome()).commit();
        bnv.setSelectedItemId(R.id.nav_home);
        bnv.setOnNavigationItemSelectedListener(navListener);

        setSupportActionBar(toolbar);



    }

// BottomNavigation itemSelected
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            Fragment SelectedFragment = null;

            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                    SelectedFragment = new FragmentHome();
                    break;
                case R.id.nav_measure:
                    SelectedFragment = new FragmentMeasure();
                    break;
                case R.id.nav_fav:
                    SelectedFragment = new FragmentFavorite();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer, SelectedFragment).commit();

            return true;
        }
    };

}
