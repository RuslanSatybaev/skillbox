package ObjectsAndClasses_03;

import model.Cat;

public class Task1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        System.out.println(cat1.getStatus());
        System.out.println(cat1.getWeight());

        double amount = 100;
        while (!cat1.getStatus().equals("Exploded")) {
            cat1.feed(amount);
            amount += 100;
        }
        System.out.println("First cat status " +cat1.getStatus());

        while (!cat2.getStatus().equals("Dead")) {
            cat2.meow();
        }
        System.out.println("Second cat status " + cat2.getStatus());
    }
}
