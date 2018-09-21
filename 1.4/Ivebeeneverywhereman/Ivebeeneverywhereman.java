package ivebeeneverywhereman;

import java.util.HashSet;

public class IveBeenEverywhereMan {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int cases = Integer.parseInt(input.nextLine());

        for (int i = 0; i < cases; i++) {
            int worktrips = Integer.parseInt(input.nextLine());
            HashSet cities = new HashSet(worktrips);
            for (int trip = 0; trip < worktrips; trip++) {
                cities.add(input.nextLine());
            }

            System.out.println(cities.size());
        }
    }
}
