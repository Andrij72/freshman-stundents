package com.akulcompany.auditoriya;


import java.io.IOException;
import java.util.*;

public class Professor {

    String name; // ФІО професора
    public static String name_kafedra = "electronics";

    //List<String> list1 = new ArrayList<String>();
    //List<String> list2 = new ArrayList<String>();
    //List<String> list3 = new ArrayList<String>();
    public Professor(String name) {
        this.name = name;
    }

    public static String getName_kafedra() {
        return name_kafedra;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

   public   void start_lecture() {



       //------ cтуденти які прийшли послухати лекцію

       // cтуденти які прийшли послухати лекцію
       //list1.add(0, "Іванов");
       //list1.add(1, "Степанов");
       //list1.add(2, "Лихар");
       //list1.add(3, "Бородай");
       //list1.add(4, "Лях");
       //Іванов  Степанов  Лихар  Бородай  Лях
       StringBuffer buf = new StringBuffer();
       buf.append("Доброго дня, шановні!" + "\n" + "\n");
       buf.append("-------------------------------------------------------" + "\n");
       buf.append("Проведемо перекличку та звіримо присутність....і так, по списку групи..присутны наступні студенти:..." + "\n");

       System.out.print(buf.toString());


   }

     //----------- проводить звірку по списку групи-------

       //---------професор результує чи всі присутні------




           //for (String process : list1) {
              // System.out.println(process);
               //if (!list2.contains(process)) {
                 //  list3.add(process);
               //}
           //}

//*************************************************************************
           // провірка чи  всі присутні


          /* if (list1.containsAll(list2)&&(list1.size()==list2.size())){
               System.out.println(" Присутня ВСЯ ГРУПА"+ "");
           }
            else {
               System.out.println();
               System.out.printf("%s","***є відсутні****");

                //System.out.println(list3.size());// відсутня   к-ть студентів
           }*/






}

