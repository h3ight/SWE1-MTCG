package mtcg.card;
import java.util.ArrayList;

public class Deck {
    private ArrayList<ICard> deck;
    /*private final ICard card;

    public Deck(ICard card) {
        this.card = card;
    }
    */
    public Deck(){
        deck = new ArrayList<>();
    }


    public void addCardToDeck(ICard card){
        deck.add(card);
    }
    public ArrayList<ICard> getDeck(){
        return deck;
    }
}
