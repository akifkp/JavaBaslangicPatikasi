import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        int x, y, z;
        Scanner sayi = new Scanner(System.in);
        System.out.println("Birinci sayı(x) :");
        x = sayi.nextInt();
        System.out.println("İkinci sayı(y) :");
        y = sayi.nextInt();
        System.out.println("Üçüncü sayı(z) :");
        z = sayi.nextInt();
        if ((x < y) && (x < z)) {
            if (y > z) {
                System.out.println("x < z < y");
            } else {
                System.out.println("x < y < z");
            }

        } else if ((y < x) && (y < z)) {
            if (x > z) {
                System.out.println("y < z < x");
            } else {
                System.out.println("y < x < z");
            }

        } else if ((z < y) && (z < x)) {
            if (y > x) {
                System.out.println("z < x < y");
            } else {
                System.out.println("z < y < x");
            }
        }
    }
}