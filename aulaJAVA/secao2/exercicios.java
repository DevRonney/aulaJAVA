package aulaJAVA.secao2;

public class exercicios {
    public static void main(String[] args) {
        // Exercicio 01
        int num = 10;
        int total = num * 2;
        System.out.println(total);

        // Ecercicio 02
        char letra = 'A';
        int valorNum = (int) letra;
        System.out.println(valorNum);

        // Ecercicio 03
        double num1 = 15.75;
        double num2 = 20.40;
        double valorTotal = num1 + num2;
        System.out.println(valorTotal);

        // Ecercicio 04
        long numLong = 2_000_000_000L;
        int numLonInt = (int) numLong;
        System.out.println(numLonInt);

        // Ecercicio 05
        String texto = "Olá, Mundo";
        String textoCompleto = texto + " Bem-vindo ao Java!";
        System.out.println(textoCompleto);

    }
}
