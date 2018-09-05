package apaxiaaaaaaaaaaaans;

import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        StringBuilder nameCompact = new StringBuilder();
        nameCompact.append(name.charAt(0));
        
        for(int i = 1; i < name.length(); i++) {
            if(!(name.charAt(i) == name.charAt(i - 1))) {
                nameCompact.append(name.charAt(i));
            }
        }
        
        System.out.println(nameCompact.toString());
    }    
}
