package main.java;

import java.util.Scanner;

public class SpecificUser {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.println("Please enter the following information to build your CV: ");

        System.out.println("Insert your name");
        String name = myInput.nextLine();

        System.out.println("Insert your age");
        int age = myInput.nextInt();

        System.out.println("Insert gender");
        String gender = myInput.next();
        myInput.nextLine();

        System.out.println("Insert education");
        String education = myInput.nextLine();

        System.out.println("Insert email");
        String email = myInput.next();
        myInput.nextLine();

        System.out.println("Insert profession");
        String profession = myInput.next();

        System.out.println("Insert company");
        String company = myInput.next();
        myInput.nextLine();

        System.out.println(myCV(name, age, gender, education, email, profession, company));

    }

    public static String myCV(String name , int age , String gender , String education , String email , String profession , String company) {
        return "My name is " + name + ". I am " + age + "years old and my gender is " +  gender +
                ".\n My education is " + education + "and also my e-mail is " + email +
                ".\n My profession is " + profession + "at " + company;
    }
}
