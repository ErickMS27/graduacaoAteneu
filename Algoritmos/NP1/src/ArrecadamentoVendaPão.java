package Algoritmos.NP1.src;

import java.util.Scanner;

// Questão 3 - Lista de Algoritmos

public class ArrecadamentoVendaPão {
    static double precoPao = 0.12;
    static double precoBroa = 1.50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Bem-vindo a Padaria Hotpão!");
        System.out.println("\nDigite o número da quantidade de pãos: ");
        int qtdPao = scanner.nextInt();

        System.out.println("\nDigite o número da quantidade de broas: ");
        int qtdBroa = scanner.nextInt();

        double totalVendas = calcularTotalVendas(qtdPao, qtdBroa);
        double valorPoupanca = calcularValorPoupanca(totalVendas);

        System.out.println("\nTotal arrecadado com as vendas: R$ "+totalVendas);
        System.out.println("\nValor a ser guardado na poupança: R$: "+valorPoupanca);

    }

    public static double calcularTotalVendas(int qtdPao, int qtdBroa){

        return (qtdPao * precoPao) + (qtdBroa * precoBroa);

    }

    public static double calcularValorPoupanca(double totalVendas){

        return totalVendas * 0.10;

    }

}
