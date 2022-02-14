package akad2021.app.reservation;

import java.time.LocalDate;

import akad2021.app.apartment.Apartment;

public class ReservationDTO {
	
	private String first_name;
	
	private String last_name;

	private String email;

	private String phone;

	private String message;

	private LocalDate reserved_at;
	
	private LocalDate created_at;
	
	private LocalDate updated_at;
	
	private Apartment apartment;
	
	
	public ReservationDTO() {
	}


	public ReservationDTO(String first_name, String last_name, String email, String phone, String message,
			LocalDate reserved_at, LocalDate created_at, LocalDate updated_at, Apartment apartment) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone = phone;
		this.message = message;
		this.reserved_at = reserved_at;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.apartment = apartment;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public LocalDate getReserved_at() {
		return reserved_at;
	}


	public void setReserved_at(LocalDate reserved_at) {
		this.reserved_at = reserved_at;
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


	public Apartment getApartment() {
		return apartment;
	}


	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}




}
