package R2;

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String rOneAndS = inputScanner.nextLine();
        int rOne = Integer.parseInt(rOneAndS.substring(0, rOneAndS.indexOf(" ")));
        int s = Integer.parseInt(rOneAndS.substring(rOneAndS.indexOf(" ") + 1, rOneAndS.length()));
        
        System.out.println(s*2-rOne);
    }
}