package com.akulcompany.auditoriya;

import com.akulcompany.interfaces.Profess_StudentInterface;
import com.akulcompany.interfaces.GroupInterface;

public class AbstractProfessStudent implements Profess_StudentInterface {

    public AbstractProfessStudent() {
    }

    public AbstractProfessStudent(String name) {
        this.name = name;
    }

    private String name;//ФІO професора чи студента
    private GroupInterface kafedra;// назва кафедри( електроніка, теорет. фізики, квантової ф-ки і т.д.)


    @Override
    public String getName() {
        return null;
    }

    @Override
    public GroupInterface getKafedra() {
        return null;
    }

    @Override
    public void setGroup(GroupInterface group) {

    }

    @Override
    public Profess_StudentInterface getDepartment() {
        return null;
    }

    @Override
    public void setDepartment(Profess_StudentInterface department) {

    }

    @Override
    public void start_lecture() {

    }

    @Override
    public void vout() {

    }

    @Override
    public boolean isDuty() {
        return false;
    }
}
