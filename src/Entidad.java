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

    public void recibirDaño(int cantidad) {
        int defensa = calcularDefensa();
        int dañoReal = cantidad - defensa;

        if (dañoReal > 0) {
            System.out.println(nombre + "recibe" + dañoReal + "puntos de daño");
            setPuntosVida(getPuntosVida() - dañoReal);

        } else {
            System.out.println(nombre + "bloquea todo el daño");
        }
    }

    public abstract void atacar();

    public abstract int calcularDefensa();

}
