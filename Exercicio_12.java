package Ativ20_ForEach;

import java.util.Scanner;

public class Exercicio_12 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] nomes = new String[20];
    int count = 0, opcao;

    do {
        System.out.println("1-Cadastrar  2-Listar  3-Filtrar  0-Sair");
        System.out.print("Opção: ");
        opcao = sc.nextInt();
        sc.nextLine();

        if (opcao == 1) {
            if (count < nomes.length) {
                System.out.print("Nome: ");
                nomes[count++] = sc.nextLine();
            } else System.out.println("Limite atingido!");

        } else if (opcao == 2) {
            System.out.println("Nomes");
            for (String n : nomes) if (n != null) System.out.println(n);

        } else if (opcao == 3) {
            System.out.print("Letra inicial: ");
            String letra = sc.nextLine().toLowerCase();
            for (String n : nomes)
                if (n != null && n.toLowerCase().startsWith(letra))
                    System.out.println(n);
        }

    } while (opcao != 0);

    System.out.println("Encerrado");
    sc.close();
}
}
