package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: Department findById === ");
		Department department = departmentDao.findById(4);
		System.out.println(department);
		
		
		System.out.println("\n=== TESTE 2: Deparment findAll === ");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
//		
//		System.out.println("\n=== TESTE 3: Seller insert === ");
//		
//		System.out.println("Inserted! New id = " + newSeller.getId());
//		
//		
//		
//		System.out.println("\n=== TESTE 4: Seller update === ");
//		
//		System.out.println("Update completed!");
//		
//		
//		System.out.println("\n=== TESTE 5: Seller delete === ");
//		System.out.print("Enter id for delete: ");
//		
		
		
		sc.close();
	}
}
