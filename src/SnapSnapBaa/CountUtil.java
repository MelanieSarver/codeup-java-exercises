package SnapSnapBaa;

/**
 * @author Created by mel on 1/20/17.
 */
 class CountUtil {
    static void count(Countable c, int maxCount) {
        for (int i = 0; i < maxCount; i++) {
            c.incrementCount();
            System.out.println(c.getCountString());
        }

    }
}
