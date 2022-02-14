package akad2021.app.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReservationService {
	@Autowired
	private ReservationDao reservationDao;
	

	/**
	 * Delete reservation by id
	 *
	 * @param id
	 * 
	 */
	@Transactional
	public ResponseEntity<String> deleteReservation(Long id) {

		Reservation reservation = reservationDao.getById(id);

		if ( reservation != null ) {

			 reservationDao.delete( reservation);

			return new ResponseEntity<>("Deleted", HttpStatus.OK);
		}
		return new ResponseEntity<>("Error - could not delete", HttpStatus.NOT_FOUND);
	}

//	/**
//	 * Create an apartment
//	 *
//	 * 
//	 * @param data
//	 * @return apartment or null 
//	 */
//	@Transactional
//	public Reservation createNewApartment( ReservationDTO data) {
//
//		if (data!=null) {
//			Reservation reservation = new Reservation();
//
//			reservation.setName(data.getName());
//			reservation.setLocation(data.getLocation());
//			reservation.setFloor(data.getFloor());
//			reservation.setBedrooms(data.getBedrooms());
//			reservation.setCar_spaces(data.getCar_spaces());;
//			reservation.setLiving_spaces(data.getLiving_spaces());
//			reservation.setBathrooms(data.getBathrooms());
//			reservation.setArea(data.getArea());
//			reservation.setPrice(data.getPrice());
//			reservation.setStatus(data.getStatus());
//			reservation.setDate_sell_from(data.getDate_sell_from());
//			reservation.setDate_sell_to(data.getDate_sell_to());
//			reservation.setCreated_at();
//			reservation.setUpdated_at(data.getUpdated_at());
//	
//		
//			reservation = reservationDao.saveAndFlush(reservation);
//
//			return reservation;
//		} else{
//			return null;
//		}
//	}

	public ReservationDao getReservationDao() {
		return reservationDao;
	}


	public void setReservationDao(ReservationDao reservationDao) {
		this.reservationDao = reservationDao;
	}

	public Page<Reservation> getPageOfAllReservations(Pageable pageable) {
		
		return reservationDao.findAll(pageable);
	}

	

}
