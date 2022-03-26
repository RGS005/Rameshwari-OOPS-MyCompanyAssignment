package com.department.service;

import com.department.model.SuperDepartment;

public class AdminDepartment extends SuperDepartment{

		//To declare a method departmentName of return type string
		public String deparmentName() {
			return "Welcome to Admin Department";
		}

		//To declare a method getTodaysWork of return type string
		public String getTodaysWork() {
			return "Commplete your documents submission";
		}

		//To declare a method getWorkDeadline of return type string
		public String getWorkDeadline() {
			return "Complete by EOD ";
		}
}
