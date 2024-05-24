import java.util.Locale;
import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) throws Exception {
        
        int salarioEmpresa = 2000;
        int salarioFuncionario = obterPretensaoSalarial();

        if( salarioEmpresa > salarioFuncionario){

            System.out.println("LIGAR PARA O CANDIDATO!");

        } else if( salarioEmpresa == salarioFuncionario){

            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA!");

        } else {

            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS!");
            }
        
        }

            public static int obterPretensaoSalarial() {

                int pretensaoSalarial;
                
                Scanner scan = new Scanner(System.in).useLocale(Locale.US);
                System.out.println("Qual e a sua pretensao salarial?");
               
                pretensaoSalarial = scan.nextInt();
               
              System.out.println("Por favor, insira um número válido.");
               scan.close();
        
                return pretensaoSalarial;
}
}



