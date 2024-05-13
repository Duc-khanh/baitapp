public class bai18 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }


        }
        System.out.println("tong " + ( min + max));
    }
}
