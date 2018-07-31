package autori;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String[] input = inputScanner.nextLine().split("-");
        for (String s : input) {
            System.out.print(s.charAt(0));
        }
    }
}