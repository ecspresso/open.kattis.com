package fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String[] input = inputScanner.nextLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int Y = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[2]);
        
        for(int i = 1; i <= N; i++) {
            if(i%Y == 0 && i%X == 0){
                System.out.println("FizzBuzz");
            } else if(i%Y == 0) {
                System.out.println("Buzz");
            } else if(i%X == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}