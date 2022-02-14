package akad2021.app;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import akad2021.app.apartment.Apartment;
import akad2021.app.apartment.ApartmentDao;
import akad2021.app.apartment.Status;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class App extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(App.class);
	}

	@Bean
	CommandLineRunner commandLineRunner (ApartmentDao apartmentDao) {
		return args ->{
			var apartment = new Apartment("Uptown apartment","Uptown",1,2,1,1,1,50,200000,Status.AVAILABLE,null, null, null, null);
			apartmentDao.save(apartment);
//			apartmentDao.insertIntoTableFromCSV();
		};
	}
	
	@Bean
	public Docket swaggerDocket() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("akad2021.app")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("REST Documentation").version("1.0-SNAPSHOT").build();
	}
}