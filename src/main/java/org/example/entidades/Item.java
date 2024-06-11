package org.example.entidades;

public class Item {


    private String nombre = "Zapatilla";
    private String descripcion = "De cuero";
    private int cantidad = 2;
    private float precio = 100;
    private float precioCantidad = 200;

    public Item() {

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecioCantidad() {
        return precioCantidad;
    }

    public void setPrecioCantidad(float precioCantidad) {
        this.precioCantidad = precioCantidad;
    }

    public void anadirUnoCantidad (){
        if(cantidad<15){
            cantidad++;
        } else {
            System.out.printf("Se ha llegado a la cantidad máxima por item");
        }
    }
}
