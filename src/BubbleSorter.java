import java.util.Arrays;

public class BubbleSorter {
    public static void sort(int[] array) {
        int symbol = 1;
        // i - номер прохода
        for (int i = 0; i < array.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
                System.out.println(symbol++);
                System.out.println(Arrays.toString(array));
            }
        }
        System.out.println();
    }
}
