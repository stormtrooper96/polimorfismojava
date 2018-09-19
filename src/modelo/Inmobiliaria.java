/*
             * To change this license header, choose License Headers in Project Properties.
             * To change this template file, choose Tools | Templates
             * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE2502
 */
public class Inmobiliaria {

    private ArrayList<Inmueble> listadoInmuebles;

    public Inmobiliaria() {
        new ArrayList<Inmueble>();
    }

    public ArrayList<Inmueble> getListadoInmuebles() {
        return listadoInmuebles;
    }

    /**
     *
     * @param imb
     * @return
     */
    public String registrarInmueble(Inmueble imb) {
        listadoInmuebles.add(imb);
        return "El inmueble ha quedado registrado";

    }

    /**
     *
     * @param est
     * @return
     */
    public String verInmueblesEstrato(int est) {
        String msj = "Los inmuebles del Estrato " + est + " son: ";
        for (Inmueble in : listadoInmuebles) {
            if (in.getEstrato() == est) {
                msj += "\n" + in.toString();
            }
        }
        return msj;
    }

    /**
     *
     * @param canthab
     * @return
     */
    public String verInmueblesCantHabitaciones(int canthab) {
        String msj = "Los inmuebles con  " + canthab + " habitaciones son: ";
        for (Inmueble in : listadoInmuebles) {
            if (in.getCantHabitaciones() == canthab) {
                msj += "\n" + in.toString();
            }
        }
        return msj;
    }

    /**
     *
     * @param cantba
     * @return
     */
    public String verInmueblesCantBanios(int cantba) {
        String msj = "Los inmuebles con  " + cantba + " baños son: ";
        for (Inmueble in : listadoInmuebles) {
            if (in.getCantBanios() == cantba) {
                msj += "\n" + in.toString();
            }
        }
        return msj;
    }

}

