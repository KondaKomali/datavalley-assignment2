public class Main {
    public static void main(String[] args) {
        int[] values = {100, 52, 43, 99, 42, 40, 91};
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 5 == 0 && values[i] % 2 == 0) {
                sum += values[i];
            }
        }

        System.out.println("The sum of numbers divisible by both 5 and 2 is: " + sum);
    }
}
