/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA1_5_ENTRADA_SALIDA {

    public static void main(String[] args) {
       //1. DECLARACION DE VARIABLES
       String nombre;
       String apellidos;
       int semestre;
       Scanner captura = new Scanner (System.in);
       //; Fin de estruccion
       //2. CAPTURA DE VARIABLES
       System.out.println("Introduce tu nombre:");
       nombre = captura.nextLine();
       System.out.println("Introduce tus apellidos:");
       apellidos = captura.nextLine();
       System.out.println("Introduce tu semestre:");
        semestre = captura.nextInt();
       //Java es sensible a mayúsculas y minúsculas
       //es decir: es diferente System que system
       //3. MOSTRAR LOS DATOS CAPTURADOS
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(semestre);
    }
}
