package aulaJAVA.secao2;

public class variavel {
 
    public static void main(String[] args) {
        // 1- O que são variáveis.
        // tipo => nome => atribuir um valor;
        String nome = "Ronney";
        int idade = 34;

        // nome => "Ronney"
        System.out.println(nome);
        System.out.println(idade);

        // 2 - Atribuição de variável com outra
        String teste = "Teste";
        String testando = teste;
        System.out.println(testando);

        long numeroGrande = 99999999999999L;
        //int numeroGrandeDois = numeroGrande;
        System.out.println(numeroGrande);

        // 3 - Comentários

        /*
         Comentarios grandes
         linha 1
         linha 2
         */

         /**
          * Função para soma
          *teste
          ctrl + / comenta as linhas selecionadas
        */

        // 4 - Strings

        String firstName = "Ronney";
        String lastName = "Torres";
        System.out.println("Ronney Torres");
        System.out.println(firstName + " " + lastName);
        System.out.println("O nome dele é " + firstName);
        String fullName = firstName + " " + lastName;
        // concatenação = operador + nas strings, para uni-las
        System.out.println(fullName);

        //  5 - char
        char letra = 'A';
        System.out.println(letra);
        String letra2 = "A";
        System.out.println(letra2);
        char simbolo = '$';
        System.out.println(simbolo);

        // 6 - Int
        int n = 42;
        System.out.println(n);
        System.out.println(n + 5);
        System.out.println(n * 10);
        System.out.println(n / 5);
        int soma = n + 5;
        System.out.println(soma);

        // 7 - Long
        long populacaoMundial = 780000000000L;
        System.out.println(populacaoMundial);
        long grandeNumero = 1_000_000L;
        System.out.println(grandeNumero + 1);

        // 8 - Double
        double preco = 19.99;
        System.out.println(preco);
        System.out.println(preco - 12);
        System.out.println(preco / 2);
        double pi = 3.141_592_123;
        System.out.println(pi);
        double valorComD = 12.1D;
        System.out.println(valorComD);

        // 9 - Operadores aritméticos
        int soma2 = 12 + 5;
        System.out.println(soma2);
        System.out.println(22 + 4);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 2.5);
        System.out.println(10.0 / 2.5);

        // para ter um resultado quebrado (1.5), pelo menos 1 numumero da divisão tem que ser double
        System.out.println(10 / 3D);
        System.out.println(10 % 3);

        // 10 - Operadores aritméticos p2
        int x = 5;
        x++;
        x++;
        x++;
        x++;
        System.out.println(x);

        // loops

        int y = 5;
        y--;
        y--;
        y--;
        y--;
        System.out.println(y);

        int a = 10;
        a += 5;
        System.out.println(a);

        int b = 10;
        b -= 5;
        System.out.println(b);

        b -= a;
        System.out.println(b);

        // 11 - type casting
        // implicito (widening)
        int numero2 = 42;
        long numeroLong = numero2;
        double numeroDouble = numero2;
        System.out.println(numeroLong);
        System.out.println(numeroDouble);

        // explicito (narrowing)
        double valorDouble = 9.78;
        int valorInt = (int) valorDouble;
        System.out.println(valorDouble);
        System.out.println(valorInt);

        // casting de char para int
        char letra3 = 'A';
        int codigoAscii = (int) letra3;
        System.out.println(codigoAscii);

        // 12 - contantes
        final int DIAS_DA_SEMANA = 7;
        System.out.println("Dias da semana: " + DIAS_DA_SEMANA);

        //  13 - var
        var z = 10;
        System.out.println(z);
        // z = "teste";
        z = 5;
        var texto2 = "teste";
        var doubleTeste = 2.0;
        System.out.println(texto2);
        System.out.println(doubleTeste);

    }

}
