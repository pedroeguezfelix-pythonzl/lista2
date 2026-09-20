package org.example;

import java.util.Scanner;

public class exercicio8 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Velocidade maxima");
        double velocidadeMaxima = sc.nextInt();

        System.out.println("Valocidade do veiculo");
        double velocidadeVeiculo = sc.nextInt();


        if (velocidadeVeiculo < velocidadeMaxima) {
            System.out.println("Dentro do Limite");
        }
        else
        {
            double velocidadeM = velocidadeMaxima * 1.20;
            double velocidadeG = velocidadeMaxima * 1.50;

            if (velocidadeVeiculo <= velocidadeM) {
                System.out.println("Infração media");

            }
            else if (velocidadeVeiculo <= velocidadeG)
            {
                System.out.println("Infração grave");
            }
            else
            {
                System.out.println("infração gravissima");
            }
        }

    }
}

