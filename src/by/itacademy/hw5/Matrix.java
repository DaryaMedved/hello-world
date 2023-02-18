package by.itacademy.hw5;
import java.util.Arrays;
public class Matrix {
        private int row;
        private int col;
        private int[][] array;

        public Matrix(int n, int m) {
            row = n;
            col = m;
            array = new int[row][col];
        }
        public Matrix(int ar[][]) {
            array = ar;
            row = array.length;
            col = array[0].length;
        }
        public int[][] getMatrix() {
            return array;
        }
        public void sumMatrix() {
            int sum = 0;
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++) sum += array[i][j];
            System.out.println("Сумма элементов матрицы: " + sum);
        }

        public void sizeMatrix() {
            System.out.println("Произведение количества строк "
                    + "и столбцов: " + row * col);
        }
    }
    class MatrixTest {
        public static void main(String[] args) {
            int n = 4, m = 5;
            int[][] ar = new int[n + 1][m + 2];

            System.out.println("Матрица1: ");
            Matrix matrix1 = new Matrix(n, m);
            ar = matrix1.getMatrix();
            fillMatrix(ar);
            printMatrix(ar);

            matrix1.sumMatrix();
            matrix1.sizeMatrix();

            System.out.println();

            System.out.println("Матрица2: ");
            fillMatrix(ar);
            printMatrix(ar);
            Matrix matrix2 = new Matrix(ar);
            
            matrix2.sumMatrix();
            matrix2.sizeMatrix();
        }
        public static void fillMatrix(int[][] matrix) {
            for (int[] arr : matrix) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (int) (Math.random() * 9 + 1);
                }
            }
        }
        public static void printMatrix(int[][] array) {
            for (int i = 0; i < array.length; i++)
                for (int j = 0; j < array[0].length; j++) {
                    System.out.print(array[i][j] + "\t");
                    if (j == array[0].length - 1) System.out.println();
                }
        }
    }

