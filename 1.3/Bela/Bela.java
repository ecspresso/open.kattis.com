package bela;

public class Bela {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        String[] inputString = input.nextLine().split(" ");
        int hands = Integer.parseInt(inputString[0]);
        char suit = inputString[1].charAt(0);
        int score = 0;

        for (int i = 0; i < hands * 4; i++) {
            String hand = input.nextLine();
            switch (hand.charAt(0)) {
                case 'J':
                    if (hand.charAt(1) == suit) {
                        score += 20;
                    } else {
                        score += 2;
                    }
                    break;
                case '9':
                    if (hand.charAt(1) == suit) {
                        score += 14;
                    } else {
                        score += 0;
                    }
                    break;
                case 'A':
                    score += 11;
                    break;
                case 'K':
                    score += 4;
                    break;
                case 'Q':
                    score += 3;
                    break;
                case 'T':
                    score += 10;
                    break;
                case '8':
                    score += 0;
                    break;
                case '7':
                    score += 0;
                    break;
                default:
                    break;
            }
        }

        System.out.println(score);
    }
}
