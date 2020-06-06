package HomeWork531;

import java.util.Scanner;


public class Q2Q8 {
    int seconds;
    int H;
    int M;
    int S;

    Q2Q8(int Seconds) {

        this.seconds = Seconds;
    }

    public void Display() {
        int S = seconds % 60;
        int M = seconds / 60;
        int H = M % 60;
        M = M / 60;
        System.out.println("Hours: " + H);
        System.out.println(" Minutes: " + M);
        System.out.println("Seconds:" + S);
    }

   }