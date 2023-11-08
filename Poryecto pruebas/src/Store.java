import java.util.List;

public class Store {
    public static void main(String[] args) {
        // Crear algunas cartas (esto se haría una sola vez)
        List<Cards> cartas = CardManager.cargarCartas();

        // Mostrar las cartas
        for (Cards carta : cartas) {
            System.out.println("Nombre: " + carta.getNombre());
            System.out.println("Vida: " + carta.getVida());
            System.out.println("Daño: " + carta.getDanio());
            System.out.println("Habilidades: " + carta.getHabilidades());
            System.out.println("------------");
        }
    }
}