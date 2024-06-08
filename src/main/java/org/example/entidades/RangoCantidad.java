package org.example.entidades;

public class RangoCantidad {
    int cant;
    //Este metodo nos asegura que la cantidad no supere la maxima
    public boolean cantidadMaxima (){
        return cant <= 15;
    }

    //Este metodo nos asegura que la cantidad no sea negativa
    public boolean cantidadMinima (){
        return cant >= 0;
    }
    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
}
