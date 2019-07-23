package ivan.samoylov;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static final int SIZE_OF_ARRAY = 5;

    public static void main(String[] args) {
	int arr[][] = new int[SIZE_OF_ARRAY][SIZE_OF_ARRAY];
	int flatArr[] = new int[SIZE_OF_ARRAY*SIZE_OF_ARRAY];
	Random random = new Random();
    int countElem = -1;

    System.out.print("Unsorted array: ");
    for (int i = 0; i < SIZE_OF_ARRAY; i++){
        for (int j = 0; j < SIZE_OF_ARRAY; j++){
            arr[i][j] = random.nextInt(50);
            flatArr[++countElem] = arr[i][j];
            System.out.print(" " + arr[i][j]);
        }
    }

    Arrays.sort(flatArr);

    System.out.println();
    System.out.print("Sorted array: ");
    countElem = -1;
    for (int i = 0; i < SIZE_OF_ARRAY; i++){
        for (int j = 0; j < SIZE_OF_ARRAY; j++){
             arr[i][j] = flatArr[++countElem];
             System.out.print(" " + arr[i][j]);
        }
    }
  }
}

