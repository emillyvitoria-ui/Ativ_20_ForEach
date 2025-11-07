package Ativ20_ForEach;

public class Exercicio_02 {
    public static void main(String[] args) {

        String[] palavras = {"sol", "nuvem", "lua", "astro"};
        System.out.println("Palavras com até 4 letras:");

        for (String palavra : palavras) {

            if (palavra.length() <= 4) {
                System.out.println(palavra);
            } else {
            }
        }
    }
}

