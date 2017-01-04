/**
 * Created by mel on 1/4/17.
 */
public class LoopBasics {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i ++;
        }

        int even = 100;
        do {
            System.out.println(even);
            even = even - 5;
        } while (even >= -10);
    }
}
