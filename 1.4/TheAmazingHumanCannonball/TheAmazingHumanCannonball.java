package theamazinghumancannonball;

import java.util.Scanner;

public class TheAmazingHumanCannonball {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int cases = Integer.parseInt(inputScanner.nextLine());
        String[] inputArr;
        double v;
        double angel;
        double x;
        double hlower;
        double hupper;
        
        for(int i = 0; i < cases; i++) {
            inputArr = inputScanner.nextLine().split(" ");
            v = Double.parseDouble(inputArr[0]);
            angel = Math.toRadians(Double.parseDouble(inputArr[1]));
            x = Double.parseDouble(inputArr[2]);
            hlower = Double.parseDouble(inputArr[3]);
            hupper = Double.parseDouble(inputArr[4]);
            
            double t = x/(v*Math.cos(angel));
            double y = v*t*Math.sin(angel)-(0.5*9.81*Math.pow(t, 2));
            
            if(hlower > y -1 || hupper < y+1) {
                System.out.println("Not Safe");
            } else {
                System.out.println("Safe");
            }
        }
    }
}