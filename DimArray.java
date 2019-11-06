package Tel_Ran;

public class DimArray {

    public static void main(String[] args) {

    }
    static int[] []  fillArray() {
        int[] [] result = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                result[i] [j] = i * 10 + j;
            }
        }
    }
}
