public class Game {
    public String winner(String[] deckSteve, String[] deckJosh) {
        String rank = "23456789TJQKA";
        int scoreSteve = 0;
        int scoreJosh = 0;

        for (int i = 0; i < deckSteve.length; i++) {
            int indexSteve = rank.indexOf(deckSteve[i]);
            int indexJosh = rank.indexOf(deckJosh[i]);

            if (indexSteve > indexJosh) {
                scoreSteve++;
            } else if (indexSteve < indexJosh) {
                scoreJosh++;
            }

        }

        if (scoreSteve > scoreJosh) {
            return "Steve wins " + scoreSteve + " to " + scoreJosh;
        } else if (scoreJosh > scoreSteve) {
            return "Josh wins " + scoreJosh + " to " + scoreSteve;
        } else {
            return "Tie";
        }
    }
}