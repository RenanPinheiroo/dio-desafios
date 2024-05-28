import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
       
        Scanner terminal = new Scanner(System.in);
    
		System.out.println("Digite o primeiro parametro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parametro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException e){
			System.out.println("O parametro Um nao pode ser menor que o parametro Dois");
		}
		
        terminal.close();


	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if(parametroUm < parametroDois){

            throw new ParametrosInvalidosException();

        } else {

            System.out.println(parametroUm - parametroDois);
        }
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}
    class ParametrosInvalidosException extends Exception{


    }


