package faktor;

import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String[] input = inputScanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int I = Integer.parseInt(input[1]);
        
        System.out.println(A * (I - 1) + 1);
    }
}