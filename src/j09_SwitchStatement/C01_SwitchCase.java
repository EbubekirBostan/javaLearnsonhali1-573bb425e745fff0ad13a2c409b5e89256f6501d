package j09_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        /*
Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
 karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
 ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
 Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
  Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
  çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
  Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

 ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
 */
        // TASK>>> Kullanıcının girdiği rakamı yazı ile print eden code create ediniz
        Scanner scan=new Scanner(System.in);
        System.out.println("0 ile 9 arasında bir rakam giriniz");
        int key=scan.nextInt();
        switch (key) {
            case 0 :
                System.out.println("girdiğiniz rakam sifir");
                break;
            case 1 :
                System.out.println("girdiğiniz rakam bir");
                break;
            case 2 :
                System.out.println("girdiğiniz rakam iki");
                break;
            case 3 :
                System.out.println("girdiğiniz rakam üç");
                break;
            case 4 :
                System.out.println("girdiğiniz rakam 4");
                break;
            case 5 :
                System.out.println("girdiğiniz rakam 5");
                break;
            case 6 :
                System.out.println("girdiğiniz rakam altı");
                break;
            case 7 :
                System.out.println("girdiğiniz rakam yedi");
                break;
            case 8 :
                System.out.println("girdiğiniz rakam sekiz");
                break;
            case 9 :
                System.out.println("girdiğiniz rakam dokuz");
                break;
            default:
                System.out.println("Lütfen 0 ile 9 arasında bir rakam giriniz");







        }



















    }
}
