class Game {

    private int roundCount;

    Game(int roundCount) {
        this.roundCount = roundCount;
    }

    void doGame(Player player1, Player player2) {

        int sum1 = 0;
        int sum2 = 0;

        int score1[] = new int[2];
        int score2[] = new int[2];

        for (int i = 1; i<=roundCount; i++) {

            System.out.println();
            System.out.println("Round " + i + " started!");

            score1[0] = player1.doFling();
            score2[0] = player2.doFling();

            score1[1] = player1.doFling();
            score2[1] = player2.doFling();

            if (score1[0] + score1[1] > score2[0] + score2[1]) {
                System.out.println("Player 1 (" + player1.getName() + ") won in current round! (" + score1[0] + "," + score1[1] + ":" + score2[0] + "," + score2[1] + ")");
                sum1++;
            }
            else if (score2[0] + score2[1] > score1[0] + score1[1]) {
                System.out.println("Player 2 (" + player2.getName() + ") won in current round! (" + score1[0] + "," + score1[1] + ":" + score2[0] + "," + score2[1] + ")");
                sum2++;
            }
            else {
                System.out.println("The friendship is won in current round! (" + score1[0] + "," + score1[1] + ":" + score2[0] + "," + score2[1] + ")");
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
