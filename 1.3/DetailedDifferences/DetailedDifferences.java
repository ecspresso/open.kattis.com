package detaileddifferences;

import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int cases = Integer.parseInt(inputScanner.nextLine());
        String s1;
        String s2;
        
        for(int i = 0; i < cases; i++) {
            s1 = inputScanner.nextLine();
            s2 = inputScanner.nextLine();
            
            System.out.println(s1);
            System.out.println(s2);
            
            for(int ii = 0; ii < s1.length(); ii++) {
                if(s1.charAt(ii) != s2.charAt(ii)) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println("");
            System.out.println("");
        }
    }
}