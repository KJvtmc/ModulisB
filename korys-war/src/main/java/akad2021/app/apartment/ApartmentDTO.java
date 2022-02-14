package akad2021.app.apartment;

import java.time.LocalDate;

import akad2021.app.reservation.Reservation;

public class ApartmentDTO {
	
	public String name;
	
	public String location;

	public int floor;

	public int bedrooms;

	public int car_spaces;

	public int living_spaces;

	public int bathrooms;

	public int area;

	public float price;

	public Status status;

	private LocalDate date_sell_from;
	
	private LocalDate date_sell_to;
	
	private LocalDate created_at;
	
	private LocalDate updated_at;
	
	private Reservation reservation;
	
	public ApartmentDTO() {
	}


	public ApartmentDTO(String name, String location, int floor, int bedrooms, int car_spaces, int living_spaces,
			int bathrooms, int area, float price, Status status, LocalDate date_sell_from, LocalDate date_sell_to,
			LocalDate created_at, LocalDate updated_at,  Reservation reservation) {
		super();
		this.name = name;
		this.location = location;
		this.floor = floor;
		this.bedrooms = bedrooms;
		this.car_spaces = car_spaces;
		this.living_spaces = living_spaces;
		this.bathrooms = bathrooms;
		this.area = area;
		this.price = price;
		this.status = status;
		this.date_sell_from = date_sell_from;
		this.date_sell_to = date_sell_to;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.reservation = reservation;
	}

	

	public Reservation getReservation() {
		return reservation;
	}


	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getFloor() {
		return floor;
	}


	public void setFloor(int floor) {
		this.floor = floor;
	}


	public int getBedrooms() {
		return bedrooms;
	}


	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}


	public int getCar_spaces() {
		return car_spaces;
	}


	public void setCar_spaces(int car_spaces) {
		this.car_spaces = car_spaces;
	}


	public int getLiving_spaces() {
		return living_spaces;
	}


	public void setLiving_spaces(int living_spaces) {
		this.living_spaces = living_spaces;
	}


	public int getBathrooms() {
		return bathrooms;
	}


	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public LocalDate getDate_sell_from() {
		return date_sell_from;
	}


	public void setDate_sell_from(LocalDate date_sell_from) {
		this.date_sell_from = date_sell_from;
	}


	public LocalDate getDate_sell_to() {
		return date_sell_to;
	}


	public void setDate_sell_to(LocalDate date_sell_to) {
		this.date_sell_to = date_sell_to;
	}


	public LocalDate getCreated_at() {
		return created_at;
	}


	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}


	public LocalDate getUpdated_at() {
		return updated_at;
	}


	public void setUpdated_at(LocalDate updated_at) {
		this.updated_at = updated_at;
	}

	

}
