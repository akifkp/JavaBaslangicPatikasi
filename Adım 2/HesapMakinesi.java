import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int d1, d2, islem;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Değer biri giriniz :");
         d1 = girdi.nextInt();
        System.out.print("Değer ikiyi giriniz: ");
        d2 = girdi.nextInt();
        System.out.println("1 - Toplama, 2 - Çıkarma, 3 - Çarpma, 4 - Bölme");
        System.out.println("Yapılacak işlem: ");
        islem = girdi.nextInt();
        switch (islem){
            case 1:
                System.out.print("İşleminizin sonucu: " + (d1+d2));
                break;
            case 2:
                System.out.print("İşleminizin sonucu: " + (d1-d2));
                break;
            case 3:
                System.out.print("İşleminizin sonucu: " + (d1*d2));
                break;
            case 4:
                System.out.print("İşleminizin sonucu: " + (d1/d2));
                break;
        }
    }
}