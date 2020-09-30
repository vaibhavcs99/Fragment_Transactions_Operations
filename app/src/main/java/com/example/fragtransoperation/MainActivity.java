package com.example.fragtransoperation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FragmentManager manager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addA(View view) {

        FragmentOne fragmentOne = new FragmentOne();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment_place, fragmentOne, "A").addToBackStack("addA").commit();

    }

    public void addB(View view) {

        FragmentTwo fragmentTwo = new FragmentTwo();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment_place, fragmentTwo, "B").addToBackStack("addB").commit();

    }

    public void addC(View view){
        FragmentThree fragmentThree = new FragmentThree();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment_place,fragmentThree,"C").addToBackStack("addC").commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        manager.popBackStack("addA",0);
    }

    public void removeA(View view) {

        Fragment fragmentOne = manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();

        if (fragmentOne != null) {
            transaction.remove(fragmentOne).addToBackStack(null).commit();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Selection", Toast.LENGTH_SHORT).show();
        }

    }

    public void removeB(View view) {

        Fragment fragmentTwo = manager.findFragmentByTag("B");
        FragmentTransaction transaction = manager.beginTransaction();

        if (fragmentTwo != null) {
            transaction.remove(fragmentTwo).addToBackStack(null).commit();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Selection", Toast.LENGTH_SHORT).show();
        }

    }

    public void ReplaceAtoB(View view) {

        FragmentTwo fragmentTwo = new FragmentTwo();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_place, fragmentTwo, "B").addToBackStack(null).commit();

    }

    public void ReplaceBtoA(View view) {

        FragmentOne fragmentOne = new FragmentOne();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_place, fragmentOne, "A").addToBackStack(null).commit();

    }

    public void attachA(View view) {

        Fragment fragmentOne = manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();

        if (fragmentOne != null) {

            transaction.attach(fragmentOne).addToBackStack(null).commit();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Selection", Toast.LENGTH_SHORT).show();
        }

    }

    public void detachA(View view) {

        Fragment fragmentOne = manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();

        if (fragmentOne != null) {

            transaction.detach(fragmentOne).addToBackStack(null).commit();
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Selection", Toast.LENGTH_SHORT).show();
        }

    }

}