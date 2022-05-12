
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adj meg valos szamokat: ");
        // Beolvasás billentyűzetről
        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();
        System.out.println(line);
        String[] values = line.split(" ");
        double sum = 0;
        //Beírt értékeket az alábbi módon adunk össze, miután deklaráltuk a "sum" változót:
        for(String i : values) {
            // ha nem számot írunk be, adjon hibaüzenetet:
            try {
            sum+= Double.parseDouble(i);
        }
            catch (NumberFormatException e) {
                System.out.println("Nem szam: " +i);
            }

            }
        System.out.println("Valos szamok osszege: " + sum);


}
}