package ObjectsAndClasses_03;

import model.Cat;

public class Task2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Weight: " + cat.getWeight());
        cat.feed(150.0);

        cat.pee();
        cat.pee();
        cat.pee();

        System.out.println("Weight: " + cat.getWeight());

        System.out.println(cat.sumFeed());
    }
}
