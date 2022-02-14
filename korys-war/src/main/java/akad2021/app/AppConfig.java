package akad2021.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@ImportResource({"classpath*:application-context.xml"})


@Configuration
public class AppConfig {
	

	
	//Boolean
	
	@Bean(name="statusas")
	public Boolean getStatusas() {
		return false;
	}
	
	//Strings
	
	@Bean(name="pavadinimas")
	public String getPavadinimas() {
		return "DefaultTitle";
	}
	
	@Bean(name="vieta")
	public String getVieta() {
		return "DefaultAddress";
	}
	
	@Bean(name="vakcinosPavadinimas")
	public String getVakcinosPavadinimas() {
		return "DefaultVaccineTitle";
	}
	
	@Bean(name="gamintojas")
	public String getGamintojas() {
		return "DefaultVaccineSupplier";
	}
	
	@Bean(name="itemTitle")
	public String getItemTitle() {
		return "DefaultTitle";
	}
	
	@Bean(name="imgNuoroda")
	public String getPriceString() {
		return "hospital.jpg";
	}
	
	@Bean(name="aprasymas")
	public String getQuantityString() {
		return "Vakcinacijos centro aprasymas bus patikslintas netrukus";
	}
	
	@Bean(name="itemFirstName")
	public String getFirstName() {
		return "DefaultFirstName";
	}
	
	@Bean(name="itemLastName")
	public String getLastNameString() {
		return "DefaultLastName";
	}

	//Numbers
	
	@Bean(name="partija")
	public Long getPartija() {
		return (long) 0;
	}
	

	@Bean(name="vakcinosKiekis")
	public int getVakcinosKiekis() {
		return 0;
	}
	
	@Bean(name="centroNr")
	public Long getCentroNr() {
		return (long) 100000001;
	}
	
	@Bean(name="kabinosNr")
	public Long getKabinosNr() {
		return (long) 200000001;
	}
	
	@Bean(name="itemPriceD")
	public double getPriceDouble() {
		return 0;
	}
	
	@Bean(name="itemQuantityInt")
	public int getQuantityInt() {
		return 0;
	}
	
	@Bean(name="id")
	public Long getUserId() {
		return (long) 400000000;
	}
	
	
}