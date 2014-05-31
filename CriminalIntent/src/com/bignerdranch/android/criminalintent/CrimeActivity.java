package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;

public class CrimeActivity extends SingleFragmentActivity {
	//private static String TAG = "CrimeActivity";
	/*
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment);
		
		FragmentManager fm = getSupportFragmentManager();
		Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
		
		if(fragment == null){
			fragment = new CrimeFragment();
			fm.beginTransaction()
					.add(R.id.fragmentContainer, fragment)
					.commit();
		}
	}
	*/
	
	@Override
	protected Fragment createFragment(){
		//Log.d(TAG, "this is CrimeActivity ", new Exception());
		return new CrimeFragment();
	}
	
}
