package kemija;

public class Kemija {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        char[] inputCharArr = input.nextLine().toCharArray();
        int count = 0;
        for (char letter : inputCharArr) {
            if (count == 3) {
                count = 0;
            }

            if (count == 0) {
                switch (letter) {
                    case 'a':
                        System.out.print(letter);
                        count++;
                        break;
                    case 'e':
                        System.out.print(letter);
                        count++;
                        break;
                    case 'i':
                        System.out.print(letter);
                        count++;
                        break;
                    case 'o':
                        System.out.print(letter);
                        count++;
                        break;
                    case 'u':
                        System.out.print(letter);
                        count++;
                        break;
                    default:
                        System.out.print(letter);
                        break;
                }
            } else {
                count++;
            }
        }
        System.out.println("");
    }
}
