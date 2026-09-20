package org.example;

import java.util.Scanner;

public class exercicio12 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.println("Digite o limite diário de saque: ");
        double diario = sc.nextDouble();

        System.out.println("Digite o valor do saque solicitado: ");
        double saque = sc.nextDouble();

        if(saldo < saque) {
            System.out.println("saldo insuficiente");
        } else {
            if (saque > diario){
                System.out.println("Ultrapassou o limite de saque");
            } else {
                saldo -= saque;
                System.out.println("Saque realizado " + " Seu saldo é de: " + saldo);
            }
        }
    }
}