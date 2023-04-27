import java.util.Scanner;
public class TaksimetreUcreti {
    public static void main(String[] args) {
        double km, kmBasi = 2.20, acilisUcreti = 10;
        Scanner kilometre = new Scanner(System.in);
        System.out.print("Gidilen kilometreyi giriniz:");
        km = kilometre.nextDouble();
        if ((km * kmBasi + acilisUcreti) < 20) {
            System.out.println("Borcunuz 20TL.");
        } else if (((km * kmBasi + acilisUcreti) > 20)) {
            System.out.println("Borcunuz:" + (km * kmBasi + acilisUcreti)+ ("TL."));
        }
    }
}

