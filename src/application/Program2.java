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
		
		DepartmentDao departmentDao = Daofactory.createDepartmentDao();
		System.out.println("Create connection complete sucessufully");

		System.out.println("==== TEST 1: Department findById ====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n==== TEST 2: Department findAll ====");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}

		
		System.out.println("\n==== TEST 3: Department Insert ====");
		Department newDepartment = new Department(null, "RH");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

		System.out.println("\n==== TEST 4: Department Update ====");
		department = departmentDao.findById(8);
        department.setName("New Depto");
		departmentDao.update(department);
		System.out.println("Update completed !");

		System.out.println("\n==== TEST 5: Department delete ====");
		System.out.println("Enter Id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed !");

		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
