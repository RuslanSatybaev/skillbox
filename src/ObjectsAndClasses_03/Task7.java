package ObjectsAndClasses_03;

import model.Cat;
import model.Color;

public class Task7 {
    public static void main(String[] args) {
        Cat cat1 = new Cat(120.0, Color.BLACK, "murka");
        Cat cat2 = new Cat(cat1.getWeight(), cat1.getColor(), cat1.getName());
        System.out.println(cat1.equals(cat2));
    }
}
