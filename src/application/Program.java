package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Fashion");
		Seller seller = new Seller(1, "Jorge", "jorge@gmail.com", new Date(), 3000.00, obj);
		
		System.out.println(obj);
		System.out.println(seller);
		
	}

}
