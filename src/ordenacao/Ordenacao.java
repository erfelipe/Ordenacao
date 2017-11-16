package ordenacao;

import java.util.Random;

public class Ordenacao {

    public static void main(String[] args) {

        System.out.println("/*************************************************");
        System.out.println("/* estudo com vetor de números");
        System.out.println("*************************************************/");
        
        Integer[] vet_int = new Integer[10];
        Random r = new Random();
        
        //preenche o vetor de forma randômica e imprime
        for (int i = 0; i < vet_int.length; i++) {
            vet_int[i] = r.nextInt(9000);
        }
        System.out.println("Impressão de vetor desordenado:");
        imprimeVetor(vet_int);
        //ordena o vetor pelo método bolha
        vet_int = ordenaVet(vet_int);
        
        System.out.println();
        System.out.println("Impressão do vetor ordenado:");
        imprimeVetor(vet_int);
        
        System.out.println("");
        System.out.println("/*************************************************");
        System.out.println("/* estudo com vetor de palavras (Strings)");
        System.out.println("*************************************************/");
        
        String[] vet_texto = new String[5];
        
        //preenche vetor internamente 
        vet_texto[0] = "William Hurt";
        vet_texto[1] = "Catharina";
        vet_texto[2] = "Zothero";
        vet_texto[3] = "Adrian Romero";
        vet_texto[4] = "Beltran Goldsthain";
        
        System.out.println("Imprime vetor sem ordenação:");
        imprimeVetor(vet_texto);
        //ordena o vetor pelo método bolha
        vet_texto = ordenaVet(vet_texto);
        
        System.out.println();
        System.out.println("Impressão do vetor ordenado:");
        imprimeVetor(vet_texto);
    }
    /**
     * Impressão de vetor (para facilitar conferências
     * @param vet de qualquer tipo
     */
    public static void imprimeVetor(Object[] vet){
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " | ");
        }
    }
    /**
     * Método de ordenação bolha
     * @param vet de int
     * @return um vetor de inteiros
     */
    public static Integer[] ordenaVet(Integer[] vet){
        System.out.println("");
        System.out.println("**Início da ordenação de vetor**");
        Integer aux;
        for (int i = 0; i < vet.length - 1 ; i++) {
            System.out.println("--Iteração: " + i);
            for (int j = 0; j < vet.length - 1 -i; j++) {
                if (vet[j] > vet[j + 1]){
                    System.out.println("Troca: " + vet[j] + " com " + vet[j + 1]);
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        System.out.println("**Fim da ordenação**");
        return vet;
    }
    /**
     * Método de ordenação bolha 
     * @param vet de texto 
     * @return um vetor de texto 
     */
    public static String[] ordenaVet(String[] vet){
        System.out.println("");
        System.out.println("**Início da ordenação de vetor**");
        String aux;
        for (int i = 0; i < vet.length - 1 ; i++) {
            System.out.println("--Iteração: " + i);
            for (int j = 0; j < vet.length - 1 -i; j++) {
                if (vet[j].compareTo(vet[j + 1]) > 0){
                    System.out.println("Troca: " + vet[j] + " com " + vet[j + 1]);
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        System.out.println("**Fim da ordenação**");
        return vet;
    }
}

