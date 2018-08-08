package reversedbinarynumbers;

import java.util.Scanner;

public class ReversedBinaryNumbers {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int number = Integer.parseInt(inputScanner.nextLine());
        StringBuilder binaryReverse = new StringBuilder();
        
        while(number > 0) {
            binaryReverse.append(number%2);
            number /= 2;            
        }
        
        for(int i = 0; i < binaryReverse.length(); i++) {
            number += (int)Math.pow(2,(binaryReverse.length()-1-i)) * Integer.parseInt(binaryReverse.substring(i, i+1));
        }
        System.out.println(number);
    }
}