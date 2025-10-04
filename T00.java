import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil1, bil2, ho;

        System.out.println("masukkan bilangaan pertama");
        bil1 = Integer.parseInt(input.nextLine());
        System.out.println("masukkan bilangan kedua");
        bil2 = Integer.parseInt(input.nextLine());
        if (bil1 % 2 == 0) {
            System.out.println("bilangan pertama: genap");
        } else {
            System.out.println("bilangan pertama: ganjil");
        }
        if (bil2 % 2 == 0) {
            System.out.println("bilangan kedua : genap");
        } else {
            System.out.println("bilangan kedua : ganjil");
        }
        if (bil1 == bil2) {
            System.out.println("kedua bilangan sama besar");
        } else {
            if (bil1 > bil2) {
                System.out.println("bilangan pertama lebih besar");
            } else {
                System.out.println("bilangan kedua lebih besar");
            }
        }
        if (bil1 % 2 != 0 && bil2 % 2 != 0) {
            ho = bil1 * bil2;
            System.out.println("hasil perkalian:" + ho);
        } else {
            if (bil1 % 2 == 0 && bil2 % 2 == 0) {
                ho = bil1 + bil2;
                System.out.println("hasil penjumlahan:" + ho);
            } else {
                System.out.println("berbea jenis");
            }
        }
    }
}
