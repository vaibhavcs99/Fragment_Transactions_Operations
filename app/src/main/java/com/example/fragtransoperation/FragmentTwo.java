package com.example.fragtransoperation;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentTwo extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("fragtransoperation","Fragment B OnCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("fragtransoperation","Fragment B OnAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("fragtransoperation","Fragment B OnCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("fragtransoperation","Fragment B onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("fragtransoperation","Fragment B OnStart");
        super.onStart();
    }

    @Override
    public void onPause() {
        Log.d("fragtransoperation","Fragment B OnPause");
        super.onPause();
    }


    @Override
    public void onResume() {
        Log.d("fragtransoperation","Fragment B OnResume");
        super.onResume();
    }

    @Override
    public void onStop() {
        Log.d("fragtransoperation","Fragment B OnStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d("fragtransoperation","Fragment B onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("fragtransoperation","Fragment B OnDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("fragtransoperation","Fragment B OnDetach");
        super.onDetach();
    }
}