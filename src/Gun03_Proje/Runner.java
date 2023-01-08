package Gun03_Proje;
/*
Gelen talebe göre müşterimizin kullanmış olduğu yiyecek-içecek makinesinin yazılım alt yapısı yapılacaktır. Müşterimizin talepleri doğrultusunda user makineden yiyecek-içeçek alabilmeli, para üstü alabilmeli, bakiyesine para ekleyebilmelidir.
Üç farklı class oluşturulmalıdır.
Class:
1	Urun

2	Options
3	Runner
Urun Class ı Nitelikler:
•	1kraker=2.5;
•	2cips=2.2;
•	3cocaCola=2.2;
•	4fanta=2.0;
•	5su=1.0;
•	6cay=1.5;
•	7filtreKahve=1.99;
•	8productNum;
•	9price;
•
Urun Class ı Metotları:
•	toString()  → Konsola ilgili ürünlerin fiyatları ile birlikte gösterebilecek bir metot oluşturunuz.

Options Class ı Metotları
•	select(Urun product) →  Parametre olarak Urun classından oluşturulan bir obje alınarak, ilgili ürünlere göre seçim yapması beklenir.
 Kullanıcı seçim yapabilmek için öncelikle ürünleri görmelidir.
•	balance(double price, double accountBalance, Urun product) → Parametre olarak, urunun fiyatı, mevcut bakiye, Urun classından oluşturulmuş
 bir obje alınarak satın alınmak istenen ürünün fiyatı kullanıcının bakiyesinden az ise ekleme yapmasına olanak sağlayan ve ya ekleme yapmak
 istemiyorsa programdan çıkışını sağlayabilecek bir metot oluşturunuz.
•	purchase(double price, double accountBalance, Urun product)-->  Parametre olarak, urunun fiyatı, mevcut bakiye, Urun classından oluşturulmuş
bir obje alınarak, bakiye satın alınmak istenen üründen daha fazla ve ya eşit ise satın alınma işlemi yapılmalı, kullanıcıya kalan bakiye gösterilmeli
 ve başka bir ürün alınıp alınmak istenmediği sorularak ilgili aksiyonlar alınmalıdır.  Kullanıcı başka bir ürün satın almak istiyorsa tekrardan
  ürünlerin gösterildiği metoda gitmelidir.
Runner Class ı Nitelikleri;


 */

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        double accountBalance = 1;
        Urun urun = new Urun();
        // System.out.println(urun.toString());
        Options options = new Options();
        //options.select(urun);
        urun.setPrice(options.select(urun));
        accountBalance = options.balance(urun.getPrice(), accountBalance,urun);
        //System.out.println(accountBalance);

    }
}
