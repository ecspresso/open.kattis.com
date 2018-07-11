package sevenwonders;

import java.util.Scanner;

public class SevenWonders {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String input = inputScanner.nextLine();
        int[] tcg = {0,0,0};
        int points = 0;
        
        for(char card : input.toCharArray()) {
            switch(card) {
                case 'T': {
                    tcg[0]++;
                    break;
                }
                case 'C': {
                    tcg[1]++;
                    break;
                }
                case 'G': {
                    tcg[2]++;
                    break;
                }
            }
        }
        
        System.out.println(points + 7 * Math.min(tcg[2], Math.min(tcg[0], tcg[1])) + (int)(Math.pow(tcg[0], 2) + Math.pow(tcg[1], 2) + Math.pow(tcg[2], 2)));
    }
}