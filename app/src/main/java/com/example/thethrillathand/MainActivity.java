package com.example.thethrillathand;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity  {



    private FragmentManager fragmentManager = getSupportFragmentManager();

    private Frag_Home fragmentHome = new Frag_Home();
    private Frag_fishing fragmentFishing = new Frag_fishing();
    private Frag_weather fragmentWeather = new Frag_weather();
    private Frag_reservation fragmentReservation = new Frag_reservation();
    private Frag_board fragmentBoard = new Frag_board();
//    private Frag_Mymenu fragmentMyMenu = new Frag_Mymenu();
    private Frag_SOS fragmentSOS = new Frag_SOS();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main, fragmentHome).commitAllowingStateLoss();

    }
   public void homeclick(View v) {
       FragmentTransaction transaction = fragmentManager.beginTransaction();
       transaction.replace(R.id.main, fragmentHome).commitAllowingStateLoss();

    }
    public void weatherclick(View v) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main, fragmentWeather).commitAllowingStateLoss();

    }
    public void reservationclick(View v) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main, fragmentReservation).commitAllowingStateLoss();

    }
    public void sosclick(View v) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main, fragmentSOS).commitAllowingStateLoss();

    }
    public void boardclick(View v) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main, fragmentBoard).commitAllowingStateLoss();

    }
    public void mymenuclick(View v) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main, fragmentFishing).commitAllowingStateLoss();

    }
    public void black(int i, String v) {


    }




}
