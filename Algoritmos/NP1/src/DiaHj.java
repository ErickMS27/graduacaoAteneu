package Algoritmos.NP1.src;

import java.util.Scanner;

// Questão 7 - Lista de Algoritmos

public class DiaHj {

    static int dia;
    static int mes;
    static int diasPassados;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o dia: ");
        dia = scanner.nextInt();

        System.out.println("\nInforme o mês: ");
        mes = scanner.nextInt();

        if (mes >= 1 || mes <= 12 || dia >= 1 || dia <= 30){
            System.out.println("\nPassaram se: " +calcularDiasPassados()+" dias");
        } else {
            System.out.println("\nMês ou dia inseridos são inválidos");
        }

    }
    public static int calcularDiasPassados () {
        return diasPassados = ((mes-1)*30+dia);
    }

}
