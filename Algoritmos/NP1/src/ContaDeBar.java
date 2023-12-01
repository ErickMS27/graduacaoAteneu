package NP1;

import java.util.Scanner;

// Questão 15 - Lista de Algoritmos

public class ContaDeBar {

    static double contaPessoa;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor total da conta R$: ");
        double valorConta = scanner.nextDouble();

        double contaPessoa = calcularContaPessoa(valorConta);

        System.out.println("\nCarlos pagará R$: " + ((int) valorConta)/3 + ".0");
        System.out.println("André pagará R$: " + ((int) valorConta)/3 + ".0");
        System.out.println("Felipe pagará R$: " + (valorConta - 2 * (int) contaPessoa));

    }

    public static double calcularContaPessoa (double conta){

        contaPessoa = conta/3;

    return contaPessoa;
    }

}
