package oop.labor02.rectangle;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int sum=0;
        int sum2=0;

        Rectangle[] rectangles = new Rectangle[10];


        Random rand = new Random();
        //Generate positive random numbers less than a bound

        for(int i =0; i<10; i++) {
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[ i ] = new Rectangle(length, width);
            System.out.println(rectangles[i].getLength() + " " + rectangles[i].getWidth() + " "
                    + rectangles[i].area() + " " + rectangles[i].perimeter() +"\n");
           sum += rectangles[i].area();
           sum2 += rectangles[i].perimeter();

        }
        System.out.println("Total area of the generated rectangles: \n" + sum);
        System.out.println("Total perimeter of the generated rectangles: \n" + sum2);

}
}

