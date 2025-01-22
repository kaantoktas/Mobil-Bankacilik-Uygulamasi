import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap){

        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("bankamıza hoşgeldiniz");
        System.out.println("*****************");
        System.out.println("kullanici girisi");
        System.out.println("**********************");

        int girisHakki = 3;

        while(true) {
            if (login.login(hesap)) {
                System.out.println("giris basarili");
                break;
            } else {
                System.out.println("kullanici adi veya parola hatali");
                girisHakki--;
                System.out.println("kalan giris hakki: " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("giris hakkiniz bitti");

                return;
            }
        }
        System.out.println("********************");
        String islemler = "1. bakiye görüntüle \n"
                        +"2. para yatirma\n"
                        +"3. para cekme\n"
                        +"cıkıs için q ya basin";
        System.out.println(islemler);
        System.out.println("****************************");

        while(true){
            System.out.println("islemi seciniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("bakiyeniz: " + hesap.getBakiye());
            }
            else if (islem.equals("2")){
                System.out.println("yatirilacak tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if (islem.equals("3")) {
                System.out.println("cekmek istediginiz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);

            }
            else{
                System.out.println("gecersiz islem");
            }
        }

    }
}
