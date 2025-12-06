import java.util.Scanner;

public class Tertinggi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("Masukkan elemen array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        int indexMax = 0;

        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
            if (max == arr[i]) {
                indexMax = i;
            }
        }

        System.out.println("Nilai maksimum terletak pada indeks ke-" + indexMax);
        in.close();
    }
}
