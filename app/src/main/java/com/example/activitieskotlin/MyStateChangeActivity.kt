package com.example.activitieskotlin

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MyStateChangeActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        // Initialize Activity and inflate the UI.
        Log.d("MyStateChangeActivity", "onCreate()");
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("MyStateChangeActivity", "onRestoreInstanceState");
    }

    override fun onRestart() {
        super.onRestart();
        // Load changes knowing that the Activity has already
        // been visible within this process.
        Log.d("MyStateChangeActivity", "onRestart");
    }

    // Called at the start of the visible lifetime.
    override fun onStart() {
        super.onStart();
        // Apply any required UI change now that the Activity is visible.
        Log.d("MyStateChangeActivity", "onStart");
    }

    // Called at the start of the active lifetime.
    override fun onResume() {
        super.onResume();
        // Resume any paused UI updates, threads, or processes required
        // by the Activity but suspended when it was inactive.
        Log.d("MyStateChangeActivity", "onResume");
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate and
        // onRestoreInstanceState if the process is
        // killed and restarted by the run time.
        super.onSaveInstanceState(savedInstanceState);
        Log.d("MyStateChangeActivity", "onSaveInstanceState");
    }

    // Called at the end of the active lifetime.
    override fun onPause() {
        // Suspend UI updates, threads, or CPU intensive processes
        // that don't need to be updated when the Activity isn't
        // the active foreground Activity.
        super.onPause();
        Log.d("MyStateChangeActivity", "onPause");
    }

    // Called at the end of the visible lifetime.
    override fun onStop() {
        // Suspend remaining UI updates, threads, or processing
        // that aren't required when the Activity isn't visible.
        // Persist all edits or state changes
        // as after this call the process is likely to be killed.
        super.onStop();
        Log.d("MyStateChangeActivity", "onStop");
    }

    // Sometimes called at the end of the full lifetime.
    override fun onDestroy() {
        // Clean up any resources including ending threads,
        // closing database connections etc.
        super.onDestroy();
        Log.d("MyStateChangeActivity", "onDestroy");
    }
}
