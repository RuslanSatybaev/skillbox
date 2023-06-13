package arrays_collection;

public class ArrayDesc {
    public static void main(String[] args) {
        String text = "фазан фазан где где желает знать, Каждый Каждый  охотник сидит фазан";
        String[] colors = text.split(",?\\s+");
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }
        System.out.println("======================");
        for (int i = 0; i < colors.length; i++) {
            if (i > 0 && colors[i].equals(colors[i - 1])) {
                continue;
            }
            System.out.println(colors[i]);
        }
    }
}
