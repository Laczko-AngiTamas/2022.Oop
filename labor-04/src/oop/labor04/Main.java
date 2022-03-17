package oop.labor04;

import oop.labor04.lab4_1.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFilePrintItsLineNumbered("lab4_1_input.txt");
        ArrayList<Person> persons = readFromCSVFile("lab4_1_input.csv");
        for(Person p : persons) {
            System.out.println(p);
        }
    }
// teszt
    public static void readFilePrintItsLineNumbered(String fileName) {

        try (Scanner scanner = new Scanner(new File(fileName))) {
            //beolvasas
            for (int i = 1; scanner.hasNextLine(); i++) {
                String Line = scanner.nextLine();
                System.out.println(i + ". " + Line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nem sikerult megnyitni a fajlt");
            e.printStackTrace();
        }

    }
    public static ArrayList<Person> readFromCSVFile(String fileName) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
// trim: eliminates leading and trailing spaces
                String firstName = items[0].trim();
                String lastName = items[1].trim();
// Convert String → int: Integer.parseInt( String)
                int birtYear = Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName, lastName, birtYear));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }

}
