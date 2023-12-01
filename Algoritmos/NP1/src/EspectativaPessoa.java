package Algoritmos.NP1.src;

import java.util.Scanner;

// Questão 4 - Lista de Algoritmos

public class EspectativaPessoa {

    static String nome;
    static int idd;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();

        System.out.println("\nDigite sua idade:");
        idd = scanner.nextInt();

        int diasDeVida = calcularDiasDeVida();

        System.out.println("\n"+nome+ ", você já viveu " +diasDeVida+ " dias.");

    }

    public static int calcularDiasDeVida(){

        return idd * 365;

    }

}
