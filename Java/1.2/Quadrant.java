package quadrant;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int x = Integer.parseInt(inputScanner.nextLine());
        int y = Integer.parseInt(inputScanner.nextLine());
        
        if(x > 0) {
            if(y > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if(y > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}