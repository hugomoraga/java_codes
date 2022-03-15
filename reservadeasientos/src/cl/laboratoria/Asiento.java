package cl.laboratoria;

import static cl.laboratoria.Main.ANSI_GREEN;
import static cl.laboratoria.Main.ANSI_RESET;

public class Asiento {
    public String tipo;
    public int precio;
    public float ancho;
    public float profundidad;
    public boolean acolchado;
    public boolean disponible;

    Asiento (String tipo, int precio, float ancho, float profundidad, boolean acolchado){
        super();
        this.tipo = tipo;
        this.precio = precio;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.acolchado = acolchado;
        this.disponible = true;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public float getAncho() {
        return ancho;
    }

    public float getProfundidad() {
        return profundidad;
    }

    public boolean getAcolchado() {
        return acolchado;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setProfundidad(float profundidad) {
        this.profundidad = profundidad;
    }

    public void setAcolchado(boolean acolchado) {
        this.acolchado = acolchado;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String toString() {
        return String.format(ANSI_GREEN + "Reserva realizada de Asiento: %s, Valor: %s", this.tipo, this.precio + ANSI_RESET );
    }


}