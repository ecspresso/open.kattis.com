package noduplicates;

import java.util.ArrayList;
import java.util.Scanner;

public class NoDuplicates {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String[] input =  inputScanner.nextLine().split(" ");
        ArrayList<String> unique = new ArrayList<>();
        
        for(String s : input) {
            if(!unique.contains(s)) {
                unique.add(s);
            }
        }
        
        if(input.length > unique.size()) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}