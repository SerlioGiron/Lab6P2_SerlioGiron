/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_serliogiron;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Penguin {
    String nombre;
    String contr;
    boolean socio;
    double dinero;
    ArrayList <Item> items = new ArrayList();
    Casa casa;

    @Override
    public String toString() {
        return "Penguin[ " + "nombre=" + nombre + ']';
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContr() {
        return contr;
    }

    public void setContr(String contr) {
        this.contr = contr;
    }

    public boolean isSocio() {
        return socio;
    }

    public void setSocio(boolean socio) {
        this.socio = socio;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
    
    
}
