package akad2021.app.apartment;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ApartmentDao extends JpaRepository<Apartment, Long> {


	@Query("SELECT a FROM Apartment a WHERE a.status=0")
	Page<Apartment> findAllApartmentsWithStatusAvailable( Pageable pageable);
	
	
//	@Query("INSERT INTO Reservation SELECT * FROM CSVREAD(C:\\Users\\konkursas\\Desktop\\Naujas aplankas\\korys-app\\korys-war\\src\\main\\resources) ")
//	void insertIntoTableFromCSV();

}
