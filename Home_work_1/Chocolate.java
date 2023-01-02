package L1;

public class Chocolate extends Product {

    public Chocolate(String name, double price, String flavor) {
        super(name, price);
        this.setFlavor(flavor);
    }

    private String flavor;


    public String getFlavor() {
        return flavor;
    }



    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public String toString()  {
        return String.format("%s - %s", super.toString(), flavor);
    }
}
