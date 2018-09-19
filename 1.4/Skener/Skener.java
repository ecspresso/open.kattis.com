package skener;

public class Skener {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        String[] inputString = input.nextLine().split(" ");
        int R = Integer.parseInt(inputString[0]);
        int C = Integer.parseInt(inputString[1]);
        int Zr = Integer.parseInt(inputString[2]);
        int Zc = Integer.parseInt(inputString[3]);

        for (int iR = 0; iR < R; iR++) {
            String row = input.nextLine();
            for (int iZr = 0; iZr < Zr; iZr++) {
                for (int iC = 0; iC < C; iC++) {
                    for (int iZc = 0; iZc < Zc; iZc++) {
                        System.out.print(row.charAt(iC));
                    }
                }
                System.out.println("");
            }
        }
    }
}
