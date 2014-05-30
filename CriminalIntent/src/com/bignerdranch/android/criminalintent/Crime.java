package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
	
	private Date mDate;
	private boolean mSolved;
	
	

	private UUID mId;
	private String mTitle;
	
	public Crime(){
		
		mDate = new Date();
		
		//generate unique identifier
		mId = UUID.randomUUID();
	}
	
	public boolean isSolved() {
		return mSolved;
	}

	public void setSolved(boolean solved) {
		mSolved = solved;
	}
	public Date getDate() {
		return mDate;
	}

	public void setDate(Date date) {
		mDate = date;
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String title) {
		mTitle = title;
	}

	public UUID getId() {
		return mId;
	}
}
