package hissingmicrophone;

import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        if(inputScanner.nextLine().contains("ss")) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }
}