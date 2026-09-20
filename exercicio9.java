package org.example;

import java.util.Scanner;

public class exercicio9 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Salario");
        double salario = sc.nextDouble();

        System.out.println("anos de casa");
        int anosdCasa = sc.nextInt();

        double bonus;
        bonus = 0;

        if (anosdCasa <= 1)
        {
            System.out.println("Não tem bonus");
        }
        else
        {
            if (anosdCasa <= 3)
            {
                bonus = 1.5;
            }
            else if (anosdCasa <= 10)
            {
                bonus = 1.10;
            }
            else
            {
                bonus = 1.15;
            }
        }
        double valorComBonus = salario * bonus;
        double valorTotal = salario + valorComBonus;

        System.out.println("Voce ganhou um bonus de: " + bonus);
        System.out.println("Seu salario final fica: " + valorTotal);
    }
}