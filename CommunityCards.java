import java.util.ArrayList;
import java.util.List;

class CommunityCards {

//     TODO: List<Integer> for flop (check win conditions)
//     TODO: int for turn (check again for win conditions)
//     TODO: int for river (final check for win conditions and final result)

    private List<Integer> communityCards = new ArrayList<>();
    private List<String> communityCardsStrings = new ArrayList<>();

    CommunityCards(int flopA, int flopB, int flopC, int turn, int river) {
        communityCards.add(flopA);
        communityCards.add(flopB);
        communityCards.add(flopC);
        communityCards.add(turn);
        communityCards.add(river);
    }

    List<Integer> getCommunityCards() {
        return communityCards;
    }

    public List<String> getCommunityCardsStrings() {
        return communityCardsStrings;
    }

    public void setCommunityCardsStrings(List<String> communityCardsStrings) {
        this.communityCardsStrings = communityCardsStrings;
    }
}
