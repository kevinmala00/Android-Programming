package com.androidprogramming.fragmentexampleapp;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NavigationFragment extends Fragment {

    public NavigationFragment(){
        super();
    }

    public NavigationFragment(int contentLayoutId) {
        super(contentLayoutId);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Log.d("debug", "NavigationFragment onCreate, called child fragment list " + getChildFragmentManager().getFragments());

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //Log.d("debug", "NavigationFragment onAttach called, called child fragment list " + getChildFragmentManager().getFragments());
    }

    @Override
    public void onStart() {
        super.onStart();
        //Log.d("debug", "NavigationFragment onStart called,called child fragment list " + getChildFragmentManager().getFragments());

    }

    @Override
    public void onResume() {
        super.onResume();
       // Log.d("debug", "NavigationFragment onResume called");

    }

    @Override
    public void onStop() {
        super.onStop();
        //Log.d("debug", "NavigationFragment onStop called");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //Log.d("debug", "NavigationFragment onDestroy called");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        //Log.d("debug", "NavigationFragment onDestroy called");

    }
}
