package tarifa;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int data[] = {Integer.parseInt(inputScanner.nextLine()), 0};
        int months = Integer.parseInt(inputScanner.nextLine());
        
        for(int i = 0; i < months; i++) {
            data[1] += data[0] - Integer.parseInt(inputScanner.nextLine());
        }
        
        System.out.println(data[0] + data[1]);
    }
}