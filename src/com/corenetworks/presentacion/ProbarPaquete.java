package com.corenetworks.presentacion;

import com.corenetworks.modelo.Paquete;

import java.util.Scanner;

public class ProbarPaquete {
    public static void main(String[] args) {

        //Arrays de paquetes

        String[] NumeroLetras = new String[20];

        for (int i = 0; i < NumeroLetras.length; i++) {
            NumeroLetras[i] = "mañana sabado va a llover";

            Paquete[] paquetes2 = new Paquete[5];

            for (int i1 = 0; i < paquetes2.length; i++) {
                paquetes2[i] = new Paquete("Madrid", "Barcelona", "mañana sabado va a llover", 5);

                for (Paquete elemento : paquetes2) {

                    System.out.println(elemento);

                    //Pedir  datos por consola

                    Scanner teclado = new Scanner(System.in);
                    Paquete p1 = new Paquete();
                    System.out.println();








                }


            }


        }
    }

    }