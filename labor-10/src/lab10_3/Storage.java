package lab10_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class    Storage {
    private ArrayList<Product> termekek = new ArrayList<>();

    public Storage(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
// trim: eliminates leading and trailing spaces
                int ID = Integer.parseInt(items[0].trim());
                String name = items[1].trim();
// Convert String → int: Integer.parseInt( String)
                int amount = Integer.parseInt(items[2].trim());
                int price = Integer.parseInt((items[3].trim()));
                termekek.add(new Product(ID, name, amount, price));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    Collections.sort(termekek);
    }
public void update(String fileName) {
        int counter = 0;
    try (Scanner scanner = new Scanner(new File(fileName))) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                continue;
            }
            String[] items = line.split(" ");
            int ID = Integer.parseInt(items[0].trim());
            int amount = Integer.parseInt(items[1].trim());

            int pos = Collections.binarySearch(termekek, new Product(ID, "", 0, 0));
            if(pos >= 0){
                termekek.get(pos).increaseAmount(amount);
                counter++;
            }

        }
        System.out.println(counter + " db. termek update");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}

}
