package ObjectsAndClasses_03;

import model.Cat;

public class Task5 {
    public static void main(String[] args) {
        Cat cat1 = getKitten();
        Cat cat2 = getKitten();
        Cat cat3 = getKitten();

        System.out.println(cat1.getWeight() + "\n" + cat2.getWeight() + "\n" + cat3.getWeight());
    }

    private static Cat getKitten() {
        return new Cat(1100.00);
    }
}
