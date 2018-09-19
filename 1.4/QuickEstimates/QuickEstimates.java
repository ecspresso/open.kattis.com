package quickestimates;

public class QuickEstimates {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int N = Integer.parseInt(input.nextLine());
        for (int i = 0; i < N; i++) {
            System.out.println(input.nextLine().length());
        }
    }
}
