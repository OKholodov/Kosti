public class Game {

    private int roundCount;

    Game(int roundCount) {
        this.roundCount = roundCount;
    }

    public void doGame(Player player1, Player player2) {

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i<=roundCount; i++) {

            System.out.println();
            System.out.println("Round " + i + " started!");
            player1.doFling();
            player2.doFling();

            if (player1.getCurrentNum() > player2.getCurrentNum()) {
                System.out.println("Player 1 (" + player1.getName() + ") won in current round!");
                sum1++;
            }
            else if (player2.getCurrentNum() > player1.getCurrentNum()) {
                System.out.println("Player 2 (" + player2.getName() + ") won in current round!");
                sum2++;
            }
            else {
                System.out.println("The friendship is won in current round!");
                sum1++;
                sum2++;
            }
        }

        System.out.println();

        if (sum1 > sum2) {
            System.out.println("Player 1 (" + player1.getName() + ") won in game with count = "+ sum1 + ":" + sum2);
        }
        else if (sum2 > sum1) {
            System.out.println("Player 2 (" + player2.getName() + ") won in game with count = "+ sum2 + ":" + sum1);
        }
        else {
            System.out.println("The friendship is won in game with count = "+ sum2 + ":" + sum1);
        }


    }
}
