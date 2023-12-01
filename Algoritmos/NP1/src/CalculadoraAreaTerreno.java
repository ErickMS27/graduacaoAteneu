package Algoritmos.NP1.src;

import java.util.Scanner;

// Questão 1 - Lista de Algoritmos

public class CalculadoraAreaTerreno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Imóbilis! - Um software de Calculadora de Área de Terreno");
        System.out.println("\nDigite a largura do terreno em m:");
        double largura = scanner.nextDouble();

        System.out.println("\nDigite a comprimento do terreno em m:");
        double comprimento = scanner.nextDouble();

        double area = calcularAreaTerreno(largura, comprimento);

        System.out.println("\nValor da área: "+area);

    }

    public static double calcularAreaTerreno(double largura, double comprimento){

        return largura * comprimento;

    }

}