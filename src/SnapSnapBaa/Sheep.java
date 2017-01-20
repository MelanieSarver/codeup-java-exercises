package SnapSnapBaa;

/**
 * @author Created by mel on 1/20/17.
 */
class Sheep implements Countable, Cloneable {
    private String name;
    private int count;

    private String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void setCount(int count) {
        this.count = count;
    }

    Sheep(String name, int count) {
        this.name = name;
        this.count = count;
    }



    @Override
    public int getCount() {
        return 0;
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
        return count + " " + name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
