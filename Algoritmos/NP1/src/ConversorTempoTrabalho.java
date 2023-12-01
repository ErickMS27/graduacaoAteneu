package NP1;

import java.util.Scanner;

// Questão 11 - Lista de Algoritmos

public class ConversorTempoTrabalho {
    static int diasTrabalhados;
    static int anos;
   static int meses;
    static int dias;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de dias de trabalho sem acidentes: ");
        diasTrabalhados = scanner.nextInt();

        System.out.println("\nTempo de trabalho sem acidentes:");
        System.out.println("\nAnos: " + calcularAnos());
        System.out.println("\nMeses: " + calcularMeses());
        System.out.println("\nDias: " + calcularDias());

    }

    public static int calcularAnos (){
        anos = diasTrabalhados/360;
    return anos;
    }

    public static int calcularMeses(){
       meses = (diasTrabalhados % 360)/30;
    return meses;
    }

    public static int calcularDias(){
        dias = (diasTrabalhados%360)%30;
    return dias;
    }

}
