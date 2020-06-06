package HomeWork531;

import java.util.Scanner;

public class QustionNo1 {
    //1. Write a code to print a range of number. Take the lower limit and upper limit as user input. [ if user input 4 and 10, i need output all numbers from 4 to 10]

    public static void main (String[] args){
        int i;
        int j;
        Scanner Q1= new Scanner(System.in); // Getting value from User
        System.out.println("Please Enter your lower value");
        i= Q1.nextInt();

        System.out.println("Please Enter your higher value");
        j= Q1.nextInt();
        for(int listofrange=i; listofrange<=j;listofrange++){
            System.out.println(listofrange);
        }


    }

}


