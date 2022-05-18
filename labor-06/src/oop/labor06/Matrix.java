package oop.labor06;

public class Matrix {
    private double data;
    private final int rows;
    private final int columns;

    public Matrix(double data, int rows, int columns) {
        this.data = data;
        this.rows = rows;
        this.columns = columns;
    }

    public void fillRandom(double rand) {

    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

}
