package com.food.delivery;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.food.delivery.entity.Dispatch;
import com.food.delivery.entity.HotelObject;
import com.food.delivery.service.FoodServiceImpl;

@Controller
@RequestMapping(path = "/fooldSystem")
public class CatalogController {

	@Autowired
	private FoodServiceImpl foodServiceImpl;

	@GetMapping("/getHotels/{locationId}")
	public List<HotelObject> getHotelLocation(@PathVariable int locationId) {
		List<HotelObject> hotelList = new ArrayList<HotelObject>();
		hotelList = foodServiceImpl.getHotelList(locationId);
		return hotelList;
	}

	@PostMapping("/createOrder/{hotelId}")
	public Dispatch createOrder(@PathVariable int hotelId, int foodId, int userId) {
		Dispatch Dispatch = new Dispatch();
		Dispatch = foodServiceImpl.createOrder(hotelId, foodId, userId);
		return Dispatch;
	}

	@PutMapping("/updateOrder/{orderId}")
	public Dispatch updateOrder(@PathVariable int orderId, int foodId, int userId) {
		Dispatch Dispatch = new Dispatch();
		Dispatch = foodServiceImpl.updateOrder(orderId, foodId, userId);
		return Dispatch;
	}

	@PutMapping("/canceleOrder/{orderId}")
	public Dispatch cancelOrder(@PathVariable int orderId, int userId) {
		Dispatch Dispatch = new Dispatch();
		Dispatch = foodServiceImpl.cancelOrder(orderId, userId);
		return Dispatch;
	}

}
