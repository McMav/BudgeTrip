package com.maverick.budgettrip.data;

import java.util.List;

public class Day {

	private String mNotes;
	private List<Category> mCategories;
	private double mTotalAmount;

	public Day(String notes) {
		mNotes = notes;
	}

	public void setNotes(String notes) {
		mNotes = notes;
	}

	public String getNotes() {
		return mNotes;
	}

	public List<Category> getCategories() {
		return mCategories;
	}

	public void addCategory(Category category) {
		mCategories.add(category);
	}

	public void removeCategory(Category category) {
		mCategories.remove(category);
	}

	public void setTotalAmount(double amount) {
		mTotalAmount = amount;
	}

	public double getTotalAmount() {
		return mTotalAmount;
	}
}
