package org.example;

import java.util.Scanner;

public class exercicio6 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de compra:");
        double vlrCompra = sc.nextDouble();

        double frete;

        if (vlrCompra >= 199.00) {
            frete = 0.0;
        } else {
            frete = 24.90;
        }

        double totalPag = vlrCompra + frete;

        System.out.println("Valor do frete: " + frete + " total a pagar: " + totalPag);

    }
}

