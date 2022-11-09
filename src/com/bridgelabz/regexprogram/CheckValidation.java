package com.bridgelabz.regexprogram;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckValidation {
    Scanner sc=new Scanner(System.in);
        void checkFirstName(){
        System.out.println("Enter Name for First Name");
        String firstName=sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{3,}$",firstName)){
            System.out.println("First Name is Valid");
        }else
            System.out.println("First Name is Invalid");
    }

    void checklastName(){
        System.out.println("Enter Name for Last Name");
        String lastName=sc.nextLine();
        if (Pattern.matches("^[a-z]{1}[A-Z]{3,}$",lastName)){
            System.out.println("Last Name is Valid");
        }else
            System.out.println("Last Name is Invalid");
    }
    void checkeMail(){
        System.out.println("Enter Name for Email Id ");
        String eMail_Id=sc.next();
        if (Pattern.matches("^[a-z]{3}[.]?[a-z]{3}[@]{1}[a-z]{2}[.]?[a-z]{2}[.]?[a-z]{2}$",eMail_Id)){
            System.out.println("Email id is Valid");
        }else
            System.out.println("Emaol id is Invalid");
    }

    void checkNumber(){
        System.out.println("Enter mobile Number ");
        String mobile_number=sc.nextLine();
        if (Pattern.matches("^[0-9]+\s[0-9]{10}$",mobile_number)){
            System.out.println("Mobile number is Valid");
        }else
            System.out.println("Mobile number is Invalid");
    }

    void checkPassword(){
        System.out.println("Enter any password ");
        String password=sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z0-9]{7,}$",password)){
            System.out.println("Password is Valid");
        }else
            System.out.println("Password is Invalid");
    }
    void checkPassword2(){
        System.out.println("Enter any password ");
        String password2=sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z0-9]{7,}$",password2)){
            System.out.println("password2 is Valid");
        }else
            System.out.println("password2 is Invalid");
    }
}
