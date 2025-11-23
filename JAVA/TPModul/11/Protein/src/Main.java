import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Makan makan = new Makan();

        int pKarbo = in.nextInt();
        int kKarbo = in.nextInt();
        int pProtein = in.nextInt();
        int kProtein = in.nextInt();
        int jCemilan = in.nextInt();
        int kCemilan = in.nextInt();

        int totalKalori = makan.makanKarbo(pKarbo, kKarbo)
                        + makan.makanProtein(pProtein, kProtein)
                        + makan.makanCemilan(jCemilan, kCemilan); 
        System.out.println(totalKalori);
        in.close();
    }
}
