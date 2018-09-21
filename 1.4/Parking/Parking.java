package parking;

public class Parking {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int cases = Integer.parseInt(input.nextLine());

        for (int i = 0; i < cases; i++) {
            // Consume stores to visit.
            input.nextLine();

            // Stores to visit
            String[] storesLocStr = input.nextLine().split(" ");

            if (storesLocStr.length == 1) {
                System.out.println("0");
                continue;
            }

            int[] storesLoc = new int[storesLocStr.length];
            for (int x = 0; x < storesLoc.length; x++) {
                storesLoc[x] = Integer.parseInt(storesLocStr[x]);
            }
            java.util.Arrays.sort(storesLoc);

            int parking = (storesLoc[0] + storesLoc[storesLoc.length - 1]) / 2;
            System.out.println((parking - storesLoc[0]) * 2 + (storesLoc[storesLoc.length - 1] - parking) * 2);
        }
    }
}
