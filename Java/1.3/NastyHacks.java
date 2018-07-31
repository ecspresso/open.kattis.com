package nastyhacks;

import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int cases = Integer.parseInt(inputScanner.nextLine());


        String[] input;
        for(int i = 0; i < cases; i++) {
            input = inputScanner.nextLine().split(" ");
            int revNoAd = Integer.parseInt(input[0]);
            int revAd = Integer.parseInt(input[1]);
            int adCost = Integer.parseInt(input[2]);
            
            if(revNoAd > revAd - adCost) {
                System.out.println("do not advertise");
            } else if(revNoAd == revAd - adCost) {
                System.out.println("does not matter");
            } else {
                System.out.println("advertise");                
            }
        }
    }
}