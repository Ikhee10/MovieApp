package com.example.movieapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText searchField;
    private RecyclerView rvMovieCarousel, rvMovieGrid;
    private TabLayout movieTabs;
    private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing views
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        searchField = findViewById(R.id.search_field);
        rvMovieCarousel = findViewById(R.id.rvMovieCarousel);
        rvMovieGrid = findViewById(R.id.rvMovieGrid);
        movieTabs = findViewById(R.id.movieTabs);
        bottomNavigation = findViewById(R.id.bottom_navigation);

        // Setting up listeners
        setupTabListener();
        setupBottomNavigationListener();
    }

    private void setupTabListener() {
        movieTabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this, "Selected: " + tab.getText(), Toast.LENGTH_SHORT).show();
                // You can call API to fetch data based on selected tab here
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // Handle tab unselection if needed
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // Handle tab reselection if needed
            }
        });
    }

    private void setupBottomNavigationListener() {
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.navigation_search:
                        Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.navigation_watchlist:
                        Toast.makeText(MainActivity.this, "Watchlist", Toast.LENGTH_SHORT).show();
                        return true;
                }
                return false;
            }
        });
    }
}
