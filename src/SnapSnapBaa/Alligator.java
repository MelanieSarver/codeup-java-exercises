package SnapSnapBaa;

/**
 * @author Created by mel on 1/20/17.
 */
class Alligator implements Countable{
    private int count;

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public void resetCount() {
        count = 0;
    }

    @Override
    public String getCountString() {
        return count + " alligator";
    }
}
