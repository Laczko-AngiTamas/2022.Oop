package homework2.auto;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto("kek");
        auto1.novelSebesseg(Double.parseDouble("120"));
        System.out.println(auto1.ToString());
        System.out.println("Az auto sebessege: " + auto1.getSebesseg());
        Auto auto2 = new Auto("sarga");
        auto2.novelSebesseg(Double.parseDouble("60"));
        System.out.println(auto2.ToString());
        System.out.println("Az auto sebessege:" + auto2.getSebesseg());

    }

}

