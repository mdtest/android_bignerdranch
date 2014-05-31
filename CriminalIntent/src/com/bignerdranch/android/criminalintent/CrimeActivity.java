package com.bignerdranch.android.criminalintent;

import java.util.UUID;

import android.support.v4.app.Fragment;

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
	public static final String EXTRA_CRIME_ID = 
			"com.bignerdranch.android.criminalintent.crime_id"; 
	
	@Override
	protected Fragment createFragment(){
		//Log.d(TAG, "this is CrimeActivity ", new Exception());
		//return new CrimeFragment();
		
		UUID crimeId = (UUID)getIntent().getSerializableExtra(EXTRA_CRIME_ID);
		return CrimeFragment.newInstance(crimeId);
	}
	
}
