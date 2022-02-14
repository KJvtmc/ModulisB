package akad2021.app.reservation;

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
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import akad2021.app.apartment.Apartment;

@Entity
@Table(name = "reservation")
public class Reservation{
 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long reservation_id;
	@Column
	@NotNull
	@Length(min = 3, max = 60)
	private String first_name;
	@Column
	@NotNull
	@Length(min = 3, max = 60)
	private String last_name;
	@Column
	@NotNull
	@Length(min = 3, max = 255)
	private String email;
	@Column
	@NotNull
	@Length(min = 6, max = 20)
	@Pattern(regexp = "^\\+\\d{3,3} *\\d{3,3} *\\d{5,5}$")
	private String phone;
	@Column
	@Length(max = 5000)
	private String message;

	@Column
	private LocalDate reserved_at;
	@Column
	private LocalDate created_at;
	@Column
	private LocalDate updated_at;
	
	@OneToOne(mappedBy = "reservation")
	private Apartment apartment;
	

	
	public Reservation() {
	}

	public Reservation(@NotNull @Length(min = 3, max = 60) String first_name,
			@NotNull @Length(min = 3, max = 60) String last_name, @NotNull @Length(min = 3, max = 255) String email,
			@NotNull @Length(min = 6, max = 20) @Pattern(regexp = "^\\+\\d{3,3} *\\d{3,3} *\\d{5,5}$") String phone,
			@Length(max = 5000) String message, LocalDate reserved_at, LocalDate created_at, LocalDate updated_at) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone = phone;
		this.message = message;
		this.reserved_at = reserved_at;
		this.created_at = created_at;
		this.updated_at = updated_at;

	}



	public Long getReservation_id() {
		return reservation_id;
	}

	public void setReservation_id(Long reservation_id) {
		this.reservation_id = reservation_id;
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

	public LocalDate getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDate updated_at) {
		this.updated_at = updated_at;
	}


	public void setCreated_at() {
		this.created_at =LocalDate.now();
	}


	

}
