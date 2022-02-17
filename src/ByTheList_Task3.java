import java.util.Scanner;

public class ByTheList_Task3 {

    static boolean stop;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целые значения: amin, amax, bmin, bmax, da, db, n");
        int amin = scanner.nextInt();
        int amax = scanner.nextInt();
        int bmin = scanner.nextInt();
        int bmax = scanner.nextInt();
        double da = scanner.nextDouble();
        double db = scanner.nextDouble();
        int n = scanner.nextInt();

        double yi = functionYi(amin, amax, bmin, bmax, da, db, n);
        if (yi != 0) {
            functionU(n, yi);
        }
    }

    private static double functionYi(int amin, int amax, int bmin, int bmax, double da, double db, int n) {

        System.out.println("Считаем функицю Yi.");
        double a, b, i;
        double f = 0;
        try {
            if (amin >= 0 && amin <= 10 && amax >= 0 && amax <= 10 &&
                    bmin >= 0 && bmin <= 10 &&
                    da >= 0 && da <= 10 && db >= 0 && db <= 10 &&
                    n >= 0 && n <= 10) {

                for (a = amin; a <= amax; a = +da) {
                    for (b = bmin; b <= bmax; b = +db) {
                        for (i = 0; 1 <= n; i = +1) {
                            if (a > b) {
                                f = ((i + 1) * Math.pow((2 * a + b * i), 1.5)) / (Math.pow(b - a, 2)) + a * i + Math.pow(i, 2);
                                System.out.println("Выполнилось условие а > b");
                            } else {
                                f = ((i - 1) * Math.pow((2 * b + a * i), 1.5)) / (Math.pow(b - a, 2)) + a * i + Math.pow(i, 2);
                                System.out.println("Выполнилось условие а <= b");
                                System.out.format("Значения: a     b     Yi\n");
                                System.out.printf("%13.1f %5.1f %5.1f\n", b, a, f);
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
            } else {
                throw new IllegalArgumentException("Неверное значение. Введите число от 0-10");

            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return f;

    }


    private static void functionU(int n, double yi) {
        System.out.println("\n*******************************\n");
        System.out.println("Считаем функцию U. \nВведите целое значение: a");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double g;
        int i;
        System.out.println("Значения: U     Yi");
        for (i = 0; i <= n; i++) {
            g = Math.sqrt((Math.pow(yi, 2) * i) + Math.pow(a, 2)) / 2;
            System.out.printf("%13.1f %6.1f\n", g, yi);
        }


    }

}

