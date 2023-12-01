package NP1;

import java.util.Scanner;

//Questão 12 - Lista de Algoritmos

public class SalarioFuncionario {

    static double salarioInicial;
    static double aumento;
    static double desconto;
    static double salarioAumento;
    static double salarioDesconto;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário inicial do funcionário - R$: ");
        salarioInicial = scanner.nextDouble();

        System.out.println("\nSalário inicial - R$: " + salarioInicial);
        System.out.println("\nSalário com aumento - R$: " + aumentarSalario());
        System.out.println("\nSalário com desconto - R$: " + descontarImpostos());

    }

    public static double aumentarSalario(){
     aumento = 0.15 * salarioInicial;
     salarioAumento = salarioInicial + aumento;
    return salarioAumento;
    }

    public static double descontarImpostos(){
     desconto = 0.08 * salarioAumento;
    salarioDesconto = salarioAumento - desconto;
    return salarioDesconto;
    }
}
