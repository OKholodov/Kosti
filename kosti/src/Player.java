import java.util.Random;

class Player {
    private String name;
    private Random rnd = new Random();

    Player(String name) {
        this.name = name;
    }

    int doFling() {
        int curr;
        curr = rnd.nextInt(6);
        return curr == 0 ? 1 : curr;
    }

    String getName() {
        return name;
    }

}
