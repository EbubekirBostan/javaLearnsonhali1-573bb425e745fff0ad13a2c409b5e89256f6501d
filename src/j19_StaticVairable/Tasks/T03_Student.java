package j19_StaticVairable.Tasks;

import java.util.ArrayList;
import java.util.List;

public class T03_Student {
    /*
     Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz
     */

    String name;
    int maxCredit;
    List<T03_Lesson> dersler=new ArrayList<>();
}
