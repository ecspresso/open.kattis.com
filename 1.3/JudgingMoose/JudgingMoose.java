package judgingmoose;

import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String[] inputArr = inputScanner.nextLine().split(" ");
        int left = Integer.parseInt(inputArr[0]);
        int right = Integer.parseInt(inputArr[1]);
        
        if(left == 0 && right == 0) System.out.println("Not a moose");
        else if(left == right) System.out.println("Even " + left*2); 
        else if(left < right) System.out.println("Odd " + right*2);
        else if(left > right) System.out.println("Odd " + left*2);
    }
}