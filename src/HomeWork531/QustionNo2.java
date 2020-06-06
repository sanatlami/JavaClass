package HomeWork531;

import java.util.Scanner;

public class QustionNo2 {
    public static void main(String[] args) {


        Scanner Q2 = new Scanner(System.in);
        System.out.println("Enter Senconds:  ");
        int seconds= Q2.nextInt();

        int S = seconds%60;
        int M = seconds/60;
        int H = M%60;
            M= M/60;

        System.out.println("Hours: "+H);
        System.out.println(" Minutes: "+M);
        System.out.println("Seconds:" +S);
    }
}