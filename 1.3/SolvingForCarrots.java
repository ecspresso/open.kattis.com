package solvingforcarrots;

import java.util.Scanner;

public class SolvingForCarrots {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String[] input = inputScanner.nextLine().split(" ");
        //int N = Integer.parseInt(input[0]);
        int P = Integer.parseInt(input[1]);
        System.out.println(P);
    }
}