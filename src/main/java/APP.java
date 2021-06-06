/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.util.Calendar;
import java.util.Scanner;

public class APP {


    public static void main(String[] args) {
        System.out.println("What is the password?");
        Scanner sc = new Scanner(System.in);
        String EnteredPassword = sc.nextLine();
        String ActualPassword = "abc$123";
        String Output = "";

        if(EnteredPassword.equals(ActualPassword))
        {
            Output = "Welcome!" ;
        }
        else
        {
            Output = "I don't know you.";
        }

        System.out.println(Output);


    }
}
