package sumasuprotnedijagonalematrica;

public class SumaSuprotneDijagonaleMatrica {

    public static void main(String[] args) {
        int array[][] = {
            {1, 2, 3, 4},
            {4, 3, 2, 1},
            {5, 6, 7, 8},
            {8, 7, 6, 5},};
        int sumMinD = 0;
        int k = Math.min(array.length, array[0].length);
        for (int i = 0; i < k; ++i) {
            sumMinD += array[i][k - 1 - i];
        }
        System.out.println(sumMinD);

    }
}
