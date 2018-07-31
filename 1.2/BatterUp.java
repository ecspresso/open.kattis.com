package batterup;

import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String atbatsString = inputScanner.nextLine();
        int atbats = Integer.parseInt(atbatsString);

        String[] basesPerAtbats = inputScanner.nextLine().split(" ");
        int walks = 0;
        double totalBases = 0;
        for(int hit = 0; hit < atbats; hit++) {
            if(Double.parseDouble(basesPerAtbats[hit]) == -1)  {
                walks++;
            } else {
                totalBases = totalBases + Double.parseDouble(basesPerAtbats[hit]);
            }
        }
        
        System.out.println(totalBases/(atbats-walks));
    }
}