package akad2021.app.apartment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ApartmentService {
	@Autowired
	private ApartmentDao apartmentDao;
	

	/**
	 * Delete apartment by id
	 *
	 * @param id
	 * 
	 */
	@Transactional
	public ResponseEntity<String> deleteApartment(Long id) {

		Apartment apartment = apartmentDao.getById(id);

		if ( apartment != null ) {

			 apartmentDao.delete( apartment);

			return new ResponseEntity<>("Dteleted apartment", HttpStatus.OK);
		}
		return new ResponseEntity<>("Error - could not delete", HttpStatus.NOT_FOUND);
	}

	/**
	 * Create an apartment
	 *
	 * 
	 * @param data
	 * @return apartment or null 
	 */
	@Transactional
	public Apartment createNewApartment( ApartmentDTO data) {

		if (data!=null) {
			Apartment apartment = new Apartment();

			apartment.setName(data.getName());
			apartment.setLocation(data.getLocation());
			apartment.setFloor(data.getFloor());
			apartment.setBedrooms(data.getBedrooms());
			apartment.setCar_spaces(data.getCar_spaces());;
			apartment.setLiving_spaces(data.getLiving_spaces());
			apartment.setBathrooms(data.getBathrooms());
			apartment.setArea(data.getArea());
			apartment.setPrice(data.getPrice());
			apartment.setStatus(data.getStatus());
			apartment.setDate_sell_from(data.getDate_sell_from());
			apartment.setDate_sell_to(data.getDate_sell_to());
			apartment.setCreated_at();
			apartment.setUpdated_at(data.getUpdated_at());
			apartment.setReservation(data.getReservation());
	
		
			apartment = apartmentDao.saveAndFlush(apartment);

			return apartment;
		} else{
			return null;
		}
		

	}

	public ApartmentDao getCentrasDao() {
		return apartmentDao;
	}


	public void setCentrasDao(ApartmentDao apartmentDao) {
		this.apartmentDao = apartmentDao;
	}

	public Page<Apartment> getPageOfApartments(Pageable pageable) {
		
		return apartmentDao.findAll(pageable);
	}

	public Page<Apartment> findAllApartmentsWithStatusAvailable(Pageable pageable) {

		return apartmentDao.findAllApartmentsWithStatusAvailable( pageable);
	}

}
