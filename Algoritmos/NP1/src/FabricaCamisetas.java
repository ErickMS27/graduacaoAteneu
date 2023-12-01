package Algoritmos.NP1.src;

import java.util.Scanner;

public class FabricaCamisetas {
    static double prcPequenas = 10.0;
    static double prcMedias = 12.0;
    static double prcGrandes = 15.0;

// Questão 9 - Lista de Algoritmos
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas camisetas do tamanho P? ");
        int qtdPequenas = scanner.nextInt();

        System.out.println("\nQuantas camisetas do tamanho M? ");
        int qtdMedias = scanner.nextInt();

        System.out.println("\nQuantas camisetas do tamanho G? ");
        int qtdGrandes = scanner.nextInt();

        System.out.println("\nValor total é de: "+calcularVendaCamiseta(qtdPequenas,qtdMedias,qtdGrandes));

    }

    public static double calcularVendaCamiseta(int qtdPequenas, int qtdMedias, int qtdGrandes){

        double valorTotalVenda = (qtdPequenas * prcPequenas) + (qtdMedias * prcMedias) + (qtdGrandes * prcGrandes);

        return valorTotalVenda;
    }

}
