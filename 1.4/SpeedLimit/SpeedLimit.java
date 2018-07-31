package speedlimit;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String input;
        int miles = 0;
        int prevHours = 0;
        while(!"-1".equals(input = inputScanner.nextLine())) {
            if(input.contains(" ")) {
                String[] inputStr = input.split(" ");
                int distance = Integer.parseInt(inputStr[0]);
                int hours = Integer.parseInt(inputStr[1]);
                miles = miles + ((hours - prevHours) * distance);
                prevHours = hours;
            } else {
                if(miles > 0) {
                    System.out.println(miles + " miles");
                    miles = 0;
                    prevHours = 0;
                }
            }
        }
        
        System.out.println(miles + " miles");
    }
}