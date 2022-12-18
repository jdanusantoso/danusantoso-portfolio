package com.revature.models;

import java.util.List;

public class EmployeeLoginDTO {

    public class Employee {


        private String employee_username;
        private String employee_password;


        public Employee(String employee_username, String employee_password) {
            this.employee_username = employee_username;
            this.employee_password = employee_password;
        }

        public String getEmployee_username() {
            return employee_username;
        }

        public void setEmployee_username(String employee_username) {
            this.employee_username = employee_username;
        }

        public String getEmployee_password() {
            return employee_password;
        }

        public void setEmployee_password(String employee_password) {
            this.employee_password = employee_password;
        }
    }

}
