import java.util.Arrays;
import java.util.SplittableRandom;

public class ThirdTask {
    public static void main(String[] args) {
        int[] array = new int[15];
        SplittableRandom rand = new SplittableRandom();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(-100, 100);
        }
        System.out.println("Массив имеет следующие значения: " + Arrays.toString(array));
        System.out.println("Элементы массива кратные трём: ");
        for (int var : array){
            if (var % 3 == 0){
                System.out.print(var + " ");
            }
        }
    }

}
