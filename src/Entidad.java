public abstract class Entidad {

    private String nombre;
    private int nivel;
    private int puntosVida;
    private CartaEspecial[] cartas;

    public Entidad(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.cartas = new CartaEspecial[5];

    }

}
