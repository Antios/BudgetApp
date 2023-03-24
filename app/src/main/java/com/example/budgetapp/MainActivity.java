package com.example.budgetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create an instance of the HomeScreenView class
        HomeScreenView homeView = new HomeScreenView(this);

        // Set the login screen view as the content view for the activity
        setContentView(homeView);
    }
}