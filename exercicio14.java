package org.example;

import java.util.Scanner;

public class exercicio14 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nº do mês: ");
        int mes = sc.nextInt();

        switch (mes){
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(" Mês tem 31 dias.");
            case 4, 6, 9, 11 -> System.out.println(" Mês tem 30 dias.");
            case 2 -> System.out.println(" Mês tem 28 dias.");
            default -> System.out.println(" Erro: Mês invalido! Digite um mês entre 1 a 12.");
        }
    }
}