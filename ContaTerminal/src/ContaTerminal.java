import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Olá, seja bem vindo ao Banco Bradesco! Poderia, por gentileza nos informar:");
        System.out.println("---------------------------------------------------------------------------");


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual é o seu nome?");
        String nomeCliente = scanner.nextLine();
       
        System.out.println("Qual é o seu sobrenome?");
        String sobreNomeCliente = scanner.nextLine();

        System.out.println("Qual é o número de sua conta?");
        int numero = scanner.nextInt();

        System.out.println("Qual é a sua Agência?");
        String agencia = scanner.nextLine();

        double saldo = 237.48;

        

    System.out.println("Olá, Sr. "+ nomeCliente + " " + sobreNomeCliente + " . Você possui um saldo de" + saldo +  " na conta " + numero + "de Agência " + agencia);

    scanner.close();
    }
}
