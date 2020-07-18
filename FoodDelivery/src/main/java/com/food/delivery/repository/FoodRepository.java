package com.food.delivery.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.food.delivery.entity.HotelObject;
import com.food.delivery.entity.OrderItem;
import com.food.delivery.mapper.HotelObjectRowMapper;

public class FoodRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<HotelObject> getHotels(int locId) {

		String sql = "SELECT * FROM HOTEL_TABLE WHERE LOCID = ?";

		List<HotelObject> hotels = jdbcTemplate.query(sql, new HotelObjectRowMapper());

		return hotels;

	}

	public boolean createOrder(OrderItem orderItem) {

		String sql = "INSERT INTO ORDERS (ORDER_ID, USER_ID, PAYMENT_ID, HOTEL_ID) VALUES (?, ?, ?, ?)";

		int count = jdbcTemplate.update(sql, new Object[] { orderItem.getOrderId(), orderItem.getUserId(),
				orderItem.getPaymentId(), orderItem.getHotelId() });

		return count > 0 ? Boolean.TRUE : Boolean.FALSE;
	}

	public boolean updateOrders(int orderId, int foodId, int userId) {

		int count = jdbcTemplate.update("UPDATE ORDERS SET FOOD_ID = ? WHERE ORDER_ID = ? AND USER_ID = ?", foodId,
				orderId, userId);
		return count > 0 ? Boolean.TRUE : Boolean.FALSE;
	}

	public boolean cancelOrder(int orderId, int userId) {

		int count = jdbcTemplate.update("DELETE ORDERS WHERE ORDER_ID = ? AND USER_ID = ?", orderId, userId);

		return count > 0 ? Boolean.TRUE : Boolean.FALSE;
	}

}
