import java.util.Scanner;
import java.util.Locale;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        
        double saldo = 0; 
        boolean executar = true;
        
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while ( executar ) { 

            int opcao = scanner.nextInt(); 
            double valorOperacao;
            
            switch (opcao) {
                case 1:
                        
                    valorOperacao = scanner.nextDouble();
                    saldo = saldo + valorOperacao;
                    System.out.println("Saldo atual: " + saldo );

                    break;
                
                case 2:
                    
                    valorOperacao = scanner.nextDouble();
                    
                    if( valorOperacao < saldo ){ 
                        saldo = saldo - valorOperacao; 
                        System.out.println("Saldo atual: " + saldo );
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    
                    break;

                case 3:
                    
                    System.out.println("Saldo atual: " + saldo );
                    break;
            
                case 0:
                    System.out.println("Programa encerrado.");
                    executar = false;
                    break;
            }
 
        }
    }
}