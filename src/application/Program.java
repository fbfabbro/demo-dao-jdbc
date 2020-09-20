package application;

import java.util.Date;

import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller seller = new Seller(21, "Bob", "bob@gmail", new Date(), 3000.00, obj);
		
		SellerDao sellerDao = Daofactory.createSellerDao();
		System.out.println(seller);
		
	}

}
