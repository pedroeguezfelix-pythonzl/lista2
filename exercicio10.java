package org.example;

import java.util.Scanner;

public class exercicio10 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Login: ");
        String usuario = sc.nextLine();

        System.out.println("senha: ");
        String senha = sc.nextLine();

        if (usuario.equals("admin")){
            System.out.println("Usuário nã encontrado");
        } else {
            if (senha.equals("java123")){
                System.out.println("Acesso liberado");
            } else{
                System.out.println("A senha está incorreta");
            }
        }
    }
}