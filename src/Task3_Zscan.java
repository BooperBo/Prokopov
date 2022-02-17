import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3_Zscan {
    static Scanner sc;
    static int n; // указывает количество строк и столбцов матрицы
    static int[][] point;
    static String direction = "right"; // указывает направление
    static int row;
    static int col;
    static List<Integer> list;
    static int count;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        n = sc.nextInt();
        point = new int[n][n];
        list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                point[i][j] = sc.nextInt();
            }
        }
        while (count <= n * n) {
            count++;
            if (row <= n - 1 && col <= n - 1) {
                list.add(point[row][col]);
            }
            if (direction.equals("right")) {
                // тогда строка остается без изменений, столбец добавляет 1
                col++;
                if (row == 0 && col < n) {
                    // Указывает, что если он находится в первой строке, то следующий шаг должен быть в нижнем левом углу
                    direction = "leftdown";
                } else if (row == n - 1 && col < n) {
                    // Если он внизу, он должен перейти в правый верхний угол
                    direction = "rightup";
                }
            } else if (direction.equals("leftdown")) {
                row++;
                col--;
                if (col > 0 && row < n - 1) {
                    // Если он всегда находится в этом диапазоне, переходим прямо в нижний левый угол
                    direction = "leftdown";
                } else if (col == 0 && row < n - 1) {
                    // Если вы дошли до крайнего левого угла, то спускайтесь вниз
                    direction = "down";
                } else if (col >= 0 && row == n - 1) {
                    // Если дошли до дна, то идем вправо
                    direction = "right";
                }
            } else if (direction.equals("down")) {
                row++;
                if (col == 0) {
                    // Если он уже находится в крайнем левом углу, перейдите в верхний правый угол сети
                    direction = "rightup";
                } else if (col == n - 1) {
                    // Если вы уже находитесь в крайнем правом углу, перейдите в нижний левый угол
                    direction = "leftdown";
                }
            } else if (direction.equals("rightup")) {
                row--;
                col++;
                if (row > 0 && col < n - 1) {// Если он всегда находится в этом диапазоне, перейдите в правый верхний угол
                    direction = "rightup";
                } else if (row == 0 && col < n - 1) {
                    // Если вы достигли вершины, идите вправо
                    direction = "right";
                } else if (row >= 0 && col == n - 1) {
                    // Если вы дошли до крайнего правого угла, то спускайтесь вниз
                    direction = "down";
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        printMatrix(point);
        summMass(point);
        summString(point);
    }

    public static int summMass(int a[][]) {
        int x = a.length;
        int summ = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                summ += a[i][j];
            }
        }
        System.out.println("Общая сумма всех элементова массива равна: " + summ);
        return summ;
    }
    public static void printMatrix(int a[][]) {
        int x = a.length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void summString(int a[][]) {
        int x = a.length;
        int s = 0;
        int Str1 = 0;
        while (s < x) {
            for (int i = 0; i < x; i++) {
                Str1 += a[s][i];
            }
            s++;
            System.out.println("Сумма елементов строки " + s + " равна: " + Str1);
            Str1 = 0;
        }
    }
}