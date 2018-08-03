package theeasiestproblemisthisone;

import java.util.Scanner;

public class TheEasiestProblemIsThisOne {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String input;
        int p = 11;
        int sumN = 0;
        int sumP = 0;
        
        while(!"0".equals(input = inputScanner.nextLine())) {
            for(char c : input.toCharArray()) {
                sumN += Character.getNumericValue(c);
            }
            
            while(true) {
                sumP = 0;
                
                for(char c : Integer.toString(Integer.parseInt(input)*p).toCharArray()) {
                    sumP += Character.getNumericValue(c);
                }
                
                if(sumN == sumP) {
                    System.out.println(p);
                    sumN = 0;    
                    p = 11;
                    break;
                } else {
                    p++;
                }
            }
        }
    }
}