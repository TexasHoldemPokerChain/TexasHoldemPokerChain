import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PossibleHands {

    private int points;
    private Player player;
    private CommunityCards communityCards;
    // TODO: use this (list of all 7 available cards)
    private List<Integer> allCards;

    PossibleHands(Player player, CommunityCards communityCards) {
        this.points = 0;
        this.communityCards = communityCards;
        this.player = player;
        this.allCards = setAllCards(player, communityCards);
    }

    private List<Integer> setAllCards(Player player, CommunityCards communityCards){
        List<Integer> allCards = new ArrayList<>();
        for (Integer communityCard : communityCards.getCommunityCards()) {
            allCards.add(communityCard);
        }
        allCards.add(player.getCardA());
        allCards.add(player.getCardB());
        return allCards;
    }

    void checkHand() {
//        twoOfAKind();
        newTwoOfAKind();
//        return points;
    }

    private void newTwoOfAKind() {
        int freq = 0;
        int card = 0;

        for (int i = 2; i < 15; i++){
            int frequency = Collections.frequency(allCards, i);
            if (frequency == 2){
                System.out.println(frequency + " occurances found of " + i);
                freq = 2;
                card = i;
            } else if(frequency == 3) {
                System.out.println(frequency + " occurances found of " + i);
                freq = 3;
                card = i;
            }
        }
        if(freq != 0){
            player.setHandScore(freq);
        } else {
            player.setHandScore(0);
        }
    }

    private void threeOfAKind(){
        int count;
        for (int card : communityCards.getCommunityCards()) {
            // TODO: Convert to Java 8 Stream
            if (((player.getCardA() == card) || (player.getCardB() == card) && (player.getCardA() != player.getCardB()))) {
                System.out.println(player.getName() + " has two of a kind (in " + card + "'s)");
                player.setHandScore(2);
            }
        }
    }
}