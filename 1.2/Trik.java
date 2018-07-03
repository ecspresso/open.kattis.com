package trik;

import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String moves = inputScanner.nextLine();
        char ballLocation = 'A';
        
        for(int currentMove = 0; currentMove < moves.length(); currentMove++) {
            switch(moves.charAt(currentMove)) {
                case 'A':{
                    if(ballLocation == 'A') {
                        ballLocation = 'B';
                        
                    } else if(ballLocation == 'B') {
                        ballLocation = 'A';
                    }
                    break;
                }
                case 'B':{
                    if(ballLocation == 'B') {
                        ballLocation = 'C';
                        
                    } else if(ballLocation == 'C') {
                        ballLocation = 'B';
                    }
                    break;
                }
                case 'C':{
                    if(ballLocation == 'A') {
                        ballLocation = 'C';
                        
                    } else if(ballLocation == 'C') {
                        ballLocation = 'A';
                    }
                    break;
                }
            }
        }
        
        switch(ballLocation) {
            case 'A': System.out.println("1");break;
            case 'B': System.out.println("2");break;
            case 'C': System.out.println("3");break;
        }
    }
}