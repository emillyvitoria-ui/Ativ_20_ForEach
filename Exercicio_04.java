package Ativ20_ForEach;

public class Exercicio_04 {
    public static void main(String[] args) {
        int[] notas = {70, 45, 90, 58, 100, 32};

        System.out.println("Relatório de Desempenho");

        for (int nota : notas) {

            if (nota >= 60) {
                System.out.println("Nota: " + nota + " → Aprovado");
            } else {
                System.out.println("Nota: " + nota + " → Reforço");
            }
        }
    }
}
