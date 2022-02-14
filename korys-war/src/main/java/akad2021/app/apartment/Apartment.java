package akad2021.app.apartment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import akad2021.app.reservation.Reservation;

@Entity
@Table(name = "apartment")
public class Apartment{
 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column
	@NotNull
	@Length(min = 1, max = 255)
	private String name;
	@Column
	@NotNull
	@Length(min = 1, max = 255)
	private String location;
	@Column
	@NotNull
	private int floor;
	@Column
	@NotNull
	private int bedrooms;
	@Column
	@NotNull
	private int car_spaces;
	@Column
	private int living_spaces;
	@Column
	private int bathrooms;
	@Column
	@NotNull
	private int area;
	@Column
	@NotNull
	private float price;
	@Column
	@NotNull
	private Status status;
	@Column
	private LocalDate date_sell_from;
	@Column
	private LocalDate date_sell_to;
	@Column
	private LocalDate created_at;
	@Column
	private LocalDate updated_at;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "reservation_id")
	private Reservation reservation;

	
	public Apartment() {
	}


	public Apartment(@NotNull @Length(min = 1, max = 255) String name, @NotNull @Length(min = 1, max = 255) String location,
		@NotNull int floor, @NotNull int bedrooms, @NotNull int car_spaces, int living_spaces, int bathrooms,
		@NotNull int area, @NotNull float price, @NotNull Status status, LocalDate date_sell_from,
		LocalDate date_sell_to, LocalDate created_at, LocalDate updated_at) {
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


	public void setCreated_at() {
		this.created_at =LocalDate.now();
	}


	public LocalDate getUpdated_at() {
		return updated_at;
	}


	public void setUpdated_at(LocalDate updated_at) {
		this.updated_at = updated_at;
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



	public Long getId() {
		return id;
	}


	public Reservation getReservation() {
		return reservation;
	}


	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	

	
	
}
