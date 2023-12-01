package NP1;

import java.util.Scanner;

// Questão 5 - Lista de Algoritmos

public class LitrosGasolina {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o preço do litro da gasolina em R$: ");
        double precoLitro = scanner.nextDouble();

        System.out.println("\nInforme o valor á ser pago em R$: ");
        double valorPago = scanner.nextDouble();

        double litrosAbastecidos = calcularLitrosAbastecidos(valorPago,precoLitro);

        System.out.println("\nVocê conseguiu abastecer "+litrosAbastecidos+" litros de gasolina.");

    }

    public static double calcularLitrosAbastecidos(double valorPago, double precoLitro){

        return valorPago/precoLitro;

    }

}
