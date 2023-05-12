import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String nickNameA, passwordA, evetHayir, newpw;
        Scanner login = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        nickNameA = login.next();
        System.out.print("Şifreniz: ");
        passwordA = login.next();
        if (nickNameA.equals("kullanici1") && passwordA.equals("defaultpw")) {
            System.out.print("Başarıyla giriş yapıldı.");
        } else {
            System.out.println("Girilen şifre yanlış, değiştirmek ister misiniz?(Evet/Hayır)");
            evetHayir = login.next();
            switch (evetHayir) {
                case "Evet":
                    System.out.print("Yeni şifrenizi giriniz: ");
                    newpw = login.next();
                      if (newpw.equals("defaultpw")){
                        System.out.print("Yeni şifreniz eskisiyle aynı olmamalıdır.");
                    }
                      else
                        System.out.print("Şifreniz başarıyla değiştirildi.");
                      break;
                case "Hayır" :
                    System.out.print("Program başarıyla sonlandırıldı.");
                    }
        }
    }
}
