import java.util.Scanner;
public class NotHesaplama {
    public static void main(String[] args) {
        int matematikNotu,fizikNotu, kimyaNotu, turkceNotu, tarihNotu, muzikNotu, toplam;
        Scanner not = new Scanner(System.in);
        System.out.print("Matematik notunuz:");
        matematikNotu = not.nextInt();
        System.out.print("Fizik notunuz:");
        fizikNotu = not.nextInt();
        System.out.print("Kimya notunuz:");
        kimyaNotu = not.nextInt();
        System.out.print("Türkçe notunuz:");
        turkceNotu = not.nextInt();
        System.out.print("Tarih notunuz:");
        tarihNotu = not.nextInt();
        System.out.print("Müzik notunuz:");
        muzikNotu = not.nextInt();
        toplam = matematikNotu + fizikNotu + kimyaNotu + turkceNotu + tarihNotu + muzikNotu;
         double ortalama = toplam / 6.0;
        System.out.println("Ortalamanız:" + ortalama);
        System.out.println( ortalama < 60 ? "Sınıfta Kaldınız " : "Tebrikler Sınıfı Geçtiniz" );
    }
}
