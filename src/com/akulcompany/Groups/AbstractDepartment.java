package com.akulcompany.Groups;

import com.akulcompany.interfaces.GroupInterface;
import com.akulcompany.interfaces.Profess_StudentInterface;

import java.util.ArrayList;



    public abstract class AbstractDepartment implements GroupInterface{

        public AbstractDepartment() {
        }

        public AbstractDepartment(String name) {
            this.name = name;
        }

        private String name;
        private ArrayList<Profess_StudentInterface> employeeList = new ArrayList<Profess_StudentInterface>();


        @Override
        public String getName () {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public ArrayList<Profess_StudentInterface> getEmployeeList() {
            return employeeList;
        }

        public void setEmployeeList(ArrayList<Profess_StudentInterface> employeeList) {
            this.employeeList = employeeList;
        }



        public void addEmployee(Profess_StudentInterface employee){
            employee.setDepartment(this);
            employeeList.add(employee);
        }


    }




