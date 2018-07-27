import java.util.ArrayList;
import java.util.List;

class ConvertNumbersToCards {

    private List<String> communityCardsString = new ArrayList<>();

    ConvertNumbersToCards() {
    }

    void convertNumbersToCards(CommunityCards communityCards) {
        for (Integer card : communityCards.getCommunityCards()) {
            switch (card) {
                case 11:
                    this.communityCardsString.add("J");
                    break;
                case 12:
                    this.communityCardsString.add("Q");
                    break;
                case 13:
                    this.communityCardsString.add("K");
                    break;
                case 14:
                    this.communityCardsString.add("A");
                    break;
                default:
                    this.communityCardsString.add(String.valueOf(card));
                    break;
            }
        }
        communityCards.setCommunityCardsStrings(this.communityCardsString);
    }
}
