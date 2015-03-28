package me.li2.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class CrimeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);
        
        // Get the FragmentManager.
        FragmentManager fm = getSupportFragmentManager();
        // Ask the FragmentManager for the fragment with a container view ID, 
        // If this fragment is already in the list, the FragmentManager will return it,
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
        
        // Or create a new CrimeFragment,
        if (fragment == null) {
            fragment = new CrimeFragment();
            // Create a new fragment transaction, include one add operation in it, and then commit it.
            fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
        }
    }
}