package com.bignerdranch.android.criminalintent;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CrimeListFragment extends ListFragment {
	private static String TAG = "CrimeListFragment";
	private ArrayList<Crime> mCrimes;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		getActivity().setTitle(R.string.crimes_title);
		mCrimes = CrimeLab.get(getActivity()).getCrimes();
		//what does getActivity return?
		
		//start of debug message section-----------------
		//Log.d(TAG, "this is CrimeListFragment\ngetActivity() returns:\n"  + getActivity().toString());
		//Toast.makeText(getActivity().getBaseContext(),  "getActivity() returns: " + getActivity().toString(),  Toast.LENGTH_LONG).show();
		//end of debug message section-----------------
		
		ArrayAdapter<Crime> adapter = new ArrayAdapter<Crime>(getActivity(), android.R.layout.simple_list_item_1, mCrimes);
		setListAdapter(adapter);
		
		
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id){
		Crime c = (Crime)getListAdapter().getItem(position);
		Log.d(TAG, c.getTitle() + " was clicked");
	}
}
