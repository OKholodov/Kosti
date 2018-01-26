public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Zahar");
        Player player2 = new Player("Vitalia");
        Game g = new Game(5000);

        g.doGame(player1,player2);
    }
}
