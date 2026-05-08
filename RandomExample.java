import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // 1. Generate a random integer between 1 and 100
        int randomInt = random.nextInt(100) + 1;

        // 2. Generate a random double between 0.0 and 1.0
        double randomDouble = random.nextDouble();

        // 3. Generate a random boolean (true or false)
        boolean randomBool = random.nextBoolean();

        // Print the results to the console
        System.out.println("Random Integer (1-100): " + randomInt);
        System.out.println("Random Double (0.0-1.0): " + randomDouble);
        System.out.println("Random Boolean: " + randomBool);
    }
}
