import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Case2 {
    public static void main(String[] args) {
        String[] candidatos = getName();
        double salaryCia = 2000;
        int NumeroFuncionarios = 0;
        int ProximoCandidato = 0 ;
  
        ArrayList<String> selecionados = new ArrayList<>();
       
        while (NumeroFuncionarios < 5 && ProximoCandidato < candidatos.length) {
            String candidato = candidatos[ProximoCandidato++];
            double salary = Math.round(ValorPretendido());
            System.out.println("O Funcionario " + candidato + " deseja ter um salario de " + salary);

            if(salaryCia >= salary){
                System.out.println("Candidato Selecionado!");
                selecionados.add(candidato);
                NumeroFuncionarios++;

            } else {
    
                System.out.println("O Candidato nao foi selecionado!");
                }
           
        }

            System.out.println("Hoje, nos selecionamos " + NumeroFuncionarios + " candidatos! ");
            System.out.println("Lista dos Selecionados: ");
            for( String candidatoSelecionado : selecionados){

                System.out.println(candidatoSelecionado);
            }


            Scanner scan = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Ligar para os candidatos?");
                   
            String autorizaLigar = scan.next();

            scan.close();

           if(autorizaLigar.equals("Sim")){
            System.out.println("Ligar!");
        } else{

            System.out.println("Nao ligar!");
        }
    }


    static String[] getName(){

        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        return candidatos;

    }

    static double ValorPretendido(){
     
        return ThreadLocalRandom.current().nextDouble(1800, 2200);

    }

 } 
