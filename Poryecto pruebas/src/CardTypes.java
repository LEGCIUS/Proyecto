import java.util.List;

public class CardTypes {
    private List<Cards> cardsOfType;
    
    public CardTypes(List<Cards> cardsOfType) {
        this.cardsOfType = cardsOfType;
    }
    
    public List<Cards> getCardsOfType() {
        return cardsOfType;
    }

    public void addCardOfType(Cards card) {
        cardsOfType.add(card);
    }
}