
public class Mounstro extends Entidad implements Ataque {
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

    public void cartaRugidoAtronador() {
        System.out.println(getNombre() + " emite un RUGIDO ATRONADOR");
        System.out.println("Todos los enemigos retroceden asustados");
    }

    public void cartaGarraDesgarradora() {
        System.out.println(getNombre() + " usa GARRA DESGARRADORA");
        System.out.println("Causa sangrado que dura 3 turnos");
    }

    public void cartaTerremoto() {
        System.out.println(getNombre() + " provoca un TERREMOTO");
        System.out.println("Daño a todos los enemigos en el suelo");
    }

    public void cartaEngullir() {
        System.out.println(getNombre() + " intenta ENGULLIR al enemigo");
        System.out.println("Devora enemigos con poca vida");
    }

    public void enloquecer() {
        System.out.println(getNombre() + " ENLOQUECE de rabia!");
        ferocidad += 20;
        recibirDaño(10);
        System.out.println("Ferocidad aumentada a " + ferocidad);
    }

    public int getFerocidad() {
        return ferocidad;
    }

    @Override
    public void atacarFisico() {
        System.out.println(getNombre() + " golpea brutalmente con sus garras!");
    }

    @Override
    public void atacarVerinoso() {
        System.out.println(getNombre() + " muerde con veneno salvaje!");
    }

}
