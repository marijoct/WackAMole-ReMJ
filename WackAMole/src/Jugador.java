public class Jugador {
}
public class Jugador {
    private static int cont = 0;
    private int puntos;
    private int id;

    public Jugador() {
        this.id = cont++;
        this.puntos = 0;
    }

    public int getId() {
        return id;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumaPuntos() {
        this.puntos++;
    }

    public void reiniciaPuntos() {
        this.puntos = 0;
    }

    public boolean equals(Jugador obj) {
        boolean respuesta = false;
        if (this.id == obj.getId())
            respuesta = true;
        return respuesta;
    }

    public String toString() {
        return "Jugador con id " + id + ", y " + puntos + " puntos.";
    }
}
