package aaah;
public class Aaah {
    public static void main(String[] args) {
        java.util.Scanner inputScanner = new java.util.Scanner(System.in);
        
        String jon = inputScanner.nextLine();
        String doctor = inputScanner.nextLine();
        
        if(jon.length() >= doctor.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }    
}