package homework2.auto;

public class Auto {
    private String szin = "KEK";
    private int sebesseg = 0;

    public Auto() {
    }

    public Auto(String szin) {
        this.szin = szin;
    }

    public int getSebesseg() {
        return sebesseg;
    }

    public void novelSebesseg(double gyorsulas) {
        this.sebesseg += gyorsulas;
    }


    public String ToString() {
        return szin + " " + sebesseg;
    }
}
