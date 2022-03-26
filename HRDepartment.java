package com.department.service;

import com.department.model.SuperDepartment;

public class HRDepartment extends SuperDepartment {

		// To declare a method departmentName of return type string
		public String deparmentName() {
			return "Welcome to HR Department";
		}

		//To declare a method getTodaysWork of return type string
		public String getTodaysWork() {
			return "Fill todays timesheet and mark your attendance";
		}
		
		//To declare a method getWorkDeadline of return type string
				public String getWorkDeadline() {
					return "Complete by EOD ";
		}
				
		//declare method doActivity of return type string
		public String doActivity() {
			return "team Lunch";
		}
		
}

