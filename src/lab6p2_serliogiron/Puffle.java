/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_serliogiron;

import java.awt.Color;

/**
 *
 * @author usuario
 */
public class Puffle {
    String nombre;
    double precio;
    Color color;

    @Override
    public String toString() {
        return "Puffle[ " + "nombre=" + nombre + ", precio=" + precio + ", color=" + color + ']';
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
