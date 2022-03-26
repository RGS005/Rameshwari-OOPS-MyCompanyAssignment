package com.department.driver;

import com.department.service.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// create the object of TechDepartment and use all the methods 
				AdminDepartment adminDept = new AdminDepartment();
				System.out.println(adminDept.deparmentName());
				System.out.println(adminDept.getTodaysWork());
				System.out.println(adminDept.getWorkDeadline());
				System.out.println(adminDept.isTodayAHoliday());
				System.out.println("\n");
				
			// create the object of HR Department and use all the methods
				HRDepartment hrDept = new HRDepartment();
				System.out.println(hrDept.deparmentName());
				System.out.println(hrDept.doActivity());
				System.out.println(hrDept.getTodaysWork());
				System.out.println(hrDept.getWorkDeadline());
				System.out.println(hrDept.isTodayAHoliday());
				System.out.println("\n");
				
			// create the object of TechDepartment and use all the methods 
				TechDepartment techDept = new TechDepartment();
				System.out.println((techDept.deparmentName()));
				System.out.println(techDept.getTodaysWork());
				System.out.println(techDept.getWorkDeadline());
				System.out.println(techDept.getTechStackInformation());
				System.out.println(techDept.isTodayAHoliday());
				System.out.println("\n");
		
	}

}
