package grassseedinc;

import java.util.Scanner;

public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double seedCost = inputScanner.nextDouble();
        int numberOfLawns = inputScanner.nextInt();
        double  area = 0;
        
        inputScanner.nextLine(); // Consume next line left from nextInt();
        String[] input;
        for(int lawn = 0; lawn < numberOfLawns; lawn++) {
            input = inputScanner.nextLine().split(" ");
            double width  = Double.parseDouble(input[0]);
            double height = Double.parseDouble(input[1]);
            
            area = area + width*height;
        }
        
        System.out.format("%.7f", area*seedCost);
    }
}