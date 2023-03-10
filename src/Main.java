import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
        System.out.println("Задача1");
        int[] array = generateRandomArray();
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма трат за месяц составила "+ sum +" рублей.");
    }

    public static void task2() {
        System.out.println("Задача2");
        int[] array = generateRandomArray();
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));
        int min = 1000_000;
        int max = 100_000;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " +min+" рублей. Максимальная сумма трат за день " +
                "составила "+max+" рублей");

    }

    public static void task3() {
        System.out.println("Задача3");
        int[] array = generateRandomArray();
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        if(array.length != 0){
        System.out.println("Средняя сумма трат за месяц составила "+ (double) sum / array.length+" рублей.");}
    }

    public static void task4() {
        System.out.println("Задача4");
        int[] array = generateRandomArray();
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1;i >= 0;i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
