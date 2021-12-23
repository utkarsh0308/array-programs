import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i<4; i++){
            list.add(in.nextInt());
        }

        for (int i = 0; i<4; i++){
            System.out.println(list.get(i));
        }
    }
}
