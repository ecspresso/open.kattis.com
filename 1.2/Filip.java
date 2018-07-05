package filip;

import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String[] input = inputScanner.nextLine().split(" ");
        int A = Integer.parseInt(new StringBuilder(input[0]).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(input[1]).reverse().toString());
        
        if(A > B) {
            System.out.println(A);
        } else {
            System.out.println(B);
        }
    }
}