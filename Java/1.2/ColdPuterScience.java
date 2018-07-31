package coldputerscience;

import java.util.Scanner;

public class ColdPuterScience {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String daysInput = inputScanner.nextLine();
        int days = Integer.parseInt(daysInput);


        String[] tempratures = inputScanner.nextLine().split(" ");
        int daysBelowZero = 0;
        for(int i = 0; i < days; i++) {
            if(Integer.parseInt(tempratures[i]) < 0) {
                daysBelowZero++;
            }
        }
        
        System.out.println(daysBelowZero);
    }
}