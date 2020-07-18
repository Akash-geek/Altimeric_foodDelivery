package com.food.delivery.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.food.delivery.entity.HotelObject;

public class HotelObjectRowMapper implements RowMapper<HotelObject> {

	@Override
	public HotelObject mapRow(ResultSet rs, int rowNum) throws SQLException {

		HotelObject hotelObject = new HotelObject();
		hotelObject.setHotelId(rs.getInt("HOTEL_ID"));
		hotelObject.setHotelName(rs.getString("HOTEL_NAME"));
		hotelObject.setRating(rs.getInt("RATING"));
		return hotelObject;

	}
}
