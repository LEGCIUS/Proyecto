public class PokemonCards {
    private String name;

    public PokemonCards(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class CardTypes extends PokemonCards {
    private String types;

    public CardTypes(String name, String types) {
        super(name);
        this.types = types;
    }

    public String getTypes() {
        return types;
    }
}

public class SpellCard extends PokemonCards {
       private String spellName;

    public SpellCard(String name, String spellName) {
        super(name);
        
        this.spellName = spellName;
    }
    public String getSpellName() {
        return spellName;
    }
}

public static void main(String[] args) {
    CardTypes cardTypes = new CardType();
    SpellCard spellCard = new SpellCard();

    System.out.println("Card Type: " + cardTypes.getName() + " - " + cardTypes.getType());
    System.out.println("Spell Card: " + spellCard.getName();