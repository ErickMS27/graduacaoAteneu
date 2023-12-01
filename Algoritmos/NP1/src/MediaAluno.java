package Algoritmos.NP1.src;

import java.util.Scanner;

// Questão 8 - Lista de Algoritmos

public class MediaAluno {

    static double n1;
    static double n2;
    static double n3;
    static int p1 = 1;
    static int p2 = 2;
    static int p3 = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno:");
        n1 = scanner.nextDouble();

        System.out.println("\nDigite a segunda nota do aluno:");
        n2 = scanner.nextDouble();

        System.out.println("\nDigite a terceira nota do aluno:");
        n3 = scanner.nextDouble();

        System.out.println("\nSua média é de: "+calcularMedia());

    }

    public static double calcularMedia () {

       double media = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);

    return media;

    }

}
