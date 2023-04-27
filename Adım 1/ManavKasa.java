import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double armut, armutFiyat = 2.14, elma, elmaFiyat = 3.67, domates, domatesFiyat = 1.11,
                muz, muzFiyat = 0.95, patlican, patlicanFiyat = 5.00;
        Scanner KG = new Scanner(System.in);
        System.out.print("Kaç kilogram armut aldınız? ");
        armut = KG.nextDouble();
        System.out.print("Kaç kilogram elma aldınız? ");
        elma = KG.nextDouble();
        System.out.print("Kaç kilogram domates aldınız? ");
        domates = KG.nextDouble();
        System.out.print("Kaç kilogram muz aldınız? ");
        muz = KG.nextDouble();
        System.out.print("Kaç kilogram patlıcan aldınız? ");
        patlican = KG.nextDouble();
        System.out.println("Borcunuz:" + (armut * armutFiyat +  elma * elmaFiyat +
                domates * domatesFiyat + muz * muzFiyat + patlican * patlicanFiyat ));
    }
}