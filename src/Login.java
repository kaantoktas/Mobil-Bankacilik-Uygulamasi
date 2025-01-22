import java.util.Scanner;

public class Login {
    public  boolean login(Hesap hesap ){

        Scanner scanner = new Scanner(System.in);
        String kullaniciAdi;
        String parola;

        System.out.println("kullanici adi : ");
        kullaniciAdi = scanner.nextLine();
        System.out.println("parola: ");
        parola = scanner.nextLine();

        if(hesap.getkullaniciAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola)){

            return true;
        }
        else{
            return false;
        }
    }
}
