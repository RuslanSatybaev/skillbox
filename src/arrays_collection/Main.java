package arrays_collection;

public class Main {
    public static void main(String[] args) {
        int[] roomCounts = new int[6];
        roomCounts[0] = 5;
        roomCounts[1] = 45;
        roomCounts[2] = 34;
        roomCounts[3] = 28;
        for (int i = 0; i < roomCounts.length; i++) {
            System.out.println(roomCounts[i]);
        }
        String text = "Каждый охотник желает   знать, где сидит фазан";
        String[] colors = text.split(",?\\s+");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        int[] winTickets = new int[10];

        int[] tickets = new int[1000];
        for (int i = 0; i < tickets.length; i++) {
            int randomNumber = 1_000_000 + (int) (Math.random() * 1_000_000);
            tickets[i] = randomNumber;
            if (i % 100 == 0) {
                winTickets[i / 100] = randomNumber;
            }
            System.out.println(randomNumber);
        }
        System.out.println("==============================================");
        for (int winTicket : winTickets) {
            System.out.println(winTicket);
        }
    }
}
