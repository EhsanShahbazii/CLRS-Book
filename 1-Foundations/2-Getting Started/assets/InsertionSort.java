import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = {1,1,2,4,0,0,5,6,8,9};
        int key, i;
        for (int j = 1; j < data.length; j++) {
            key = data[j];
            i = j - 1;
            while (i >= 0 && data[i] > key) {
                data[i + 1] = data[i];
                i--;
            }
            data[i + 1] = key;
        }
        System.out.println(Arrays.toString(data));
    }
}
