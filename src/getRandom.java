import java.util.Random;

public class getRandom {
    public static int getRnd(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
