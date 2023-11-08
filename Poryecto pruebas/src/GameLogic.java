import java.util.List;

public class GameLogic {
    private Players player1;
    private Players player2;
    private Players currentPlayer;
    private boolean gameOver;

    /**
     * Inicializa una nueva instancia de la lógica del juego.
     *
     * @param player1 El primer jugador.
     * @param player2 El segundo jugador.
     */
    public GameLogic(Players player1, Players player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1; // Comienza con el jugador 1
        this.gameOver = false;
    }

    /**
     * Inicia el juego y permite que los jugadores se turnen para jugar cartas.
     */
    public void startGame() {
        while (!gameOver) {
            playTurn();
        }
        anunciarGanador();
    }

    private void playTurn() {
        Cards selectedCard = currentPlayer.seleccionarCartaParaJugar();
        if (selectedCard != null) {
            Players oponente = (currentPlayer == player1) ? player2 : player1;
            oponente.recibirDaño(selectedCard.calcularDaño());

            // Verificar si el juego ha terminado
            if (oponente.estaSinCartas()) {
                gameOver = true;
            }

            // Cambiar de turno
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }

    private void anunciarGanador() {
        if (player1.estaSinCartas() && player2.estaSinCartas()) {
            System.out.println("Empate. Ambos jugadores se han quedado sin cartas.");
        } else if (player1.estaSinCartas()) {
            System.out.println("El jugador 2 ha ganado. El jugador 1 se ha quedado sin cartas.");
        } else if (player2.estaSinCartas()) {
            System.out.println("El jugador 1 ha ganado. El jugador 2 se ha quedado sin cartas.");
        }
    }
}