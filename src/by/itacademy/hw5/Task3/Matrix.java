package by.itacademy.hw5.Task3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

public class Matrix {
    private final double[][] m;
    private final int rowsQuantity;
    private final int columnsQuantity;

    public Matrix(int rowsQuantity, int columnsQuantity) {
        m = new double[rowsQuantity][columnsQuantity];
        this.rowsQuantity = rowsQuantity;
        this.columnsQuantity = columnsQuantity;
    }

    public Matrix(double[][] matrix) {
        this.m = matrix;
        rowsQuantity = matrix.length;
        columnsQuantity = matrix[0].length;
    }

    public Matrix(Matrix a) {
        this(a.getRowsQuantity(), a.getColumnsQuantity());
        for (int row = 0; row < rowsQuantity; row++) {
            for (int col = 0; col < columnsQuantity; col++) {
                this.setElement(row, col, a.getElement(row, col));
            }
        }
    }

    public int getRowsQuantity() {
        return rowsQuantity;
    }

    public int getColumnsQuantity() {
        return columnsQuantity;
    }

    public void setElement(int row, int column, double value) {
        m[row][column] = value;
    }

    public void fillRandom() {
        for (int row = 0; row < rowsQuantity; row++) {
            for (int col = 0; col < columnsQuantity; col++) {
                this.setElement(row, col, Math.random());
            }
        }
    }


    public double getElement(int row, int column) {
        return m[row][column];
    }

    public Matrix add(Matrix a) {
        if (rowsQuantity != a.getRowsQuantity() || columnsQuantity != a.getColumnsQuantity()) return new Matrix(0, 0);
        Matrix tmp = new Matrix(rowsQuantity, columnsQuantity);
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                tmp.setElement(i, j, this.getElement(i, j) + a.getElement(i, j));
            }
        }
        return tmp;
    }

    public Matrix multiply(Matrix a) {
        if (this.getColumnsQuantity() != a.getRowsQuantity()) return new Matrix(0, 0);
        Matrix tmp = new Matrix(rowsQuantity, a.getColumnsQuantity());
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < a.getColumnsQuantity(); j++) {
                for (int k = 0; k < columnsQuantity; k++) {
                    tmp.setElement(i, j, tmp.getElement(i, j) + this.getElement(i, k) * a.getElement(k, j));
                }
            }
        }
        return tmp;
    }

    public Matrix multiply(double a) {
        Matrix tmp = new Matrix(rowsQuantity, columnsQuantity);
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                tmp.setElement(i, j, this.getElement(i, j) * a);
            }
        }
        return tmp;
    }

    public Matrix divide(double a) {
        return a != 0 ? this.multiply(1 / a) : null;
    }


    public void print(String matrixName) {
        System.out.println("Matrix " + matrixName + ":");
        for (int i = 0; i < this.getRowsQuantity(); i++) {
            for (int j = 0; j < this.getColumnsQuantity(); j++) {
                System.out.printf(Locale.ROOT, "%1.4f    ", this.getElement(i, j));
            }
            System.out.println();
        }
        System.out.println();
    }

    public void toFile(FileWriter fw, String matrixName) throws IOException {
        fw.write("Matrix" + matrixName + ":\n");
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                fw.write(this.getElement(i, j) + "\t");
            }
            fw.write("\n");
        }
        fw.write("\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix matrix = (Matrix) o;

        if (rowsQuantity != matrix.rowsQuantity) return false;
        if (columnsQuantity != matrix.columnsQuantity) return false;
        return Arrays.deepEquals(m, matrix.m);
    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(m);
        result = 31 * result + rowsQuantity;
        result = 31 * result + columnsQuantity;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.getRowsQuantity(); i++) {
            for (int j = 0; j < this.getColumnsQuantity(); j++) {
                sb.append(this.getElement(i, j));
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}