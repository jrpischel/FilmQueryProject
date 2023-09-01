package com.skilldistillery.filmquery.entities;

import java.util.Objects;

public class Film {
	
	private int id, releaseYear, languageID, rentalDuration, length ;
	private String title, description, rating, specialFeatures;
	private double rentalRate, replacementCost;
	
	public Film() {};
	
	public Film(int id, int releaseYear, int languageID, int rentalDuration, int length, String title,
			String description, String rating, String specialFeatures, double rentalRate, double replacementCost) {
		this.id = id;
		this.releaseYear = releaseYear;
		this.languageID = languageID;
		this.rentalDuration = rentalDuration;
		this.length = length;
		this.title = title;
		this.description = description;
		this.rating = rating;
		this.specialFeatures = specialFeatures;
		this.rentalRate = rentalRate;
		this.replacementCost = replacementCost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public int getLanguageID() {
		return languageID;
	}
	public void setLanguageID(int languageID) {
		this.languageID = languageID;
	}
	public int getRentalDuration() {
		return rentalDuration;
	}
	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getSpecialFeatures() {
		return specialFeatures;
	}
	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}
	public double getRentalRate() {
		return rentalRate;
	}
	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}
	public double getReplacementCost() {
		return replacementCost;
	}
	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Film ID " + id + " Released " + releaseYear + " Language ID: " + languageID + " Rental Duration: "
				+ rentalDuration + " Length: " + length + " Title: " + title + " Description: " + description
				+ " Rating: " + rating + " Special Features: " + specialFeatures + " Rental Rate: " + rentalRate
				+ " Replacement Cost: " + replacementCost;
	}
	

	
}
