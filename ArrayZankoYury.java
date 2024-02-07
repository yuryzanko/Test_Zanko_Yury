public class ArrayZankoYury {
    public static void main(String[] args) {

        int[] numbers = new int[100];

        for (int i = 1; i < numbers.length; i++) {
            if (i % 3 == 0) {
                numbers[i] = i;
                System.out.println(numbers[i]);
            }
        }

    }
}


