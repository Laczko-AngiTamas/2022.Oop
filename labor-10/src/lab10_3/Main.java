package lab10_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
       /* ArrayList<Product> termekek = new ArrayList<>();
        termekek.add(new Product(55, "Milka", 7, 4));
        termekek.add(new Product(43, "Zewa", 6, 11));
        termekek.add(new Product(12, "Mikro", 1, 500));
        for (Product lepegeto : termekek) {
            System.out.println(lepegeto);
        }

        Collections.sort(termekek);
        System.out.println("Rendezes ID szerint: ");
        for (Product lepegeto : termekek) {
            System.out.println(lepegeto);
        }
        // Rendezes ar szerint
        termekek.sort((o1, o2) -> o1.getPrice() - o2.getPrice());
        System.out.println("Rendezes ar szerint: ");
        for (Product lepegeto : termekek) {
            System.out.println(lepegeto);
        }
        Collections.sort(termekek, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() == o2.getPrice()) {
                    return o1.getName().compareToIgnoreCase(o2.getName());
                }
                return o1.getPrice() - o2.getPrice();

            }
        });
        System.out.println("\n Rendezes ar alapjan:");
        for (Product lepegeto : termekek) {
            System.out.println(lepegeto);

       }*/

    Storage raktar = new Storage("data10.txt");
    long start = (int) System.currentTimeMillis();
    raktar.update("update1000000.txt");
    System.currentTimeMillis();


    }
}
