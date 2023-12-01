package NP1;

import java.util.Scanner;

public class PlanoCartesiano {

// Questão 10 - Lista de Algoritmos

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a coordenada X do ponto 1:");
        int coordX1 = scanner.nextInt();

        System.out.println("\nInforme a coordenada Y ponto 1:");
        int coordY1 = scanner.nextInt();

        System.out.println("\nInforme a coordenada X do ponto 2:");
        int coordX2 = scanner.nextInt();

        System.out.println("\nInforme a coordenada Y ponto 2:");
        int coordY2 = scanner.nextInt();

        double distanciaPontos = calcularDistancia(coordX1, coordX2, coordY1, coordY2);

        System.out.println("\nA distância entre os dois pontos é: " + distanciaPontos);
    }

    public static double calcularDistancia (int coordX1, int coordX2, int coordY1, int coordY2){

        double coordX = coordX2 - coordX1;
        double coordY = coordY2 - coordY1;
        double distancia = Math.sqrt(Math.pow(coordX2, 2) + Math.pow(coordY2, 2));

    return distancia;
    }

}