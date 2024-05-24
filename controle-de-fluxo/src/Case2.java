import java.util.concurrent.ThreadLocalRandom;

public class Case2 {
    public static void main(String[] args) {
        String[] candidatos = getName();
        double salary = Math.round(ValorPretendido());
        double salaryCia = 2000;
        int NumeroFuncionarios = 0;
        int ProximoCandidato = 0 ;
       
        while (NumeroFuncionarios < 5 && ProximoCandidato < candidatos.length) {
            String candidato = candidatos[ProximoCandidato++];

            System.out.println("O Funcionario " + candidato + " deseja ter um salario de " + salary);
            
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
