package encodedmessage;

import java.util.Scanner;

public class EncodedMessage {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int secrets = Integer.parseInt(inputScanner.nextLine());
        String word;
        int sqre;
                
        for(int i = 0; i < secrets; i++) {
            word = inputScanner.nextLine();
            sqre = (int)Math.sqrt(word.length());
            
            for(int positon = 0; positon < sqre; positon++){
                for(int letter = 1; letter <= sqre; letter++) {
                    System.out.print(word.charAt((sqre*letter)-1-positon));
                }
            }
            
            System.out.println("");
        }
    }
}