package Ativ20_ForEach;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] temperaturas = new double[7];

    for (int i = 0; i < 7; i++) {
        System.out.print("Digite a temperatura do dia " + (i + 1) + " (°C): ");
        temperaturas[i] = sc.nextDouble();
    }
    System.out.println("Temperaturas Registradas");
    for (double t : temperaturas) {
        System.out.println(t + " °C");
    }

    System.out.println(" Verificação de Calor Elevado");

    boolean alerta = false;
    for (int i = 0; i < 7; i++) {
        if (temperaturas[i] >= 35) {
            System.out.println("Calor elevado no dia " + (i + 1) + " (" + temperaturas[i] + " °C)");
            alerta = true;
        }
    }

    if (!alerta) {
        System.out.println("Nenhum dia com calor elevado.");
    }
}
}

