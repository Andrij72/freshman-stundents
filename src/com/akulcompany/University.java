package com.akulcompany;

import com.akulcompany.interfaces.Profess_StudentInterface;
import com.akulcompany.interfaces.GroupInterface;

import java.util.ArrayList;

public class University {

    public static final String UNIVERSITY_NAME = "КДУ Т.Шевченка";

    public static final String SHOP_NAME = "technodom";

    private ArrayList<GroupInterface> departmentList = new ArrayList<GroupInterface>();// в каждом департаменте(кафедра
                                                                                        // Університету) є свої групи студентів

    private ArrayList<Profess_StudentInterface> visitorList = new ArrayList<Profess_StudentInterface>();

    public ArrayList<GroupInterface> getDepartmentList() {
        return departmentList;
    }

    public void addDepartment(GroupInterface department){
        departmentList.add(department);
    }

    public void addVisitor(Profess_StudentInterface visitor){
        visitorList.add(visitor);
    }

}