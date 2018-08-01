package kornislav;

import java.util.Arrays;
import java.util.Scanner;

public class Kornislav {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String[] input = inputScanner.nextLine().split(" ");
        int[] sides = {Integer.parseInt(input[0]),Integer.parseInt(input[1]),Integer.parseInt(input[2]),Integer.parseInt(input[3])};
        Arrays.sort(sides);
        
        System.out.println(sides[0] * sides[2]);
    }
}