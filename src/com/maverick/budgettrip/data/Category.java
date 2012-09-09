package com.maverick.budgettrip.data;

import java.io.Serializable;

import android.os.Parcel;
import android.os.Parcelable;

public class Category implements Parcelable, Serializable {
	private String mName;
	private double mAmount;

	public Category(String name, double amount) {
		mName = name;
		mAmount = amount;
	}

	public void setName(String name) {
		mName = name;
	}

	public String getName() {
		return mName;
	}

	public void setAmount(double amount) {
		mAmount = amount;
	}

	public double getAmount() {
		return mAmount;
	}

	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		
	}
}
