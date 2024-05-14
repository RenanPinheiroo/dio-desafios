import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Ola, seja bem vindo ao Banco Bradesco! Poderia, por gentileza nos informar:");
        System.out.println("---------------------------------------------------------------------------");


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual e o seu nome?");
        String nomeCliente = scanner.nextLine();
       
        System.out.println("Qual e o seu sobrenome?");
        String sobreNomeCliente = scanner.nextLine();

        System.out.println("Qual e o numero de sua conta?");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Qual e a sua Agencia?");
        String agencia = scanner.nextLine();

        double saldo = 237.48;

        

    System.out.println("Ola, Sr. "+ nomeCliente + " " + sobreNomeCliente + " . Voce possui um saldo de " + saldo +  " na conta " + numero + "de Agencia " + agencia);

    scanner.close();
    }
}
