    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ESTUDIANTE2502
 */
public class Lote extends  Inmueble{
    
    private double area;

    public Lote(double area, String propietario, String zona) {
        super(propietario, zona);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Lote{"+ "propietario=" + propietario + ", zona=" + zona + ", area=" + area + '}';
    }
            
    
}
