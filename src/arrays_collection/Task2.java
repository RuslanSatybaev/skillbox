package arrays_collection;

public class Task2 {
    private static final int COUNT_PATIENT = 30;
    private static final float MIN_TEMP = 32.0f;
    private static final float MAX_TEMP = 40.0f;
    private static final float MIN_TEMP_HEALTH = 36.2f;
    private static final float MAX_TEMP_HEALTH = 36.9f;

    public static void main(String[] args) {
        float[] tempPatient = new float[COUNT_PATIENT];
        for (int i = 0; i < tempPatient.length; i++) {
            tempPatient[i] = (float) (Math.random() * (MAX_TEMP - MIN_TEMP) + 1) + MIN_TEMP;
        }
        System.out.print("Температуры пациентов: ");
        float sum = 0;
        int countHealthy = 0;
        for (float everyTemp : tempPatient) {
            System.out.print(everyTemp + " ");
            if (everyTemp > MIN_TEMP_HEALTH && everyTemp < MAX_TEMP_HEALTH) {
                countHealthy++;
            }
            sum += everyTemp;
        }
        System.out.println("\nСредняя температура: " + sum / COUNT_PATIENT);

        System.out.println("Количество здоровых: " + countHealthy);
    }
}
