import java.util.Scanner;

public class Task1AndTask2 {
    public static void main(String[] args) {

//        Math - это пакет, где лежат математические операции
//        sqrt - метод извлечения квадратного корня
//        cbrd - извелечение кубического корня
//        pow - возведение в степень
//        log - натуральный логарифм
//        log10 - десятичный логарифм

        //      Первая задача
        System.out.println("Задача №1");

        double a1, b1, k = 0;

        a1 = (0.75 * Math.sqrt(0.5)) - (0.5 * Math.cbrt(4));
        b1 = Math.pow(100, 0.5 * Math.log(9) - Math.log10(2)) * (Math.tan(1 / 3));

        System.out.printf("Значение a = %f\n", a1); // %f - это число с плавающей точкой
        System.out.printf("Значение b = %f\n", b1); // \n - это перенос на новую строку

        if (a1 > b1) {
            k = Math.sqrt((15 * Math.pow(a1, 2)) + (21 * Math.pow(b1, 2)));
            System.out.println("Выполнилось условие а > b");
        } else if (a1 <= b1) {
            k = Math.sqrt((15 * Math.pow(b1, 2)) + (21 * Math.pow(a1, 2)));
            System.out.println("Выполнилось условие a <= b");
        }

        System.out.printf("Значение k = %f\n", k);

        System.out.println("\n-------------------------------");

//      Вторая задача
        Scanner scanner = new Scanner(System.in); // Позволяет считывать входные данные в консоль

        System.out.println("\nЗадача № 2");

        System.out.println("Введите целые значения для x, y, z, sin от 0-10");

        double a2, b2;
        int x = scanner.nextInt(); // Ввод целого числа
        int z = scanner.nextInt();
        int y = scanner.nextInt();
        int sin = scanner.nextInt();

//      Блок обработки исключения
        try {
            if (x >= 0 && x < 10 && z >= 0 && z < 10 && y >= 0 && y < 10) {
                a2 = (2 * Math.cos(x - Math.PI / 6)) / (0.5 + (Math.sin(Math.pow(sin, 2)) * y));
                b2 = 1 + (Math.pow(z, 2) / (3 + (Math.pow(z, 2) / 5)));
                System.out.printf("Значение а = %f\n", a2);
                System.out.printf("Значение b = %f", b2);
            } else {
                throw new IllegalArgumentException("Введено неверное значение. Введите целое число от 0-10"); // бросает исключение
            }
        } catch (IllegalArgumentException e) {  // обрабатываем исключение
            e.printStackTrace();
        }
    }
}




