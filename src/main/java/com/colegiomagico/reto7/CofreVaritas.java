package com.colegiomagico.reto7;

/**
 * Retorna el número mayor dentro del arreglo de tamaños.
 */
public class CofreVaritas {

    public static int varitaMasPoderosa(int[] tamanos) {
        int max = tamanos[0];
        for (int i = 1; i < tamanos.length; i++) {
            if (tamanos[i] > max) {
                max = tamanos[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] varitas = {10, 15, 8};
        System.out.println("Poderosa: " + varitaMasPoderosa(varitas));
    }
}
