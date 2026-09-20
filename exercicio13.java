package org.example;

import java.util.Scanner;

public class exercicio13 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o n1: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o n2: ");
        double n2 = sc.nextDouble();

        System.out.println("===== OPERAÇÕES =====");
        System.out.println("1 soma");
        System.out.println("2 subtração");
        System.out.println("3 multiplicação");
        System.out.println("4 divisão");
        System.out.println("Escolha uma das opções: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> System.out.println("Soma: " + (n1 + n2));
            case 2 -> System.out.println("Subtração: " + (n1 - n2));
            case 3 -> System.out.println("Multiplicação: " + (n1 * n2));
            case 4 -> {
                if (n2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                } else {
                    System.out.println("Resultado: " + (n1 / n2));
                }
            }
            default -> System.out.println("Erro: Opção inválida");
        }
    }
}