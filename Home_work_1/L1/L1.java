package L1;

import java.util.ArrayList;
import java.util.List;

public class L1 {
    public static void main(String[] args) {
        Product water = new Product("h2o", 15.3);
        System.out.println(water);

        VendingMachine mach1 = new VendingMachine();
        System.out.println(mach1);

        List<Product> tovary = new ArrayList<>();
        tovary.add(water);
        tovary.add(new Product("vine",12));
        tovary.add(new Product("dust",10));
        tovary.add(new Soda("kind", 19, "grapes"));

        VendingMachine mach2 = new VendingMachine(tovary);
        System.out.println(mach2);
        System.out.println(mach2.findByName("kind"));
        System.out.println(mach2.findByPrice(12));
        System.out.println(mach2.findByPriceRange(9,13));
        System.out.println();
        System.out.println("-------");

       List<Product> chocolates = new ArrayList<>();

        chocolates.add(new Chocolate("Milka", 16, "with nuts"));
        chocolates.add(new Chocolate("Best choco", 10, "with orange"));
        chocolates.add(new Chocolate("Lovely choco", 15, "dark chocolate"));


      VendingMachine mach4 = new VendingMachine(chocolates);
       System.out.println(mach4);

    }
}
