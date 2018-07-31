package bijele;

import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);
        
        int correctAmountOfPices[] = {1,1,2,2,2,8}; 
        int piecesToAddOrRemove[]  = {0,0,0,0,0,0}; 
        String[] input = inputScanner.nextLine().split(" ");
        int piece;
        
        for(int i = 0; i < 6; i++) {
            piece = Integer.parseInt(input[i]);
            
            // färre
            if(piece < correctAmountOfPices[i]) {
                piecesToAddOrRemove[i] = correctAmountOfPices[i] - piece;
            // fler
            } else if(piece > correctAmountOfPices[i]) {
                piecesToAddOrRemove[i] = -(piece - correctAmountOfPices[i]);
            }
            
            if(i < 5) {
                System.out.print(piecesToAddOrRemove[i] + " ");
            } else {
                System.out.println(piecesToAddOrRemove[i]);
            }
        }
    }
}