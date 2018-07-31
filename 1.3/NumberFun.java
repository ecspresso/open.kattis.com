package numberfun;

import java.util.Scanner;

public class NumberFun {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int N = Integer.parseInt(inputScanner.nextLine());
        String[] input;
        
        for(int i = 0; i < N; i++) {
            input = inputScanner.nextLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            if(a + b == c || a - b == c || b - a == c || (double)a / b == (double)c || (double)b / a == (double)c || a * b  == c) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}