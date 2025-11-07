package Ativ20_ForEach;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos preços deseja informar? ");
        int n = entrada.nextInt();

        double[] precos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º preço: ");
            precos[i] = entrada.nextDouble();
        }

        double soma = 0.0;

        System.out.println(" Lista de Preços");

        for (double p : precos) {
            System.out.println("R$ " + p);
            soma += p;
        }
        double media = soma / n;

        System.out.printf("Média dos preços: R$ %.2fn", media);

        entrada.close();
    }
}


