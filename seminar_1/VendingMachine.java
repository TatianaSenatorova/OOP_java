import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class VendingMachine {
    private List<Product> prod_list;
    private static List<Product> DEFAULT = new ArrayList<>(Arrays.asList((new Product("rock", 1))));

    public VendingMachine(List<Product> prod_list) {
        this.prod_list = prod_list;
    }

    public VendingMachine() {
        this(DEFAULT);
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        prod_list.forEach(i->result.append(i.toString() + "\n"));
        return result.toString();
    }
    public List<Product> findByName (String name){
        List<Product> result = new ArrayList<>();
        prod_list.forEach(i->{
            if(i.getName().equals(name))
                result.add(i);
        });
        return result;
    }
    public List<Product> findByPrice (double price){
        List<Product> result = new ArrayList<>();
        prod_list.forEach(i->{
            if(i.getPrice() == price)
                result.add(i);
        });
        return result;
    }
    public List<Product> findByPriceRange (double p1, double p2){
        // List<Product> result = new ArrayList<>();
       // prod_list.forEach(i->{
       //     if(i.getPrice() < p2 && i.getPrice() > p1)
       //         result.add(i);
       // });
        return finder(p->p.getPrice() < p2 && p.getPrice() > p1);
    }
    private List finder(Function<Product, Boolean> f){
        List<Product> result = new ArrayList<>();
        prod_list.forEach(i->{
            if (Boolean.TRUE.equals(f.apply(i)));
            result.add(i);
        });
        return result;
    }
}
