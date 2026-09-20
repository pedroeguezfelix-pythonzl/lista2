package org.example;

import java.util.Scanner;

public class exercicio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a temperatura de C?:");
        double temperatura = sc.nextDouble();

        System.out.println("Digite a umidade em %: ");
        double umidade = sc.nextDouble();

        if (temperatura >= 38){
            System.out.println("Alertas de calor extremo!");
        }
        if (umidade < 30){
            System.out.println("Alertas umidade baixa!");
        }
        if (temperatura >= 35 && umidade <20){
            System.out.println("Alerta risco de queima!");
        }


    }
}
