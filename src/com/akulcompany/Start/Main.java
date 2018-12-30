package com.akulcompany.Start;

import com.akulcompany.Groups.Electronic_group;
import com.akulcompany.Groups.Kvantelectronic_group;
import com.akulcompany.University;
import com.akulcompany.auditoriya.Professor;
import com.akulcompany.auditoriya.Students;
import com.akulcompany.interfaces.GroupInterface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args)  {  imitateWorking_of_students_group();    }
    static  int count_vote =0;// кол-во голосов
        private static void imitateWorking_of_students_group() throws IOException {


           University univer = new University();// створюєм заклади Университету,

            // сворюэм группи департаменти в Университеті;
            Electronic_group electronic_group = new Electronic_group();
            Kvantelectronic_group kvantelectr_group= new  Kvantelectronic_group();

            // добавляем гуппи Універу;
             univer.addDepartment(electronic_group);
            univer.addDepartment( kvantelectr_group);

            // добавляем  студентів
            Students studen1 = new Students("Іванов");
            Students studen2 = new Students("Степанов");


            electronic_group.addEmployee(studen1);
            electronic_group.addEmployee(studen2);

            //добавляєм список групи електоніки
            //-----формуэм список групи по якому ведеться перекличка
            // cтуденти які прийшли послухати лекцію
            ArrayList<String> list2 = new ArrayList<String>();
            list2.add(0, "Іванов");
            list2.add(1, "Степанов");
            list2.add(2, "Лихар");
            list2.add(3, "Бородай");
            list2.add(4, "Лях");




        Professor professor = new Professor("Калайда");// создаем проффесора
          professor.start_lecture();

for(Students el_gr:electronic_group){
    System.out.println(el_gr);
}


               // professor.prisutnost();





        }




}
