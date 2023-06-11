package model;

public class Cat {
    private static int count;
    private static double weightAfterFeed;
    private final double originWeight;
    private final double minWeight;
    private final double maxWeight;
    private double weight;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
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
        if (weight < minWeight) {
            count--;
            return "Dead";
        } else if (weight > maxWeight) {
            count--;
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}