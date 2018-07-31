package ladder;

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String[] input = inputScanner.nextLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int v = Integer.parseInt(input[1]);
        
        System.out.println((int)Math.ceil(h/Math.sin(Math.toRadians(v))));
    }
}