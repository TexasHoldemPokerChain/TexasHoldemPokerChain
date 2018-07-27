class ConvertCardsToNumbers {

    ConvertCardsToNumbers() {
    }

    void convertCardsToNumber(Player player) {
        int i = 0;
        for (String card : player.getHand()) {
            switch (card) {
                case "J":
                    if (i == 0) {
                        player.setCardA(11);
                    } else
                        player.setCardB(11);
                    break;
                case "Q":
                    if (i == 0) {
                        player.setCardA(12);
                    } else
                        player.setCardB(12);
                    break;
                case "K":
                    if (i == 0) {
                        player.setCardA(13);
                    } else
                        player.setCardB(13);
                    break;
                case "A":
                    if (i == 0) {
                        player.setCardA(14);
                    } else
                        player.setCardB(14);
                    break;
                default:
                    if (i == 0) {
                        player.setCardA(Integer.parseInt(card));
                    } else
                        player.setCardB(Integer.parseInt(card));
                    break;
            }
            i++;
        }
    }
}