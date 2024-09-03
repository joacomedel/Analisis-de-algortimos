package Tp2;

import java.util.ArrayList;
import java.util.List;
import Tp2.randomGenArray;

public class ej3_3 {
    public static void main(String[] args) {

        int k = 5, o = 10, minValor = 1, maxValor = 70;
        int[] arr1 = randomGenArray.generarArregloRandomOrdenado(k, o, minValor, maxValor);
        int[] arr2 = randomGenArray.generarArregloRandomOrdenado(k, o, minValor, maxValor);
        int[] cantComprob = { 0 };
        List<Integer> lista = elementosRepetidos(arr1, arr2, cantComprob);
        if (true) { // Muestra x pantalla
            System.out.print("Primer arreglo : [");
            for (int y : arr1) {
                System.out.print(y);
                System.out.print(",");
            }
            System.out.println("]");
            System.out.print("Segundo arreglo [");
            for (int y : arr2) {
                System.out.print(y);
                System.out.print(",");
            }
            System.out.println("]");
            System.out.println("Elementos repetidos : " + lista);
            System.out.println("Cantidad de comprobaciones = " + cantComprob[0]);
            System.out.println("N = " + arr1.length);
            System.out.println("M = " + arr2.length);
        }
    }

    public static List elementosRepetidos(int[] arr1, int[] arr2, int[] cantComprob) {
        int n = arr1.length, m = arr2.length, i = 0, j = 0;
        List<Integer> lista = new ArrayList<Integer>();
        do {
            if (arr1[i] == arr2[j]) {
                lista.add(arr1[i]);
                cantComprob[0]++;
                i++;
                j++;
            } else {
                if (arr1[i] < arr2[j]) {
                    i++; // Si no son iguales muevo el puntero del menor
                    cantComprob[0]++;
                } else {
                    j++;
                    cantComprob[0]++;
                }
            }

        } while (!((i >= n) || (j >= m)));
        return lista;
    }
}
