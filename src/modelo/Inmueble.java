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
public class Inmueble {

    protected String propietario;
    protected String zona;
    private double areaConstruida;
    private int estrato;
    private int cantHabitaciones;
    private boolean cocinaIntegral;
    private int cantBanios;
    private boolean tieneGaraje;
    private String direccion;

    public Inmueble(String propietario, String zona, double areaConstruida, int estrato, int cantHabitaciones, boolean cocinaIntegral, int cantBanios, boolean tieneGaraje, String direccion) {
        this.propietario = propietario;
        this.zona = zona;
        this.areaConstruida = areaConstruida;
        this.estrato = estrato;
        this.cantHabitaciones = cantHabitaciones;
        this.cocinaIntegral = cocinaIntegral;
        this.cantBanios = cantBanios;
        this.tieneGaraje = tieneGaraje;
        this.direccion = direccion;
    }

    public Inmueble(String propietario, String zona) {
        this.propietario = propietario;
        this.zona = zona;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getZona() {
        return zona;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public int getEstrato() {
        return estrato;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public boolean isCocinaIntegral() {
        return cocinaIntegral;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public boolean isTieneGaraje() {
        return tieneGaraje;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public void setCocinaIntegral(boolean cocinaIntegral) {
        this.cocinaIntegral = cocinaIntegral;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public void setTieneGaraje(boolean tieneGaraje) {
        this.tieneGaraje = tieneGaraje;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        String cocina;
        if (cocinaIntegral== true) {
            cocina="Si";
        }
        else  {
        cocina="No";
        }
                String garaje;
        if (tieneGaraje== true) {
            garaje="Si";
        }
        else  {
        garaje="No";
        }
        return "Inmueble{" + "propietario=" + propietario + ", zona=" + zona +
                ", areaConstruida=" + areaConstruida + ", estrato=" + estrato + 
                ", cantHabitaciones=" + cantHabitaciones + ", cocinaIntegral=" 
                + cocina + ", cantBanios=" + cantBanios +
                ", tieneGaraje=" + garaje    + ", direccion=" 
                + direccion + '}';
    }

    
    
}
