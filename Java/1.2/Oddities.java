package oddities;

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int input = inputScanner.nextInt();
        
        for(int i = 0; i < input; i++) {
            int number = inputScanner.nextInt();
            if(number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }
    }
}