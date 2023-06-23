import java.util.Scanner;
public class EtkinlikSihirbazi {
    public static void main(String[] args) {
        int derece;
        Scanner sicaklik = new Scanner(System.in);
        System.out.print("Şu an hava kaç derece? ");
        derece = sicaklik.nextInt();
        if (derece<5){
            System.out.println("Kayak yapmanı önerebilirim.");
        } else if (derece>5 & derece<15) {
            System.out.println("Sinemaya gitmeni önerebilirim.");
        } else if (derece>15 & derece<25) {
            System.out.println("Piknik yapmanı önerebilirim.");
        } else if (derece>25) {
            System.out.println("Yüzmeni önerebilirim.");
        }
    }
}

