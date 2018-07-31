package stuckinatimeloop;

import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int chantCount = Integer.parseInt(inputScanner.nextLine());
        
        for(int chant = 1; chant <= chantCount; chant++) {
            System.out.println(chant + " Abracadabra");
        }
    }
}