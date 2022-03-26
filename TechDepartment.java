package com.department.service;

import com.department.model.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	
		//To declare a method departmentName of return type string
		public String deparmentName() {
			return "Welcome to Tech Department";
		}

		//To declare a method getTodaysWork of return type string
		public String getTodaysWork() {
			return "Complete coding of Module 1";
		}
		
		//To declare a method getTechStackInformation of return type string
		public String getTechStackInformation() {
			return "Core Java ";
		}

		//declare method getWorkDeadline of return type string
		public String getWorkDeadline() {
			return "Complete by EOD ";
		}
		
}
