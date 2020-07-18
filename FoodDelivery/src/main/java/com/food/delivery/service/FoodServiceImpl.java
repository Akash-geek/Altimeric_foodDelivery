package com.food.delivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.food.delivery.entity.Dispatch;
import com.food.delivery.entity.HotelObject;
import com.food.delivery.entity.OrderItem;
import com.food.delivery.repository.FoodRepository;

public class FoodServiceImpl {

	@Autowired
	private FoodRepository foodRepository;
	
	public List<HotelObject> getHotelList(int locId) {
		
		List<HotelObject> hotelList = foodRepository.getHotels(locId);
		
		return hotelList;
	}

	public Dispatch createOrder(int hotelId, int foodId, int userId) {
		OrderItem orderItem = new OrderItem(hotelId,foodId, userId);
		Dispatch dispatch = new Dispatch();
		boolean dispatchValue = foodRepository.createOrder(orderItem);
		if(dispatchValue) 
			dispatch.setSuccess("SUCCESS"); 
		else dispatch.setFailure("FAILURE");
		return dispatch;
	}

	public Dispatch updateOrder(int orderId, int foodId, int userId) {
		Dispatch dispatch = new Dispatch();
		boolean dispatchValue = foodRepository.updateOrders(orderId, foodId, userId);
		if(dispatchValue) 
			dispatch.setSuccess("SUCCESS"); 
		else dispatch.setFailure("FAILURE");
		return dispatch;
	}

	public Dispatch cancelOrder(int orderId, int userId) {
		Dispatch dispatch = new Dispatch();
		boolean dispatchValue = foodRepository.cancelOrder(orderId, userId);
		if(dispatchValue) 
			dispatch.setSuccess("SUCCESS"); 
		else dispatch.setFailure("FAILURE");
		return dispatch;
	}
	

}
