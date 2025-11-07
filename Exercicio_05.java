package Ativ20_ForEach;

import java.util.Scanner;

public class Exercicio_05 {   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Quantos códigos deseja cadastrar?");
    int n = entrada.nextInt();
    entrada.nextLine();

    String[] codigos = new String[n];

    for (int i = 0; i < n; i++) {
        System.out.print("Digite o " + (i + 1) + "º código: ");
        codigos[i] = entrada.nextLine().trim();
    }

    String alvo;

    do {
        System.out.print("Digite o código a buscar (ou 'SAIR' para encerrar): ");
        alvo = entrada.nextLine().trim();

        if (!alvo.equalsIgnoreCase("SAIR")) {
            int contador = 0;

            for (String codigo : codigos) {
                if (codigo.equalsIgnoreCase(alvo)) {
                    contador++;
                }
            }

            if (contador > 0) {
                System.out.println("O código '" + alvo + "' aparece " + contador + " vez(es).");
            } else {
                System.out.println("O código '" + alvo + "' não foi encontrado.");
            }
        }

    } while (!alvo.equalsIgnoreCase("SAIR"));

    System.out.println("Busca encerrada!");
    entrada.close();
}
}
