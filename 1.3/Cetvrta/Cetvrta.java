package cetvrta;

public class Cetvrta {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        String[] inputString;
        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            inputString = input.nextLine().split(" ");
            x[i] = Integer.parseInt(inputString[0]);
            y[i] = Integer.parseInt(inputString[1]);
        }

        int xy[] = new int[2];
        if (x[0] == x[1]) {
            xy[0] = x[2];
        } else if (x[0] == x[2]) {
            xy[1] = x[1];
        } else {
            xy[0] = x[0];
        }

        if (y[0] == y[1]) {
            xy[1] = y[2];
        } else if (y[0] == y[2]) {
            xy[1] = y[1];
        } else {
            xy[1] = y[0];
        }

        System.out.println(xy[0] + " " + xy[1]);
    }
}
