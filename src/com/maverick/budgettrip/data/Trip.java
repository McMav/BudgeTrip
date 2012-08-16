package com.maverick.budgettrip.data;

import java.util.ArrayList;
import java.util.List;

public class Trip {

	private String mName;
	private List<Day> mDays;
	private double mTotalAmount;
	
	public Trip(String name, double amount) {
		mName = name;
		mTotalAmount = amount;
		mDays = new ArrayList<Day>();
	}

	public void setName(String name) {
		mName = name;
	}
	
	public String getName() {
		return mName;
	}

	
	public void addDay(Day day) {
		mDays.add(day);
	}
	
	public void removeDay(Day day) {
		mDays.remove(day);
	}
	
	public List<Day> getDays() {
		return mDays;
	}
	
	public void setTotalAmount(double amount) {
		mTotalAmount = amount;
	}
	
	public double getTotalAmount() {
		return mTotalAmount;
	}
}
