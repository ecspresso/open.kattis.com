package spavanac;

import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String[] input = inputScanner.nextLine().split(" ");
        int hour = Integer.parseInt(input[0]);
        if(hour == 0) hour = 24;
        
        int minutes = Integer.parseInt(input[1]) - 45;
        
        if(minutes < 0) {
            hour = hour - 1;
            minutes = 60 +minutes;
        }
        
        System.out.println(hour + " " + minutes);
    }
}