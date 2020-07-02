package com.qa.scanners;
import java.util.Scanner;


public class Runner {
	
	public static void main(String[] args) {
        // scanners
        // simple scanner to take a number between 1-12
      
       
        Scanner s = new Scanner(System.in);
        // variable
        int month = 0;
        //do while
        do {
            System.out.println("Enter a Number");
            //! means not
            // !=
            //check input and make sure its a number
            while(!s.hasNextInt()){
                System.out.println("Thats not a number!!");
                s.next();
               
            }
            month = s.nextInt();
        }while (month <= 0 || month >= 13);
       
        System.out.println("You entered:"+month);
			}
}
