package com.food.delivery.entity;

import java.util.List;

public class HotelObject {

	private int hotelId;
	private String hotelName;
	private String location;
	private List<FoodItem> menu;
	private int rating;
	

	public HotelObject(int int1, String string, int int2) {
		// TODO Auto-generated constructor stub
	}

	public HotelObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the hotelId
	 */
	public int getHotelId() {
		return hotelId;
	}

	/**
	 * @param hotelId
	 *            the hotelId to set
	 */
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * @param hotelName
	 *            the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the menu
	 */
	public List<FoodItem> getMenu() {
		return menu;
	}

	/**
	 * @param menu
	 *            the menu to set
	 */
	public void setMenu(List<FoodItem> menu) {
		this.menu = menu;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
