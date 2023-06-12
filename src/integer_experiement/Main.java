package integer_experiement;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;
    }

    public Integer sumDigits1(Integer number) {
        int num = number;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    public Integer sumDigits(Integer number) {
        return String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }
}
