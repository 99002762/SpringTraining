package com.hotelapp.service;

import com.hotelapp.model.Hotel;
import java.util.List;

public interface HotelService {
	
	
	List<Hotel> getAllHotels();
	List<Hotel> getByCity(String city);
	List<Hotel> getByCuisine(String cuisine);
	Hotel getById(int id);

}
