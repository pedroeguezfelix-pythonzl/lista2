package org.example;

import java.util.Scanner;

public class exercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua idade? ");
        int idade = sc.nextInt();

        if (idade >= 16) {
            System.out.println("voçe Pode Votar e");}

        if (idade >=18) {
            System.out.println("voçe Pode Dirigir e tambem ");}

        if (idade >=60){
            System.out.println("Voçe é idoso");}

        if (idade >=65){
        System.out.println("Todas as categorias");}



        }

    }

