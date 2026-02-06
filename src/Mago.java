
public class Mago extends Entidad {
    private int mana;

    public Mago(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    @Override
    public void atacar() {
        if (mana >= 10) {

            int daño = getNivel() * 4;
            System.out.println(getNombre() + " lanza un hechizo! (Daño: " + daño + ")");
            mana -= 10;
            System.out.println("Mana restante: " + mana);
        } else {
            System.out.println(getNombre() + " no tiene suficiente mana!");
        }
    }

    @Override
    public int calcularDefensa() {
        return mana / 10;
    }

    public void cartaBolaFuego() {
        if (mana >= 20) {
            System.out.println(getNombre() + " lanza BOLA DE FUEGO");

            System.out.println("Daño: " + (getNivel() * 6));
            mana -= 20;
        } else {
            System.out.println("Mana insuficiente para Bola de Fuego");
        }
    }

    public void cartaEscudoMagico() {
        System.out.println(getNombre() + " crea un ESCUDO MAGICO");
        System.out.println("Absorbe el proximo ataque enemigo");
    }

    public void cartaRayoHelado() {
        if (mana >= 15) {
            System.out.println(getNombre() + " lanza RAYO HELADO");
            System.out.println("El enemigo se ralentiza");
            mana -= 15;
        }
    }

    public void cartaTormentaElectrica() {
        if (mana >= 30) {
            System.out.println(getNombre() + " invoca TORMENTA ELECTRICA");
            System.out.println("Daño en area a todos los enemigos");
            mana -= 30;
        }
    }

    public void meditar() {
        System.out.println(getNombre() + " medita para recuperar mana");
        mana += 25;
        System.out.println("Mana actual: " + mana);
    }

    public int getMana() {
        return mana;
    }
}
