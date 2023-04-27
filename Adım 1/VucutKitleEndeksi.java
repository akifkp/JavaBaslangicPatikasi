import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double boy, kilo;
        Scanner b1 = new Scanner(System.in);
        Scanner k1 = new Scanner(System.in);
        System.out.print("Boyunuz:");
        boy = b1.nextDouble();
        System.out.print("Kilonuz:");
        kilo = k1.nextDouble();
        System.out.println("Vücut kitle endeksiniz:"+ (kilo / boy * boy));
    }
}
