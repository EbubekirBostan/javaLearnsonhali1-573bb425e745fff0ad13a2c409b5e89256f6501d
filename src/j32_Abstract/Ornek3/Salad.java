package j32_Abstract.Ornek3;

public abstract class Salad extends Food {

    public abstract void madeIn();// parent ve child abs classlarda aynı isimli method tanımlanabilir
    @Override
    public void taste() {
        System.out.println("Agam salatan gavurdağı çoban söğüş mü verelim :)");
    }
}
