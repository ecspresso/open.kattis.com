package drmmessages;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class DRMMessages {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner inputScanner = new Scanner(System.in);

        //A = 65
        //Z = 90

        char[] carr = {'E','W','P','G','A','J','R','B'};//inputScanner.nextLine().toCharArray();
        int sumLow = 0;
        int sumHigh = 0;

        //lower half
        for(int i = 0; i < carr.length/2; i++) {
            sumLow += carr[i] - 65;
        }

        //higher half
        for(int i = carr.length/2; i < carr.length; i++) {
            sumHigh += carr[i] - 65;
        }

        //rotate lower half
        for(int i = 0; i < carr.length/2; i++) {
            carr[i] = (char)((((int)carr[i]-65) + sumLow)%26 + 65);
        }

        //rotate higher half
        for(int i = 0; i < carr.length/2; i++) {
            carr[i] = (char)((((int)carr[i]-65) + sumHigh)%26 + 65);
        }

        //rotate higher half by lower half
        for(int i = 0; i < carr.length/2; i++) {
            System.out.print((char)((((int)carr[i + carr.length/2] + (int)carr[i]) - 130)%26 + 65));
        }
        System.out.println("");
        
        long endTime = System.nanoTime();
        try {
            Files.write(Paths.get("C:\\temp\\for.txt"), String.valueOf(endTime - startTime + "\n").getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            System.err.println(e);
        }
    }
}