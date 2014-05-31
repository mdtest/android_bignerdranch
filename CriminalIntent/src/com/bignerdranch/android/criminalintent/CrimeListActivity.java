package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;
import android.util.Log;

public class CrimeListActivity extends SingleFragmentActivity {
	//private static String TAG = "CrimeListActivity";
	@Override
	protected Fragment createFragment() {
		// TODO Auto-generated method stub
		//Log.d(TAG, "this is CrimeListActivity ", new Exception());
		return new CrimeListFragment();
		
	}

}
