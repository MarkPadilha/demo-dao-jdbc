package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "livros");
		
		Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), 2000.0, obj );
		
		System.out.println(seller);
		System.out.println(obj);
	}

}
