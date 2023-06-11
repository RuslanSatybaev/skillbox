import model.Cat;

public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat.getStatus());

        String catWeight = String.format("%.2f", cat.getWeight());

        System.out.println(catWeight);

        while (cat.getWeight() >= 1000) {
            cat.meow();
        }


        String weightAfterMeow = String.format("%.2f", cat.getWeight());
        System.out.println(weightAfterMeow);
        System.out.println(cat.getStatus());

        cat.feed(9001.0);
        System.out.println(cat.getStatus());
        cat.drink(25.1);
    }
}