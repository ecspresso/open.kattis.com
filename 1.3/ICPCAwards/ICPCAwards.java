package icpcawards;

import java.util.Scanner;

public class ICPCAwards {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int N = Integer.parseInt(inputScanner.nextLine());
        String[] winnerUnis = new String[12];
        String[] uniTeam;
        boolean winner = true;
        int location = 0;
        
        for(int i = 0; i < N; i++) {
            uniTeam = inputScanner.nextLine().split(" ");

            for(String wuni : winnerUnis) {
                if(wuni != null && wuni.equals(uniTeam[0])) {
                    winner = false;
                }
            }
            
            if(winner) {
                System.out.println(uniTeam[0]+" "+uniTeam[1]);
                winnerUnis[location++] = uniTeam[0];
                if(location == 12) break;
            } else winner = true;
        }
    }
}