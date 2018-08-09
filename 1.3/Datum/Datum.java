package datum;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String[] inputArr = inputScanner.nextLine().split(" ");
        System.out.println(LocalDateTime.of(2009, Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[0]), 0, 0).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }
}