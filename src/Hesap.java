import java.util.Scanner;

public class Hesap {

    private String kullaniciAdi;
    private String parola;
    private int bakiye;

    public Hesap(String kullaniciAdi,String parola,int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.bakiye = bakiye;
        this.parola = parola;
    }
    public String getkullaniciAdi() {
            return kullaniciAdi;
    }
    public void setKullaniciAdi(String kullaniciAdi){
        this.kullaniciAdi=kullaniciAdi;
    }
    public String getParola(){
        return parola;
    }
    public void setParola(String parola){
        this.parola=parola;
    }
    public int getBakiye(){
        return bakiye;
    }
    public void setBakiye(int bakiye){
        this.bakiye=bakiye;
    }
    public void paraYatir(int tutar){

        bakiye += tutar;
        System.out.println("yeni bakiyeniz: " + bakiye);
    }
    public void paraCek(int tutar){

        if(bakiye<tutar){
            System.out.println("gecersiz miktar lütfen başka bir değer giriniz");
        }
        else{
            bakiye -= tutar;
            System.out.println("yeni bakiyeniz: " + bakiye);
        }
    }
}

