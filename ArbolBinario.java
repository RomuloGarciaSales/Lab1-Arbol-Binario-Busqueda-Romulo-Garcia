/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1_romulogarcia_1056525;

/**
 *
 * @author Ana Sales
 */
public class ArbolBinario {

    private Nodo raiz;
    public ArbolBinario() {
        raiz = null;
    }

    // INSERTAR
    public boolean insertar(int Dato) {
        if (buscar(Dato)) {
            return false;
        }
        raiz = insertarRecursivo(raiz, Dato);
        return true;
    }

    private Nodo insertarRecursivo(Nodo actual, int Dato) {
        if (actual == null) {
            return new Nodo(Dato);
        }
        if (Dato < actual.Dato) {
            actual.izquierda = insertarRecursivo(actual.izquierda, Dato);
        } else {
            actual.derecha = insertarRecursivo(actual.derecha, Dato);
        }
        return actual;
    }

    // BUSCAR
    public boolean buscar(int Dato) {
        return buscarRecursivo(raiz, Dato);
    }

    private boolean buscarRecursivo(Nodo actual, int Dato) {
        if (actual == null) {
            return false;
        }
        if (actual.Dato == Dato) {
            return true;
        }
        if (Dato < actual.Dato) {
            return buscarRecursivo(actual.izquierda, Dato);
        }
        return buscarRecursivo(actual.derecha, Dato);
    }

    // PREORDEN
    public void preOrden() {
        System.out.print("PreOrden: ");
        preOrdenRecursivo(raiz);
        System.out.println();
    }

    private void preOrdenRecursivo(Nodo actual) {
        if (actual != null) {
            System.out.print(actual.Dato + " ");
            preOrdenRecursivo(actual.izquierda);
            preOrdenRecursivo(actual.derecha);
        }
    }

    // INORDEN
    public void inOrden() {

        System.out.print("InOrden: ");
        inOrdenRecursivo(raiz);
        System.out.println();
    }

    private void inOrdenRecursivo(Nodo actual) {
        if (actual != null) {
            inOrdenRecursivo(actual.izquierda);
            System.out.print(actual.Dato + " ");
            inOrdenRecursivo(actual.derecha);
        }
    }

    // POSTORDEN
    public void postOrden() {
        System.out.print("PostOrden: ");
        postOrdenRecursivo(raiz);
        System.out.println();
    }

    private void postOrdenRecursivo(Nodo actual) {
        if (actual != null) {
            postOrdenRecursivo(actual.izquierda);
            postOrdenRecursivo(actual.derecha);
            System.out.print(actual.Dato + " ");
        }
    }
}