package taketwostones;

import java.util.Scanner;

public class TakeTwoStones {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int stones = Integer.parseInt(inputScanner.nextLine());
        
        if ( (stones % 2) == 0 ) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }    
}