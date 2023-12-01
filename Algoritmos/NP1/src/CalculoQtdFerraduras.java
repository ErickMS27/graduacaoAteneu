package NP1;

import java.util.Scanner;

// Questão 2 - Lista de Algoritmos

public class CalculoQtdFerraduras {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Haras! - Um software de Calculadora de Ferraduras");
        System.out.println("\nDigite o número de cavalos no haras: ");

        int numCavalos = scanner.nextInt();

        int totalFerraduras = calcularFerraduras(numCavalos);

        System.out.println("\nTotal de ferraduras " + totalFerraduras + " que serão necessárias.");

    }

    public static int calcularFerraduras (int numCavalos){

        return numCavalos * 4;

    }

}
