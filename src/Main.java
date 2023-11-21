// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание №1");
        task1();
        System.out.println();
        System.out.println("Задание №2");
        task2();
        System.out.println();
        System.out.println("Задание №3");
        task3();
        System.out.println();
        System.out.println("Задание №4");
        task4();

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] sum = generateRandomArray();
        int totalSum = 0;
        for (int i = 0; i < sum.length; i++) {
            totalSum += sum[i];
        }
        System.out.println("Сумма трат за месяц составила "+totalSum+" рублей");
    }
    public static void task2() {
        int[] minMax = generateRandomArray();
        int sum1 = 0;
        int max = minMax[0];
        int min = minMax[0];
        for (int i = 0; i < minMax.length; i++) {
            sum1 += minMax[i];
            if (minMax[i] < min) {
                min = minMax[i];
            }
            if (minMax[i] > max) {
                max = minMax[i];
            }
        }
        System.out.println("Сумма трат за месяц составила " + sum1 + " рублей.");
        System.out.println("Минимальная сумма трат за месяц составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за месяц составила " + max + " рублей.");
    }
    public static void task3() {
        int days = 30;
        int averageValue = 0;
        int sum2 = 0;
        int [] expenses = generateRandomArray();
        for (int i = 0; i < expenses.length; i++) {
            sum2 = expenses[i];
        }
        averageValue = sum2 / days;
        System.out.println("Средняя сумма трат за день составила "+ averageValue +" рублей");
    }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i -1]);
        }
    }
}
