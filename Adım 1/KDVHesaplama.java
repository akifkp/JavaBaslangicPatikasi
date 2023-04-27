import java.util.Scanner;
public class KDVHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kdvsizTutar;

        System.out.print("Toplam Tutarı Giriniz:");
        kdvsizTutar = inp.nextDouble();
        System.out.println("KDV'siz tutar:" + kdvsizTutar);
        if (kdvsizTutar < 1000)
        {
            System.out.println("KDV'li tutar:" + (kdvsizTutar + kdvsizTutar/18));
            System.out.println("Alınan KDV:" + (kdvsizTutar/18));
        }
        else if (kdvsizTutar >= 1000)
        {
            System.out.println("KDV'li tutar:" + (kdvsizTutar + kdvsizTutar/8));
            System.out.println("Alınan KDV:" + (kdvsizTutar/8));
        }

    }
}
