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

        int even = 0;
        do {
            System.out.println(even);
            even = even + 2;
        } while (even <= 100);
    }
}
