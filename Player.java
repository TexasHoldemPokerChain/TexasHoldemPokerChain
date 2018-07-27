import java.util.ArrayList;
import java.util.List;

class Player {

    private String name;
    private List<String> hand = new ArrayList<>();
    private int cardA;
    private int cardB;

    private int handScore;

    Player(List<String> hand, String name) {
        this.hand = hand;
        this.name = name;
    }

    @Override
    public String toString() {
        String cardA = null, cardB = null;
        int i = 0;
        for (String card : hand) {
            if (i == 0){
                cardA = card;
            } else {
                cardB = card;
            }
            i++;
        }
        i = 0;
        String handString = cardA + ", " + cardB;
        return handString;
    }

    List<String> getHand() {
        return hand;
    }

    int getCardA() {
        return cardA;
    }

    void setCardA(int cardA) {
        this.cardA = cardA;
    }

    int getCardB() {
        return cardB;
    }

    void setCardB(int cardB) {
        this.cardB = cardB;
    }

    String getName() {
        return name;
    }

    public int getHandScore() {
        return handScore;
    }

    public void setHandScore(int handScore) {
        this.handScore = handScore;
    }
}