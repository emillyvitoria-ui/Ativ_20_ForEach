package Ativ20_ForEach;

import java.util.Scanner;

public class Exercicio_09 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite os e-mails separados por vírgula:");
    String entrada = sc.nextLine();

    String[] emails = entrada.split(",");

    for (int i = 0; i < emails.length; i++) {
        emails[i] = emails[i].trim().toLowerCase();
    }

    System.out.println(" Todos os e-mails");
    for (String e : emails) {
        System.out.println(e);
    }

    String[] unicos = new String[emails.length];
    int contador = 0;

    for (String e : emails) {
        boolean repetido = false;

        for (int j = 0; j < contador; j++) {
            if (e.equals(unicos[j])) {
                repetido = true;
                break;
            }
        }

        if (!repetido) {
            unicos[contador] = e;
            contador++;
        }
    }

    System.out.println("E-mails únicos");
    for (int i = 0; i < contador; i++) {
        System.out.println(unicos[i]);
    }

    sc.close();
}

}
