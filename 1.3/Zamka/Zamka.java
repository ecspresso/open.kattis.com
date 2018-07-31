package zamka;

import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int L = Integer.parseInt(inputScanner.nextLine());
        int D = Integer.parseInt(inputScanner.nextLine());
        int X = Integer.parseInt(inputScanner.nextLine());
        int sum;
        int sumx;
        
        
        while(true) {
            if(sumFun(L) == X) break;
            L++;
        }
        System.out.println(L);
        
        while(true) {
            if(sumFun(D) == X) break;
            D--;
        }
        System.out.println(D);
    }
    
    public static int sumFun(int x) {
        int tot = 0;
        while (x > 0) {
            tot = tot + x % 10;
            x = x / 10;
        }
        return tot;
    }
}