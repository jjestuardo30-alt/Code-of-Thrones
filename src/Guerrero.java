public class Guerrero extends Entidad {
    private int resistencia;

    public Guerrero(String nombre, int nivel, int puntosVida, int resistencia) {
        super(nombre, nivel, puntosVida);
        this.resistencia = resistencia;
    }

    @Override
    public void atacar() {
        int daño = getNivel() * 3;
        System.out.println(getNombre() + "ataca con espada! (Daño: " + daño + ")");

    }

    @Override
    public int calcularDefensa() {
        return resistencia + (getNivel() / 2);

    }

}
