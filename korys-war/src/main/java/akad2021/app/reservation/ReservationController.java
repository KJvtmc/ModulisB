package akad2021.app.reservation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import akad2021.app.PagingData;
import io.swagger.annotations.Api;

@RestController
@Api(tags = "reservation-service")
@RequestMapping(value = "/api/reservations")
public class ReservationController {
	@Autowired
	private  ReservationService reservationService;
	@Autowired
	@Qualifier("pagingData")
	private PagingData pagingData;
	
    

}
