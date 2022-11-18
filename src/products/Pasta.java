package products;

public class Pasta extends Food {
    public final String typeOfPasta;

    public Pasta(int id, String name, int price, String expirationDate, String typeOfPasta) {
        super(id, name, price, expirationDate);
        this.typeOfPasta = typeOfPasta;
    }
}
