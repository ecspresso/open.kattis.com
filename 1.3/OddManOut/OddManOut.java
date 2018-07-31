package oddmanout;

import java.util.ArrayList;
import java.util.Scanner;

public class OddManOut {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        String[] guestID;
        int cases = Integer.parseInt(inputScanner.nextLine());
        ArrayList<String> crossedGuests;
        
        for(int i = 1; i <= cases; i++) {
            inputScanner.nextLine(); //String guests = 
            crossedGuests = new ArrayList<>();
            guestID = inputScanner.nextLine().split(" ");
            
            for(String s : guestID) {
                if(!crossedGuests.contains(s)) {
                    crossedGuests.add(s);
                } else {
                    crossedGuests.remove(s);
                }
            }
            
            System.out.println("Case #" + i + ": " + crossedGuests.get(0));
        }
    }
}