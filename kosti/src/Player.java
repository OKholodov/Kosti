
import java.util.Random;


public class Player {
    private String name;
    private int currentNum;
    private Random rnd = new Random();

    Player(String name) {
        this.name = name;
    }

    public void doFling() {
        currentNum = rnd.nextInt(12);
    }

    public int getCurrentNum () {
        return currentNum;
    }

    public String getName() {
        return name;
    }

}
