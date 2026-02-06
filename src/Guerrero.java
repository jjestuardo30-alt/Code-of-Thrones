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

    public void cartaFuriaBerserker() {
        System.out.println(getNombre() + "Esta en furia Berserker!");
        resistencia += 10;
        recibirDaño(15);
        System.out.println("resistencia aumentada a" + resistencia);

    }

    public void cartaDefensaTotal() {
        System.out.println(getNombre() + "adopta DEFENSA TOTAL");
        System.out.println("Defensa duplicada por 1 turno");

    }

    public void cartaAtaqueGiratorio() {
        System.out.println(getNombre() + " realiza un ATAQUE GIRATORIO");
        System.out.println("Golpea a todos los enemigos cercanos");
    }

    public void cartaRomperDefensas() {
        System.out.println(getNombre() + " usa ROMPER DEFENSAS");
        System.out.println("Ignora el 50% de la defensa enemiga");
    }

}
