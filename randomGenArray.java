package Tp2;

import java.util.Arrays;
import java.util.Random;

public class randomGenArray {
    public static int[] generarArregloRandomOrdenado(int n, int m, int minValor, int maxValor) {
        Random random = new Random();
        int tamano = n + random.nextInt(m - n + 1); // Genera tamaño aleatorio entre n y m

        int[] arreglo = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            // Genera un número aleatorio dentro del rango dado
            arreglo[i] = minValor + random.nextInt(maxValor - minValor + 1);
        }
        Arrays.sort(arreglo);
        return arreglo;
    }
}
