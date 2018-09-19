package ptice;

public class Ptice {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int questions = Integer.parseInt(input.nextLine());
        String answers = input.nextLine();

        String adrian = "ABCABCABCABCABCABCABCABC";
        String bruno = "BABCBABCBABCBABCBABCBABC";
        String goran = "CCAABBCCAABBCCAABBCCAABB";

        int adrianbrunogoran[] = {0, 0, 0};
        int location = 0;

        for (int i = 0; i < answers.length(); i++) {
            if (adrian.charAt(location) == answers.charAt(i)) {
                adrianbrunogoran[0]++;
            }
            if (bruno.charAt(location) == answers.charAt(i)) {
                adrianbrunogoran[1]++;
            }
            if (goran.charAt(location) == answers.charAt(i)) {
                adrianbrunogoran[2]++;
            }
            location++;
            if (location == 24) {
                location = 0;
            }
        }

        int max = 0;
        for (int i : adrianbrunogoran) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println(max);

        if (adrianbrunogoran[0] == max) {
            System.out.println("Adrian");
        }
        if (adrianbrunogoran[1] == max) {
            System.out.println("Bruno");
        }
        if (adrianbrunogoran[2] == max) {
            System.out.println("Goran");
        }
    }
}
