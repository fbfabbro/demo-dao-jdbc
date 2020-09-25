package application;

import java.util.List;
import java.util.Scanner;

import model.dao.Daofactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao DepartmentDao = Daofactory.createDepartmentDao();
		System.out.println("Create connection complete sucessufully");

		System.out.println("==== TEST 1: Department findById ====");
		Department department = DepartmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n==== TEST 2: Department findAll ====");
		List<Department> list = DepartmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}

		
		System.out.println("\n==== TEST 3: Department Insert ====");
		Department newDepartment = new Department(null, "RH");
		DepartmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

		System.out.println("\n==== TEST 4: Department Update ====");
		department = DepartmentDao.findById(8);
        department.setName("New Depto");
		DepartmentDao.update(department);
		System.out.println("Update completed !");

		System.out.println("\n==== TEST 5: Department delete ====");
		System.out.println("Enter Id for delete test: ");
		int id = sc.nextInt();
		DepartmentDao.deleteById(id);
		System.out.println("Delete completed !");

		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
