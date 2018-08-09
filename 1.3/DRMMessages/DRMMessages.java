package drmmessages;

import java.util.Scanner;

public class DRMMessages {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        //A = 65
        //Z = 90

        char[] carr = inputScanner.nextLine().toCharArray();
        int sumLow = 0;
        int sumHigh = 0;

        for(int i = 0; i < carr.length/2; i++) {
            sumLow += carr[i] - 65; //sum lower
            sumHigh += carr[i+carr.length/2] - 65; //sum upper
        }

        for(int i = 0; i < carr.length/2; i++) {
            System.out.print((char)(((int)carr[i + carr.length/2] + ((((int)carr[i]-65) + sumLow)%26 + sumHigh)%26 - 65)%26 + 65));
        }
    }
}