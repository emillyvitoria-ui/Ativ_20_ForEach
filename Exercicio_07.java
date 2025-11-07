package Ativ20_ForEach;

import java.util.Scanner;

public class Exercicio_07 {
    static class Produto {
        String nome;
        double preco;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[3];
        for (int i = 0; i < 3; i++) {
            produtos[i] = new Produto();

            System.out.print("Nome do produto " + (i + 1) + ": ");
            produtos[i].nome = sc.nextLine();

            System.out.print("Preço de " + produtos[i].nome + ": R$ ");
            produtos[i].preco = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Lista de Produtos");
        for (Produto p : produtos) {
            System.out.println(p.nome + " - R$ " + p.preco);
        }
        System.out.println(" Produtos acima de R$50");
        for (Produto p : produtos) {
            if (p.preco > 50) {
                System.out.println(p.nome + " - R$ " + p.preco + " (caro)");
            }
        }
    }
}