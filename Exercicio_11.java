package Ativ20_ForEach;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os itens no formato nome:categoria separados por vírgula:");
        System.out.println("Exemplo: arroz:alimento, camisa:roupa, sabão:limpeza");
        String entrada = sc.nextLine();

        String[] itens = entrada.split(",");

        String[] nomes = new String[itens.length];
        String[] categorias = new String[itens.length];

        for (int i = 0; i < itens.length; i++) {
            String[] partes = itens[i].split(":");
            nomes[i] = partes[0].trim().toLowerCase();
            categorias[i] = partes[1].trim().toLowerCase();
        }

        System.out.println("Todos os Itens");
        for (int i = 0; i < itens.length; i++) {
            System.out.println(nomes[i] + " (" + categorias[i] + ")");
        }

        System.out.print("Digite uma categoria para filtrar: ");
        String categoriaEscolhida = sc.nextLine().trim().toLowerCase();

        System.out.println("Itens da categoria " + categoriaEscolhida );
        boolean encontrou = false;
        for (int i = 0; i < itens.length; i++) {
            if (categorias[i].equals(categoriaEscolhida)) {
                System.out.println(nomes[i]);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum item encontrado nessa categoria.");
        }

        sc.close();
    }
}

