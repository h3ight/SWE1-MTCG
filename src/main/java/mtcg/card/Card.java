package mtcg.card;

import lombok.Getter;
import lombok.ToString;

    @ToString
public abstract class Card implements ICard {

    @Getter
    private final String cardName;
    @Getter
    private final String elementType;
    @Getter
    private int damageNum;

    public Card (String cardName, int damageNum, String elementType ){
        this.cardName = cardName;
        this.damageNum = damageNum;
        this.elementType = elementType;
    }


}
