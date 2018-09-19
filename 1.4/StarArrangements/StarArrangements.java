package stararrangements;

public class StarArrangements {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        String inputString = input.nextLine();
        int allStars = Integer.parseInt(inputString);
        int halfstar;

        if (allStars % 2 == 0) {
            halfstar = allStars / 2;
        } else {
            halfstar = allStars / 2 + 1;
        }

        System.out.println(allStars + ":");

        for (int i = 2; i <= halfstar; i++) {
            int stars = 0;
            boolean more = true;
            // en mer
            while (stars <= allStars) {
                if (stars == allStars) {
                    System.out.println(i + "," + (i - 1));
                    break;
                } else {
                    if (more) {
                        stars += i;
                    } else {
                        stars += i - 1;
                    }
                    more = !more;
                }
            }

            stars = 0;
            // samma på varje
            while (stars <= allStars) {
                stars += i;
                if (stars == allStars) {
                    System.out.println(i + "," + i);
                }
            }
        }
    }
}
