package Ativ20_ForEach;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os nomes separados por vírgula:");
        String linha = entrada.nextLine();

        String[] nomes = linha.split(",");

        System.out.println(" Lista de Presença");


        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + "º - " + nomes[i].trim());
        }

        entrada.close();
    }

}
