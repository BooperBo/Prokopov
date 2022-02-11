public class Task1AndTask2 {
    public static void main(String[] args) {

        //      Первая задача
        System.out.println("Задача №1");

        double a1, b1, k = 0;
//        Math - это пакет, где лежат математические операции
//        sqrt - метод извлечения квадратного корня
//        cbrd - извелечение кубического корня
//        pow - возведение в степень
//        log - натуральнйы логарифм
//        log10 - десятичный логарифм
        a1 = (0.75 * Math.sqrt(0.5)) - (0.5 * Math.cbrt(4));
        b1 = Math.pow(100, 0.5 * Math.log(9) - Math.log10(2)) * (Math.tan(1 / 3));

        if (a1 > b1) {
            k = Math.sqrt((15 * Math.pow(a1, 2)) + (21 * Math.pow(b1, 2)));
        } else if (a1 <= b1) {
            k = Math.sqrt((15 * Math.pow(b1, 2)) + (21 * Math.pow(a1, 2)));
        }
        System.out.printf("Значение a = %f\n", a1); // %f - это число с плавающей точкой
        System.out.printf("Значение b = %f\n", b1); // \n - это перенос на новую строку
        System.out.printf("Значение k = %f\n", k);

//      Вторая задача
        System.out.println("\nЗадача № 2");

        double a2, b2;
        int x = random(0, 20); // случайное число от 0-20
        int z = random(0, 20);
        int y = random(0, 20);


        a2 = (2 * Math.cos(x - Math.PI / 6)) / (0.5 + Math.pow(Math.sin(random(0,10)), 2) * y);
        b2 = 1 + (Math.pow(z, 2) / (3 + (Math.pow(z, 2) / 5)));
        System.out.printf("Случайные числа:\n x = %d\n z = %d\n y = %d\n", x, z, y);
        System.out.printf("Значение а = %f\n", a2);
        System.out.printf("Значение b = %f", b2);
    }

    public static int random(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}



