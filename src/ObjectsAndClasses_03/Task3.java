package ObjectsAndClasses_03;

import model.Cat;

public class Task3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        System.out.println(Cat.getCount());

        while (!cat2.getStatus().equals("Dead")) {
            cat2.meow();
        }

        double amount = 100;
        while (!cat1.getStatus().equals("Exploded")) {
            cat1.feed(amount);
            amount += 100;
        }

        System.out.println(Cat.getCount());
    }
}
