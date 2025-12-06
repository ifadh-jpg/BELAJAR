import java.util.Scanner;

public class Terendah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("Masukkan elemen array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int min = arr[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
        }
        in.close();
        System.out.println("Nilai minimum adalah " + min);

    }
}
