package standonzanzibar;

public class StandonZanzibar {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        String casesString = input.nextLine();

        String[] turtleString;
        for (int turtleCase = 0; turtleCase < Integer.parseInt(casesString); turtleCase++) {
            turtleString = input.nextLine().split(" ");
            int turtlesTotal = 0;
            for (int i = 1; i < turtleString.length - 1; i++) {
                if (Integer.parseInt(turtleString[i]) > (Integer.parseInt(turtleString[i - 1]) * 2)) {
                    turtlesTotal += Integer.parseInt(turtleString[i]) - (Integer.parseInt(turtleString[i - 1]) * 2);
                }
            }
            System.out.println(turtlesTotal);
        }
    }
}
