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
public class Casa {
    double tamano;
    double costo;
    int coordenadaX;
    int coordenadaY;
    ArrayList <Puffle> puffles = new ArrayList();

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public ArrayList<Puffle> getPuffles() {
        return puffles;
    }

    public void setPuffles(ArrayList<Puffle> puffles) {
        this.puffles = puffles;
    }
    
    
}
