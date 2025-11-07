package Ativ20_ForEach;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos jogadores? ");
    int n = sc.nextInt();
    int[] pontuacoes = new int[n];

    for (int i = 0; i < n; i++) {
        System.out.print("Pontuação do jogador " + (i + 1) + ": ");
        pontuacoes[i] = sc.nextInt();
    }
    System.out.println("Pontuações");
    for (int p : pontuacoes) {
        System.out.println(p);
    }

    int destaques = 0;
    int abaixoDe50 = 0;

    for (int p : pontuacoes) {
        if (p >= 100) {
            destaques++;
        } else if (p < 50) {
            abaixoDe50++;
        }
    }

    System.out.println("Destaques: " + destaques + " | Abaixo de 50: " + abaixoDe50);

}
    }