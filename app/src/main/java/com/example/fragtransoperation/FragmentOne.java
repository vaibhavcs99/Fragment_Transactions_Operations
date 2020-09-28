package com.example.fragtransoperation;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentOne extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("fragtransoperation","Fragment A OnCreateView");
        return inflater.inflate(R.layout.fragment_one, container, false);
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("fragtransoperation","Fragment A OnCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("fragtransoperation","Fragment A OnAttach");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("fragtransoperation","Fragment A onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("fragtransoperation","Fragment A OnStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("fragtransoperation","Fragment A OnResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("fragtransoperation","Fragment A OnPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("fragtransoperation","Fragment A OnStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d("fragtransoperation","Fragment A onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("fragtransoperation","Fragment A OnDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("fragtransoperation","Fragment A OnDetach");
        super.onDetach();
    }

}