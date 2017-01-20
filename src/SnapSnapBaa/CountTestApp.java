package SnapSnapBaa;

/**
 * @author Created by mel on 1/20/17.
 */
public class CountTestApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        Alligator alligator = new Alligator();
        Sheep sheep = new Sheep("Blackie", 0);

        System.out.println("Counting Alligators...\n");
        CountUtil.count(alligator, 3);

        System.out.println("\nCounting Sheep...\n");
        CountUtil.count(sheep, 2);
        System.out.println("\n");

//        Clone Blackie to create Dolly
        Sheep clone = (Sheep) sheep.clone();
        clone.resetCount();
        clone.setName("Dolly");
        clone.setCount(0);
        CountUtil.count(clone, 3);
        System.out.println("\n");

        sheep.resetCount();
        CountUtil.count(sheep, 1);

    }
}
