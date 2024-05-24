import java.util.concurrent.ThreadLocalRandom;

public class Case2 {
    public static void main(String[] args) {
        String[] candidatos = getName();
        double salaryCia = 2000;
        int NumeroFuncionarios = 0;
        int ProximoCandidato = 0 ;
       
        while (NumeroFuncionarios < 5 && ProximoCandidato < candidatos.length) {
            String candidato = candidatos[ProximoCandidato++];
            double salary = Math.round(ValorPretendido());
                        System.out.println("O Funcionario " + candidato + " deseja ter um salario de " + salary);

            if( salaryCia >= salary){

                System.out.println("Candidato Selecionado!");
                NumeroFuncionarios++;
                
            } else {
    
                System.out.println("O Candidato nao foi selecionado!");
                }
            
        }

        System.out.println("Hoje, nos selecionamos " + NumeroFuncionarios + " candidatos!");
    }


    static String[] getName(){

        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        return candidatos;

    }

    static double ValorPretendido(){
     
        return ThreadLocalRandom.current().nextDouble(1800, 2200);

    }


}
