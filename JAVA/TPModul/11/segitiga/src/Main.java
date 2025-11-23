import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Segitiga s = new Segitiga();

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        // Tetap cek segitiga sah terlebih dahulu
        if (!s.segitigaSah(a, b, c)) {
            System.out.println("Segitiga sama sisi: False");
            System.out.println("Segitiga sama kaki: False");
            System.out.println("Segitiga siku-siku: False");
        } else {
            System.out.println("Segitiga sama sisi: " 
            + s.segitigaSamaSisi(a, b, c));
            System.out.println("Segitiga sama kaki: " 
            + s.segitigaSamaKaki(a, b, c));
            System.out.println("Segitiga siku-siku: " + 
            s.segitigaSikuSiku(a, b, c));
        }

        in.close();
    }
}
