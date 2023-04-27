import java.util.Scanner;
public class HipotenusHesaplama {
    public static void main(String[] args) {
        double a, b, c;
        Scanner kenar = new Scanner(System.in);
        System.out.print("A kenarının uzunluğunu giriniz:");
        a = kenar.nextDouble();
        System.out.print("B kenarının uzunluğunu giriniz:");
        b = kenar.nextDouble();
        c = Math.sqrt((a * a) + (b * b));
        System.out.print("Hipotenüs=" + c);
    }
}
