import java.util.Scanner;

public class Main {

    // Fungsi perkalianLoop
    public static int perkalianLoop(int n, int m) {
        int hasil = 0;

        if (m < 0) {
            for (int i = 1; i <= Math.abs(m); i++) {
                hasil -= n; // kurangi n berulang kali
            }
        } else {
            for (int i = 1; i <= m; i++) {
                hasil += n; // tambah n berulang kali
            }
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan n: ");
        int n = input.nextInt();
        System.out.print("Masukkan m: ");
        int m = input.nextInt();

        // Proses
        int hasil = perkalianLoop(n, m);

        // Output
        System.out.println("Hasil: " + hasil);

        input.close();
    }
}
