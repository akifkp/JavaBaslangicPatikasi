import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, nottoplam;
        Scanner not = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        matematik = not.nextInt();
        if (matematik > 100 || matematik < 0) {
            System.out.println("Girdiğiniz not 0 ve 100 arasında olmalıdır");
            System.exit(matematik);
        }
        System.out.print("Fizik notunuz: ");
        fizik = not.nextInt();
        if (fizik > 100 || fizik < 0) {
            System.out.println("Girdiğiniz not 0 ve 100 arasında olmalıdır");
            System.exit(fizik);
        }
        System.out.print("Türkçe notunuz: ");
        turkce = not.nextInt();
        if (turkce > 100 || turkce < 0) {
            System.out.println("Girdiğiniz not 0 ve 100 arasında olmalıdır");
            System.exit(turkce);
        }
        System.out.print("Kimya notunuz: ");
        kimya = not.nextInt();
        if (kimya > 100 || kimya < 0) {
            System.out.println("Girdiğiniz not 0 ve 100 arasında olmalıdır");
            System.exit(kimya);
        }
        System.out.print("Müzik notunuz: ");
        muzik = not.nextInt();
        if (muzik > 100 || muzik < 0) {
            System.out.println("Girdiğiniz not 0 ve 100 arasında olmalıdır");
            System.exit(muzik);
        }
        nottoplam = (matematik+fizik+turkce+kimya+muzik)/5;
        System.out.println("Ortalamanız: " + nottoplam);
        if (nottoplam>55){
            System.out.println("Sınıfı geçtiniz");
            }    else if (nottoplam<55) {
                 System.out.println("Sınıfta kaldınız");
        }
    }
}

