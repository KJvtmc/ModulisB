package akad2021.app.apartment;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import akad2021.app.PagingData;
import akad2021.app.reservation.ReservationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(tags = "apartment-service")
@RequestMapping(value = "/api/apartments")
public class ApartmentController {
	@Autowired
	private ApartmentService apartmentService;
	@Autowired
	private ReservationService reservationService;
	@Autowired
	@Qualifier("pagingData")
	private PagingData pagingData;

	/**
	 *
	 * Create new apartment
	 *
	 * @param data
	 * @return message
	 */
//	@Secured({ "ROLE_USER" })
	@PostMapping("/new")
	@ApiOperation(value = "Create new apartment")
	public ResponseEntity<String> createNewApartment(
			@ApiParam(value = "Apartment", required = true) @Valid @RequestBody ApartmentDTO data) {

//		String currentUsername = SecurityContextHolder.getContext().getAuthentication().getName();

		Apartment apartment = apartmentService.createNewApartment(data);

		if (apartment != null) {
			return new ResponseEntity<>("Apartment has been created", HttpStatus.OK);

		}

		return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
	}

	/**
	 *
	 * Get page apartments ordered by price asc
	 *
	 * @param page
	 * @param size
	 * @return page of applications
	 */
//	@Secured({ "ROLE_MANAGER" })
	@GetMapping("/apartments/price/asc")
	@ApiOperation(value = "Get a page of 15 apartments by price asc order")
	public Page<Apartment> getPageFromSubmittedApartmentsByPriceAsc(@RequestParam("page") int page) {

		List<Order> orders = new ArrayList<>();
		orders.add(new Order(Direction.ASC, "price"));
		orders.add(new Order(Direction.ASC, "name").ignoreCase());

		Pageable pageable = PageRequest.of(page, 15, Sort.by(orders));

		return apartmentService.getPageOfApartments(pageable);
	}

	/**
	 *
	 * Get page of apartments ordered by price desc
	 *
	 *
	 * @param page
	 * @param size
	 * @return page of applications
	 */
//	@Secured({ "ROLE_MANAGER" })
	@GetMapping("/apartments/price/desc")
	@ApiOperation(value = "Get a page of 15 apartments by price desc order")
	public Page<Apartment> getPageFromSubmittedApartmentsByPriceDesc(@RequestParam("page") int page) {

		List<Order> orders = new ArrayList<>();
		orders.add(new Order(Direction.DESC, "price"));
		orders.add(new Order(Direction.ASC, "name").ignoreCase());

		Pageable pageable = PageRequest.of(page, 15, Sort.by(orders));

		return apartmentService.getPageOfApartments(pageable);
	}

	/**
	 * Get page of apartments filtered by status available
	 *
	 * @param page
	 * @return page of available apartments
	 */
//	@Secured({ "ROLE_MANAGER" })
	@GetMapping("/apartments/available")
	@ApiOperation(value = "Get a page of available apartments")
	public Page<Apartment> getApartmentPageFilteredByStatus(@RequestParam("page") int page) {

		List<Order> orders = new ArrayList<>();
		orders.add(new Order(Direction.ASC, "created_at").ignoreCase());
		orders.add(new Order(Direction.ASC, "name").ignoreCase());

		Pageable pageable = PageRequest.of(page, 15, Sort.by(orders));

		return apartmentService.findAllApartmentsWithStatusAvailable(pageable);
	}

//	/**
//	 * reserve apartment
//	 *
//	 * @param id
//	 * 
//	 */
//	@GetMapping("/apartments/{id}/reserve")
//	@ApiOperation(value = "Reserve apartment")
//	public ResponseEntity<String> reserveApartment(
//			@RequestParam("id") @Valid @RequestBody ReservationDTO data, Long id) {

	// Nebaigta
//		apartmentService.findApartmentById
//		if apartment.status!=null{
//			return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
//		}esle{
//			Reservation reservation = reservationService.createNewReservation(data);
//			apartments.setStatus(Status.RESERVED);
//			return new ResponseEntity<>("reserved", HttpStatus.OK);
//		}
//		

}
