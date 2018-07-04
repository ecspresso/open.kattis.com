package pet;

import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int[] scores = new int[5];
        for(int contestant = 0; contestant < 5; contestant++) {
            String[] input = inputScanner.nextLine().split(" ");
            scores[contestant] = Integer.parseInt(input[0])+Integer.parseInt(input[1])+Integer.parseInt(input[2])+Integer.parseInt(input[3]);
        }
        
        int highscore = scores[0];
        String output = "1 " + highscore;
        
        for(int i = 1; i < 5; i++) {
            if(highscore < scores[i]) {
                highscore = scores[i];
                output = i + 1 + " " + highscore;
            }
        }
        System.out.println(output);
    }
}