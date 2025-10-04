import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil1, bil2, ho;

        bil1 = Integer.parseInt(input.nextLine());
        bil2 = Integer.parseInt(input.nextLine());
        if (bil1 % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama:Ganjil");
        }
        if (bil2 % 2 == 0) {
            System.out.println("Bilangan kedua : Genap");
        } else {
            System.out.println("Bilangan kedua : Ganjil");
        }
        if (bil1 == bil2) {
            System.out.println("Kedua bilangan sama besar");
        } else {
            if (bil1 > bil2) {
                System.out.println("Bilangan pertama lebih besar");
            } else {
                System.out.println("Bilangan kedua lebih besar");
            }
        }
        if (bil1 % 2 != 0 && bil2 % 2 != 0) {
            ho = bil1 * bil2;
            System.out.println("Hasil perkalian: " + ho);
        } else {
            if (bil1 % 2 == 0 && bil2 % 2 == 0) {
                ho = bil1 + bil2;
                System.out.println("Hasil penjumlahan: " + ho);
            } else {
                System.out.print("Berbeda jenis");
            }
        }
    }
}
