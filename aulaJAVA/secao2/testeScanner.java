package aulaJAVA.secao2;
import java.util.Scanner;

public class testeScanner {
    public static void main(String[] args) {
        // 1 - testando scanner
        Scanner scanner = new Scanner(System.in);

        // Mensagem para usuario entender o que precisa digitar
        System.out.println("Digite o seu nome: ");
        
        // Resgata o valor do terminal
        String nome = scanner.nextLine();
        
        // Exibe o valor
        System.out.println("Seja Bem Vindo " + nome);
        
        //nextInt
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Voce tem " + idade + " anos de idade!");

        // Erro nextLine
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite um texto: ");
        String txt = scanner.nextLine();
        System.out.println("O numero é: " + n + " e o texto é: " + txt + ".");
        
        // Fechamento do scanner, para evitar memory leak
        scanner.close();
    }
}
