package model;

public class Cat {
    private static final int COUNT_EYE = 2;
    private static final double MIN_WEIGHT = 1000;
    private static final double MAX_WEIGHT = 9000;
    private static int count;
    private static double weightAfterFeed;
    private double originWeight;
    private double weight;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }

    public Cat(Double weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;
        weightAfterFeed = weight;
        System.out.println(weight);
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public double sumFeed() {
        return weightAfterFeed - originWeight;
    }

    public void pee() {
        weight -= 10;
        System.out.println(weight);
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            count--;
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            count--;
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}