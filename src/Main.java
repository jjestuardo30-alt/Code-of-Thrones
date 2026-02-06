import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Entidad> personajes = new ArrayList<>();

        personajes.add(new Guerrero("Thor", 10, 150, 30));
        personajes.add(new Mago("Merlin", 12, 100, 80));
        personajes.add(new Mounstro("Godzilla", 15, 200, 40));

        for (Entidad p : personajes) {
            p.mostrarEstado();
        }

        for (Entidad p : personajes) {
            p.atacar();
        }

        Guerrero thor = (Guerrero) personajes.get(0);
        thor.cartaFuriaBerserker();
        thor.cartaCuracionRapida();

        Mago merlin = (Mago) personajes.get(1);
        merlin.cartaBolaFuego();
        merlin.cartaEscudoMagico();

        Mounstro godzilla = (Mounstro) personajes.get(2);
        godzilla.cartaRugidoAtronador();
        godzilla.cartaGolpeCritico();

        Entidad personajePrueba = personajes.get(0);

        personajePrueba.setPuntosVida(200);
        personajePrueba.setPuntosVida(-50);
        personajePrueba.setPuntosVida(1500);

        merlin.recibirDaño(60);

        thor.mostrarResistencia();
        merlin.meditar();
        godzilla.enloquecer();

        for (Entidad p : personajes) {
            p.mostrarEstado();
        }
    }
}