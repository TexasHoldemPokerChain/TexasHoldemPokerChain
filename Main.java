import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> playerACardsInHand = new ArrayList<>();
        playerACardsInHand.add("J");
        playerACardsInHand.add("K");
        Player p1 = new Player(playerACardsInHand, "playerA");

        List<String> playerBCardsInHand = new ArrayList<>();
        playerBCardsInHand.add("2");
        playerBCardsInHand.add("A");
        Player p2 = new Player(playerBCardsInHand, "playerB");

        Game game = new Game(p1, p2);
        game.printWinner();
    }
}