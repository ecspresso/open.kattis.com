package pot;

import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int nrOfInputs = Integer.parseInt(inputScanner.nextLine());
        int result = 0;
        for(int inputCount = 0; inputCount < nrOfInputs; inputCount++) {
            String inputNr = inputScanner.nextLine();
            double nr = Integer.parseInt(inputNr.substring(0, inputNr.length()-1));
            double pow = Integer.parseInt(inputNr.substring(inputNr.length()-1));
            result = result + (int)Math.pow(nr, pow);
        }
        
        System.out.println(result);
    }
}