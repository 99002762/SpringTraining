package com.lts;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//import com.lts.foodwiring.FoodPanda;
import com.lts.mileage.VehicleDetails;

@SpringBootApplication
public class TrailOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TrailOneApplication.class, args);
	}
	
	@Autowired
    ApplicationContext context;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Employee employee = context.getBean("employee",Employee.class);
		System.out.println(employee);
		
		Student student = context.getBean("student",Student.class);
		System.out.println(student);*/
		//ShapeFactory shapeFactory =  context.getBean(ShapeFactory.class);
		//shapeFactory.printArea(12, 13);
		//FoodPanda foodPanda = context.getBean(FoodPanda.class);
		//List<String> list = foodPanda.showMenu("chinese");
		//for(String item : list) {
		//	System.out.println(item);
		//}
		//foodPanda.showMenu("indian");
		
		VehicleDetails vehicleDetails = context.getBean(VehicleDetails.class);
		vehicleDetails.getMileage("car");
		
	}

}
