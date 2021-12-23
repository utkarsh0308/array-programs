import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] arr = {3,4,78,42};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[0] = 10;

    }
}
