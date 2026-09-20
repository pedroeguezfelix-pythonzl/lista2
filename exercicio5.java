package org.example;

import java.util.Scanner;

public class exercicio5 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(" é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto");
        }
    }
}

