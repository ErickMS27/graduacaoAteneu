package NP1;

import java.util.Scanner;

// Questão 14 - Lista de Algoritmos
public class CalculoAreaPizza {
    static double pi = 3.14;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quanto de raio a pizza tem: ");
        double raio = scanner.nextDouble();

        double area = calcularAreaPizza(raio);

        System.out.println("\nA área da pizza é: " + area + " m².");
    }

    public static double calcularAreaPizza(double raio) {
        double area = pi * raio * raio;
        return area;
    }
}
