public abstract class Entidad {

    private String nombre;
    private int nivel;
    private int puntosVida;

    public Entidad(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;

    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int nuevaVida) {
        if (nuevaVida < 0) {
            this.puntosVida = 0;
            System.out.println(nombre + "Has sido derrotado");
        }

        else if (nuevaVida > 1000) {
            this.puntosVida = 1000;
            System.out.println(nombre + "Has alcanzado maximo de vida");
        }

        else {
            this.puntosVida = nuevaVida;
        }
    }

}
