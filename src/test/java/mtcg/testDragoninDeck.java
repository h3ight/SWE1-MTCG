package mtcg;

import mtcg.card.Deck;
import mtcg.card.ICard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.internal.matchers.Null;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class testDragoninDeck {

    @Mock ICard mockedDrache;
    @Mock Deck mockedDeck;
    Deck deck;


    @BeforeEach
    void testDragon(){
    //deck = new Deck(mockedDrache, mockedDeck);
    mockedDeck.addCardToDeck(mockedDrache);
        Assertions.assertNotEquals(NULL);

    }

   


}
