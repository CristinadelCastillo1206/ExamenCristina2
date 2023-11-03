package com.corenetworks.modelo;

import java.util.Arrays;

public class Paquete {

//1. Atributos

    private String Origen;
    private String Destino;

    private String Mensaje;

    private int ContadorPaquetes;

    @Override
    public String toString() {
        return "Paquete{" +
                "Origen='" + Origen + '\'' +
                ", Destino='" + Destino + '\'' +
                ", Mensaje='" + Mensaje + '\'' +
                ", ContadorPaquetes=" + ContadorPaquetes +
                '}';
    }



    //2 Constructores


    public Paquete(String origen, String destino, String mensaje, int contadorPaquetes) {
        Origen = origen;
        Destino = destino;
        Mensaje = mensaje;
        ContadorPaquetes = contadorPaquetes;
    }

    public Paquete() {


    }

    //3. Getters and Setters


    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String origen) {
        Origen = origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

    public int getContadorPaquetes() {
        return ContadorPaquetes;
    }

    public void setContadorPaquetes(int contadorPaquetes) {
        ContadorPaquetes = contadorPaquetes;
    }
}
