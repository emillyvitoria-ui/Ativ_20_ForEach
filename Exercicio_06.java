package Ativ20_ForEach;

import java.util.Scanner;

public class Exercicio_06 {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);


            System.out.println("Digite uma frase:");
            String frase = entrada.nextLine();


            String[] palavras = frase.split("\\s+");

            System.out.println("Palavras sem pontuação");

            for (String palavra : palavras) {
                String limpa = palavra.replaceAll("[.,;!?]", "");
                if (!limpa.isEmpty()) {
                    System.out.println(limpa);
                }
            }

            entrada.close();
        }
    }

