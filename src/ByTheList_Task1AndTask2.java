import java.util.Scanner;

public class ByTheList_Task1AndTask2 {
    public static void main(String[] args) {

//        Math - это пакет, где лежат математические операции
//        sqrt - метод извлечения квадратного корня
//        cbrd - извелечение кубического корня
//        pow - возведение в степень
//        log - натуральный логарифм
//        log10 - десятичный логарифм

        //      Первая задача
        System.out.println("Задача №1");

        double Lx, Ly, Lz = 0;

        Lx = (Math.pow(4, -0.25)) - (Math.pow(2 * Math.sqrt(2), -1.3)) * Math.tan(4);
        Ly = Math.cos(((2 * Math.atan(0.16)) + (Math.atan(0.20))));

        System.out.printf("Значение Lx = %f\n", Lx); // %f - это число с плавающей точкой. Чтобы округлить число
        // или вывести к примеру 2 знака после запятой, нужно добавить .2 перед f. Будет выглядеть так %.2f
        System.out.printf("Значение Ly = %f\n", Ly); // \n - это перенос на новую строку

        if (Math.abs(Lx) < 5 * Math.abs(Ly)) {
            Lz = Math.log(Math.abs((2 * Lx) - (3 * Math.exp(2) * Ly)));
            System.out.println("Выполнилось условие |Lx| < 5|Ly|");
        } else if (Math.abs(Lx) >= 5 * Math.abs(Ly)) {
            Lz = Math.log(Math.abs((2 * Lx * Math.exp(2)) - (3 * Ly)));
            System.out.println("Выполнилось условие |Lx| >= 5|Ly|");
        }

        System.out.printf("Значение Lz = %f\n", Lz);

        System.out.println("\n-------------------------------");

//      Вторая задача
        Scanner scanner = new Scanner(System.in); // Позволяет считывать входные данные с консоли

        System.out.println("\nЗадача №2");

        System.out.println("Введите целые значения для x, y, z от 0-10");

        double Y, f;
        double x = scanner.nextInt(); // Ввод целого числа
        double z = scanner.nextInt();
        double y = scanner.nextInt();

        //      Блок обработки исключения
        try {
            if (x >= 0 && x <= 10 && z >= 0 && z <= 10 && y >= 0 && y <= 10) {
                Y = Math.abs((Math.pow(x, y / x)) - (Math.cbrt(y / x)));
                f = (y - x) * ((y - z) / (y - x)) / (1 + Math.pow(y - x, 2));
                System.out.printf("Значение ℽ = %f\n", Y);
                System.out.printf("Значение φ = %f", f);
            } else {
                throw new IllegalArgumentException("Введено неверное значение. Введите целое число от 0-10"); // бросает исключение
            }
        } catch (IllegalArgumentException e) {  // обрабатываем исключение
            e.printStackTrace();
        }
    }

}
