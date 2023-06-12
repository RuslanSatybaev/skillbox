package model;

import java.util.Objects;

public class Cat {
    private static final int COUNT_EYE = 2;
    private static final double MIN_WEIGHT = 1000;
    private static final double MAX_WEIGHT = 9000;
    private static int count;
    private static double weightAfterFeed;
    private double originWeight;
    private double weight;
    private Color color;
    private String name;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }

    public Cat(Double weight) {
        this.weight = weight;
    }

    public Cat(double weight, Color color, String name) {
        this.weight = weight;
        this.color = color;
        this.name = name;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Double.compare(cat.originWeight, originWeight) == 0 && Double.compare(cat.weight, weight) == 0 && color == cat.color && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color, name);
    }
}