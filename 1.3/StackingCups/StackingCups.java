package stackingcups;

import java.util.Arrays;
import java.util.Scanner;

public class StackingCups {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int cups = Integer.parseInt(inputScanner.nextLine());
        String[][] input = new String[cups][2];
        String[] inputArr;
        double[] t = new double[cups];
        
        for(int i = 0; i < cups; i++) {
            inputArr = inputScanner.nextLine().split(" ");
            try {
                t[i] = Double.parseDouble(inputArr[0])/2;
                input[i][0] = Double.toString(Double.parseDouble(inputArr[0])/2);
                input[i][1] = inputArr[1];
            } catch(NumberFormatException e) {
                t[i] = Double.parseDouble(inputArr[1]);
                input[i][0] = inputArr[1];
                input[i][1] = inputArr[0];
            }
        }
        
        Arrays.sort(t);
        for(double x : t) {
            for(int i = 0; i < cups; i++) {
                if(x == Double.parseDouble(input[i][0])) {
                    System.out.println(input[i][1]);
                    break;
                }
            }
        }
    }
}