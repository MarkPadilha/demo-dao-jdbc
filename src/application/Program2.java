package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("\n=== TEST 1: Department findById === ");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: Department Insert === ");
		Department newDep = new Department(null, "Music");
		departmentDao.insert(newDep);
		System.out.println("Inserted! new department id = " + newDep.getId());
		
		System.out.println("\n=== TEST 3: Department FindAll === ");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for(Department i : list ) {
			System.out.println(i);
		}
		
		System.out.println("\n=== TEST 4: Department Update === ");
		dep = departmentDao.findById(5);
		dep.setName("Games");
		departmentDao.update(dep);
		System.out.println("Department updated!");
		
		System.out.println("\n=== TEST 5: Department Delete === ");
		System.out.print("Enter id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Department deleted");
	}
}
