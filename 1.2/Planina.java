package planina;

import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int input = inputScanner.nextInt();
        System.out.println((int)Math.pow(1+Math.pow(2, input),2));
    }
}