import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BusPandemi bus = new BusPandemi();

        int kapasitas = in.nextInt();
        int penumpang = in.nextInt();

        double persen = bus.persentase(kapasitas, penumpang);

        if (bus.berangkat(persen)) {
            System.out.println("berangkat");
        } else {
            System.out.println("tidak berangkat");
        }    

        in.close();
    }
}