import java.util.Scanner;
public class AlanVeCevre {
    public static void main(String[] args) {
        double yariCap, pi = 3.14;
        Scanner r = new Scanner(System.in);
        System.out.print("Dairenin yarıçapı:");
        yariCap = r.nextDouble();
        System.out.println("Dairenin alanı = " + ( pi * yariCap * yariCap));
        System.out.println("Dairenin çevresi = " + ( 2 * pi * yariCap));
    }
}
