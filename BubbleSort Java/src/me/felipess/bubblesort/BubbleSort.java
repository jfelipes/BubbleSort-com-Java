package me.felipess.bubblesort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class BubbleSort {

    private static int gerarNumeroAleatorio() {
        return (int) (Math.random() * 100);
    }

    private static List<Integer> ordenarElementosComBubbleSort(List<Integer> numeros) {
        int quantidadeElementos = numeros.size();
        for (int i = 0; i < quantidadeElementos; i++) {
            for (int j = 0; j < (quantidadeElementos - i - 1); j++) {
                int elementoAtual = numeros.get(j);
                int proximoElemento = numeros.get(j + 1);
                if (elementoAtual > proximoElemento) {
                    numeros.set(j, proximoElemento);
                    numeros.set(j + 1, elementoAtual);
                }
            }
        }
        return numeros;
    }

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        // Gerando números aleatoriamente.
        System.out.println("Gerando números aleatórios...");
        while (numeros.size() < 100) {
            int numeroAleatorio = gerarNumeroAleatorio();
            if (!numeros.contains(numeroAleatorio)) {
                numeros.add(numeroAleatorio);
            }
        }
        System.out.println("Números antes de ordenar:");
        System.out.println(numeros);
        // Ordenando com bubblesort.
        System.out.println("Ordenando...");
        List<Integer> numerosOrdenados = ordenarElementosComBubbleSort(numeros);
        System.out.println("Números após ordenar:");
        System.out.println(numeros);
    }
}
