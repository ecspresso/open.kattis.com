package cryptographersconundrum;

import java.util.Scanner;

public class CryptographersConundrum {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String input = inputScanner.nextLine();
        int days = input.length();
        int pos = 0;
        
        for(char c : input.toCharArray()) {
            pos++;
            switch (c) {
                case 'P': if(pos == 1) days--; break;
                case 'E': if(pos == 2) days--; break;
                case 'R': if(pos == 3) days--; break;
            }
            
            if(pos == 3) pos = 0;
        }
        if(days < 0) days = 0;
        System.out.println(days);
    }
}