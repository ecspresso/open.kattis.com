package dicecup;

import java.util.Scanner;

public class DiceCup {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String[] inputArr = inputScanner.nextLine().split(" ");
        int dieA = Math.min(Integer.parseInt(inputArr[0]), Integer.parseInt(inputArr[1]));
        int dieB = Math.max(Integer.parseInt(inputArr[0]), Integer.parseInt(inputArr[1]));
        
        for(int i = dieA+1; i <= dieB+1; i++) System.out.println(i);
    }
}