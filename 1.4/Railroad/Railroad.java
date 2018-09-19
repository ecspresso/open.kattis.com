package railroad;

public class Railroad {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        String[] inputString = input.nextLine().split(" ");
        if (Integer.parseInt(inputString[1]) % 2 == 0) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}
