import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Case2 {
    public static void main(String[] args) {
        String[] candidatos = getName();
        double salaryCia = 2000;
        int numeroFuncionarios = 0;
        int ProximoCandidato = 0 ;
        
  
        ArrayList<String> selecionados = new ArrayList<>();
       
        while (numeroFuncionarios < 5 && ProximoCandidato < candidatos.length) {
            String candidato = candidatos[ProximoCandidato++];
            double salary = Math.round(ValorPretendido());
            System.out.println("O Funcionario " + candidato + " deseja ter um salario de " + salary);

            if(salaryCia >= salary) {
                System.out.println("Candidato Selecionado!");
                selecionados.add(candidato);
                numeroFuncionarios++;

            } else {
    
                System.out.println("O Candidato nao foi selecionado!");
                }
           
        }

            System.out.println("Hoje, nos selecionamos " + numeroFuncionarios + " candidatos! ");
            System.out.println("Lista dos Selecionados: ");
            for( String candidatoSelecionado : selecionados){

                System.out.println(candidatoSelecionado);
            }


            Scanner scan = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Ligar para os candidatos?");
                   
            String autorizaLigar = scan.next();

           

           if(autorizaLigar.equalsIgnoreCase("Sim")){
            do {
                System.out.println("Telefone tocando!");
            } while(tocando());

            System.out.println("Alo !!");

            } else if (autorizaLigar.equalsIgnoreCase("Nao") || autorizaLigar.equalsIgnoreCase("Não")) {
               System.out.println("Desligando o telefone");                
            } else {

            System.out.println("Favor, dizer Sim ou Nao");
            }
            scan.close();
        
    }    

    static String[] getName(){

        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        return candidatos;

    }

    static double ValorPretendido(){
     
        return ThreadLocalRandom.current().nextDouble(1800, 2200);

    }

    private static boolean tocando(){

        boolean atendeu = new Random().nextInt(2)==1;

        System.out.println("Atendeu?" + atendeu);

        return ! atendeu;
    }
}