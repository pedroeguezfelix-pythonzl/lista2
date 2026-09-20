package org.example;

import java.util.Scanner;

public class exercicio4 {
    static void main() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Numero 1:");
        int n1 = sc.nextInt();

        System.out.println("Numero 2:");
        int n2 = sc.nextInt();

        if (n2 == 0) {
            System.out.println("divisão impossivel");

        }
        else{

            if (n1 % n2 == 0) {
                System.out.println(n1 + " é divisivel por " + n2);
            }
            else {
                System.out.println(n1 + " não divisivel por " + n2);

            }


        }

    }
}

