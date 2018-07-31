package sibice;

import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String[] input = inputScanner.nextLine().split(" ");
        int matches = Integer.parseInt(input[0]);
        int width = Integer.parseInt(input[1]);
        int height = Integer.parseInt(input[2]);
        int diag = (int)Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        
        for(int matchCount = 0; matchCount < matches; matchCount++) {
            int currentMatchLength = inputScanner.nextInt();
            if(currentMatchLength <= diag) {
                System.out.println("DA");
            } else if(currentMatchLength <= width){
                System.out.println("DA");
            } else if(currentMatchLength <= height) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}