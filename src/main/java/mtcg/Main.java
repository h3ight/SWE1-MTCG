package mtcg;

import mtcg.card.Deck;
import mtcg.card.monstercard.Dragon;

public class Main {
    public static void main(String[] args){
        System.out.println("hello world");
        Dragon dragon = new Dragon();
        Deck deck1 = new Deck();
        deck1.addCardToDeck(dragon);
        System.out.println(deck1.toString());



    }
}
