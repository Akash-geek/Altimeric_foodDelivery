package com.food.delivery.entity;

public class OrderItem {

	private int orderId;
	private int hotelId;
	private int foodItem;
	/**
	 * @return the foodItem
	 */
	public int getFoodItem() {
		return foodItem;
	}

	/**
	 * @param foodItem the foodItem to set
	 */
	public void setFoodItem(int foodItem) {
		this.foodItem = foodItem;
	}

	private int locationId;
	private int userId;
	private int paymentId;
	private static int o = 000;

	public OrderItem(int hotelId, int foodId, int userId) {
		// TODO Auto-generated constructor stub
		this.orderId = o++;
		this.hotelId = hotelId;
		this.foodItem = foodId;
		this.paymentId = o + orderId;

	}

	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
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
	 * @return the locationId
	 */
	public int getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId
	 *            the locationId to set
	 */
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the paymentId
	 */
	public int getPaymentId() {
		return paymentId;
	}

	/**
	 * @param paymentId
	 *            the paymentId to set
	 */
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

}
