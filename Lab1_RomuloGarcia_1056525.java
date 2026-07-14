/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1_romulogarcia_1056525;

/**
 *
 * @author Ana Sales
 */

import java.util.Scanner;

public class Lab1_RomuloGarcia_1056525 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();

        int opcion;

        do {

            System.out.println("\n==================================");
            System.out.println("    GESTION DE ID'S - ARBOL BST");
            System.out.println("==================================");
            System.out.println("1. Insertar Dato");
            System.out.println("2. Buscar Dato");
            System.out.println("3. Mostrar Recorridos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese el Dato: ");
                    int Dato = teclado.nextInt();

                    if (arbol.insertar(Dato)) {
                        System.out.println("Dato agregado correctamente.");
                    } else {
                        System.out.println("Ese Dato ya existe en el arbol.");
                    }

                    break;

                case 2:

                    System.out.print("Ingrese el Dato a buscar: ");
                    Dato = teclado.nextInt();

                    if (arbol.buscar(Dato)) {
                        System.out.println("Dato encontrado.");
                    } else {
                        System.out.println("Dato NO encontrado.");
                    }

                    break;

                case 3:

                    System.out.println("\nRecorridos del arbol:");

                    arbol.preOrden();
                    arbol.inOrden();
                    arbol.postOrden();

                    break;

                case 4:

                    System.out.println("Gracias por utilizar el programa.");
                    break;

                default:

                    System.out.println("Opcion invalida. Intente nuevamente.");

            }

        } while (opcion != 4);

        teclado.close();
    }

}