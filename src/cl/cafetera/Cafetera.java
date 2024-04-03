package cl.cafetera;

public class Cafetera {
    /**
     * Atributos de la cafetera.
     */
    int capacidadMaxima;
    int cantidadActual;

    /**
     * Constructor de la cafetera.
     */

    public Cafetera (int capacidadMaxima, int cantidadActual){
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Getters y Setters de la cafetera.
     */

    public int getCantidadActual() {
        return cantidadActual;
    }

    /**
     * Metodos de comportamiento de la cafetera
     */
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    public boolean agregarCafe(int cafecito){
        boolean resultado;
        if (this.cantidadActual + cafecito > this.capacidadMaxima){
            resultado = false;
        }else{
            this.cantidadActual= this.cantidadActual + cafecito;
            resultado = true;
        }
        return resultado;
    }
    public boolean servirTaza(int cantidadCafe){
        boolean resultado;
        if (this.cantidadActual < cantidadCafe){
            resultado = false;
        }else{
            resultado = true;
            this.cantidadActual = this.cantidadActual - cantidadCafe;
        }
        return resultado;
    }

}
