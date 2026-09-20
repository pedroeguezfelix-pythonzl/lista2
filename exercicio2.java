package org.example;

import java.util.Scanner;

public class exercicio2 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Me diga um numero: ");
        int numero = sc.nextInt();

        if (Math.abs(numero) >= 10 && Math.abs(numero) <=99) {
            System.out.println("Dois numeros");
        }
        if (numero % 2 == 0) {
            System.out.println("numero par");
        }
        if (numero > 0){
            System.out.println("é positivo");
        }
        if (numero % 5 == 0) {
            System.out.println("Multiplo de 5 ");
        }



    }

}
