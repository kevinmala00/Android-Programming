package com.example.androidprogramming.theory;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

/**
 * Represent skeleton of activity class implementation
 *
 */
public class LifecycleStatesActivity extends AppCompatActivity {

    //called at the start of the entire lifetime
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // declare UI with setContentView() method
        // initialize activity (instantiate class-scope variables)
        // create views with findViewByid() method
        // bind data to lists

    }

    // Called before subsequent lifetimes for an activity process.
    // That is, before an Activity returns to being visible
    // having previously been hidden
    @Override
    protected void onRestart() {
        super.onRestart();

        // Load changes knowing the Activity has already
        // been visible within the process

    }

    // Called at the start of the visible lifetime
    @Override
    protected void onStart(){
        super.onStart();

        // Apply required UI change now that the activity is visible.
        // this is where you'd typically start any processes that
        // are required to ensure your UI is appropriately populated and updated

    }


    // Called after onStart has finished, in cases where Activity is
    // started after having last been destroyed by the runtime rather then
    // through user or programmatic action (finish() call)
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Restore the UI from savedInstanceState.
        // This bundle has also been passed to onCreate()
        // Will only be called if the activity has been
        // killed by the system since it was last visible
    }



    // called at the start of the foreground lifetime
    @Override
    protected void onResume() {
        super.onResume();

        // Resume any paused UI updates, threads, or processes require by the activity
        // but suspended when it becomes inactive.
        // At this stage activity is in foreground and receiving input
        // from user action

    }

    //called at the end of foreground lifetime
    @Override
    protected void onPause() {
        super.onPause();

        // Suspend Ui updates, threads, or CPU intensive processes
        // that don't need to be updated when the activity isn't in foreground
        // Note paused activity may still visible.

    }


    // Called when appropriate to save UI state changes
    // at the end of foreground lifetime
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        // Save UI state changes  to the outState
        // This bundle will be passed to onCreate() and onRestoreSavedInstanceState()
        // if the process is killed and restarted by runtime.
        // Note this method may not be called if the runtime determines
        // that activity is permanently terminated

    }


    // Called at the end of visible lifetime
    @Override
    protected void onStop() {
        super.onStop();
        //  Suspends remaining UI updates, threads, or processing
        // that aren't required when the activity isn't visible.
        // persist all edits or state changes as your Activity
        // may be killed at any time after onStop() has completed
    }

    // Sometimes called at the end of the entire lifetime
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // clean up any resources including ending threads,
        // closing database connection ...
    }

}