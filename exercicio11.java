package org.example;

import java.util.Scanner;

public class exercicio11 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a frequencia do aluno: ");
        double frequencia = sc.nextDouble();

        System.out.println("Digite a média: ");
        double media = sc.nextDouble();

        if (frequencia < 75) {
            System.out.println("Reprovado por falta");
        } else {
            if (media >= 7) {
                System.out.println("Aprovado");
            } else if (media >= 5) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}