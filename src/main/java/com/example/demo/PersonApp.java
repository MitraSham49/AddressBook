package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        //add a new person
        //create a person from our object
        Person newPerson = new Person();
        boolean done = false;
        String again = "";
       // do {
         for (int i=1; i<=5; i++) {
             newPerson = new Person();
             System.out.println("Enter Person Name");
             newPerson.setFirstName(scan.nextLine());
             System.out.println("Enter Person  Last Name");
             newPerson.setLastName(scan.nextLine());
             System.out.println("Enter Person address");
             newPerson.setAddress(scan.nextLine());
             System.out.println("Enter Phone Number");
             newPerson.setPhoneNumber(scan.nextLine());
             System.out.println("Enter Person Email");
             newPerson.setEmail(scan.nextLine());
             persons.add(newPerson);
             //System.out.println(newPerson);
         }

         /*   System.out.println("Do you want continue?(Y/N)");
            again = scan.nextLine();
            if (again.equalsIgnoreCase("y")) {
                done = true;
            }else{done =false;}
        } while (done);
        */

        System.out.println("------------------------");
        for (Person eachPerson : persons) {

            System.out.println("------------------------");
            System.out.println(" For Person:" + eachPerson.getFirstName());
            System.out.println("The  information was record:" + eachPerson.toString());


        }
    }
}
