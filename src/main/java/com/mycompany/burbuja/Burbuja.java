/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.burbuja;

/**
 *
 * @author mauri
 */

public class Burbuja {
    
    // Función para imprimir un arreglo
    static void imprimirArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Función para ordenar un arreglo usando el algoritmo de Burbuja
    static void ordenamientoBurbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // Si el elemento actual es mayor que el siguiente, intercambiarlos
                if (arr[j] > arr[j+1]) {
                    // Intercambio de elementos
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    // Imprimir el paso a paso de la aplicación del algoritmo
                    imprimirArreglo(arr);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {21,40,4,9,10,35};

        System.out.println("Arreglo inicial:");
        imprimirArreglo(arreglo);

        System.out.println("Aplicando el algoritmo de ordenamiento de Burbuja paso a paso:");
        System.out.println();
        
        ordenamientoBurbuja(arreglo);
        System.out.println();

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arreglo);
        
     
        
    }
}