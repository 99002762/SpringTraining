package com.hotelapp.dao;

import java.util.Arrays;
import java.util.List;

import com.hotelapp.model.Hotel;

public class HotelDAOImpl implements HotelDAO {

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotelList();
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList = showHotelList();
		for(Hotel hotel : showHotelList()) {
			if(hotel.getCity().equals(city)) {
				newHotelList.add(hotel);
			}
			
		}
		return newHotelList;
		
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		//return null;
		List<Hotel> newHotelList = showHotelList();
		for(Hotel hotel : showHotelList()) {
			if(hotel.getCuisine().equals(cuisine)) {
				newHotelList.add(hotel);
			}
			
		}
		return newHotelList;
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		//return null;
		for(Hotel hotel : showHotelList()) {
			if(hotel.getHotelId()==(id)) 
				return hotel;
		}
		return null;
	}
	
	private List<Hotel> showHotelList(){
		
		//return null;
		return Arrays.asList(new Hotel("kalyani",123,"Mysore","Indian"),
				new Hotel("sandeepani",124,"Banglore","Chineese"),
				new Hotel("surabhi",125,"Hyderabad","southindian"),
				new Hotel("akshaya",126,"Chennai","Italian"));
	}

}
