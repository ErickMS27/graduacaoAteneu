package NP1;

import java.util.Scanner;

// Questão 6 - Lista de Algoritmos

public class RestauranteBemBao {
    static double pesoPrato;
    static double valorPagar;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Restaurante Bem Bão! - Um software de Restaurante a Quilo!");

        System.out.println("\nInforme o peso do prato montado em kg: ");
        pesoPrato = scanner.nextDouble();

        System.out.println("\nO valor a ser pago é de: R$ " + calcularValorPagar());

    }

    public static double calcularValorPagar(){

    return pesoPrato * 12.0;

    }

}
