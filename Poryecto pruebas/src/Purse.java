public class Purse {
    private int coins; // Variable coins inicializada en cero

    // Constructor que inicializa coins en cero
    public Purse() {
        this.coins = 0;
    }

    // Método para agregar monedas al monedero
    public void addCoins(int numberOfCoins) {
        this.coins += numberOfCoins;
    }

    // Método para restar monedas del monedero
    public void spendCoins(int numberOfCoins) {
        if (this.coins >= numberOfCoins) {
            this.coins -= numberOfCoins;
        } else {
            System.out.println("No hay suficientes monedas para gastar.");
        }
    }

    // Método para obtener la cantidad actual de monedas en el monedero
    public int getCoins() {
        return this.coins;
    }

    // Método para establecer la cantidad de monedas en el monedero directamente
    public void setCoins(int coins) {
        this.coins = coins;
    }
}