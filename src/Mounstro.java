
public class Mounstro extends Entidad {
    private int ferocidad;

    public Mounstro(String nombre, int nivel, int puntosVida, int ferocidad) {
        super(nombre, nivel, puntosVida);
        this.ferocidad = ferocidad;
    }

    @Override
    public void atacar() {

        int daño = ferocidad + getNivel();
        System.out.println(getNombre() + " ataca salvajemente! (Daño: " + daño + ")");
    }

    @Override
    public int calcularDefensa() {
        return ferocidad / 2;
    }

}
