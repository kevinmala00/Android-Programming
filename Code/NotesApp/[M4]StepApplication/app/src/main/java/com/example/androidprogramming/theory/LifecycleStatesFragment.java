package com.example.androidprogramming.theory;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LifecycleStatesFragment extends Fragment {

    // Required empty public constructor
    public LifecycleStatesFragment() {
    }


    // Called when the fragment is attached to its parent activity
    @Override
    public void onAttach(@NonNull Context context){
        super.onAttach(context);
        // Get a reference to a context representing
        // the parent component
    }

    // Called to do the initial creation of the fragment
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        // Initialize the fragment
    }

    // Called when the fragment has been created in order for it to
    // create its user interface
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
        // Create, or inflate the fragment's UI, and return it
        // If the fragments has no UI return null

        // return inflater.inflate(R.layout.lifecycle_states_fragment, container, false)
    }

    // Called at the start of the visible lifetime
    @Override
    public void onStart() {
        super.onStart();
        // Apply any required UI change now that the fragment is visible
    }

    // Called at the start of the foreground lifetime
    @Override
    public void onResume() {
        super.onResume();
        // Resume any paused Ui updates, threads, or processes
        // required by the fragment but suspended when it became inactive (Not in foreground)
    }

    // Called at the end of foreground lifetime
    @Override
    public void onPause() {
        super.onPause();
        // Suspend UI updates, threads, or CPU intensive processes
        // that don't need to be updated when the fragment isn't
        // isn't the active foreground fragment
        // Persist all edits and state changes
        // as after this call the process is likely to be killed
    }

    // Called to save UI state changes at the
    // end of foreground lifetime
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save UI state changes to the outState
        // this bundle will be passed to onCreate, onCreateView
        // if the parent activity is killed and restarted
    }

    // called at the end of the visible lifetime
    @Override
    public void onStop() {
        super.onStop();
        // Suspend remaining UI updates, threads, or processing
        // that aren't required when the fragment isn't in foreground
    }

    // Called whe the fragment's view has been detached
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Clean up resources related to the view
    }

    // Called at the end of entire lifetime
    @Override
    public void onDestroy() {
        super.onDestroy();
        // Clean up any resources including ending threads,
        // closing database connections ...
    }

    // Called when the fragment has been detached from its parent activity
    @Override
    public void onDetach() {
        super.onDetach();
        // Clean up any references to the parent activity
        // including references to its views or classes. Typically setting
        // those references to null
    }
}
