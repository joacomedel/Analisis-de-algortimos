/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int k = 5, o = 10, minValor = 1, maxValor = 70;
        int[] arr1 = generarArregloRandomOrdenado(k, o, minValor, maxValor);
        int[] arr2 = generarArregloRandomOrdenado(k, o, minValor, maxValor);
        int[] cantComprob = { 0 };
        List<Integer> lista = mezclarVectoresDescendientes(arr1, arr2, cantComprob);
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

    public static List mezclarVectoresDescendientes(int[] arr1, int[] arr2, int[] cantComprob) {
        int n = arr1.length, m = arr2.length, i = 0, j = 0;
        boolean terminoArr1 = false;
        boolean terminoArr2 = false;
        List<Integer> lista = new ArrayList<Integer>();
        do {
            if (!terminoArr1 && !terminoArr2){
                if (arr1[i] == arr2[j]) {
                lista.add(arr1[i]);
                lista.add(arr2[j]);
                cantComprob[0]++;
                i++;
                j++;
                } else {
                if (arr1[i] < arr2[j]) {
                    lista.add(arr1[i]);
                    i++; // Si no son iguales muevo el puntero del menor
                    cantComprob[0]++;
                } else {
                    lista.add(arr2[j]);
                    j++;
                    cantComprob[0]++;
                }
                }
            }else{
                if (!terminoArr1){
                    lista.add(arr1[i]);
                    i++;
                    cantComprob[0]++;
                }else{
                    lista.add(arr2[j]);
                    i++;
                }
            }
            terminoArr1 = (i >= n);
            terminoArr2 = (j >= m);
        } while (!(terminoArr1 && terminoArr2));
        return lista;
    }
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