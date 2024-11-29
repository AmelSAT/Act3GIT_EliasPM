package NUMEROS_RANDOMS;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        generateRandomNumbers();
    }

    public static void generateRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            int randomNumber = 1 + random.nextInt(10);
            System.out.println(randomNumber);
        }
    }
}
