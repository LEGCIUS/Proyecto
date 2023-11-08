public class Combat {
    private CombatCard player1Card;
    private CombatCard player2Card;

    public Combat(CombatCard player1Card, CombatCard player2Card) {
        this.player1Card = player1Card;
        this.player2Card = player2Card;
    }

    public void performAttack() {
        int player1Damage = player1Card.getDamage();
        int player2Damage = player2Card.getDamage();

        player2Card.reduceHealth(player1Damage);
        player1Card.reduceHealth(player2Damage);
    }

    public boolean isOver() {
        return player1Card.getHealth() <= 0 || player2Card.getHealth() <= 0;
    }

    public String getWinner() {
        if (player1Card.getHealth() <= 0) {
            return "Player 2";
        } else if (player2Card.getHealth() <= 0) {
            return "Player 1";
        } else {
            return "No winner yet";
        }
    }
}