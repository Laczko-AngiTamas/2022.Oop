package oop.labor02.rectangle;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Rectangle[] rectangles = new Rectangle[10];


        Random rand = new Random();
        //Generate positive random numbers less than a bound
        double length = 1 + rand.nextInt(10);
        double width = 1 + rand.nextInt(10);
        for(int i =0; i<10; i++) {
            rectangles[ i ] = new Rectangle(length, width);

        }
        System.out.println(rectangles.length);

}
}

