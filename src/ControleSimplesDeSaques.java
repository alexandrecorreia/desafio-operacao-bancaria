import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        while (true) {
            
            double valorSaque = scanner.nextDouble();

            if (valorSaque > limiteDiario ) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop se o saque ultrapassar o limite
            } else if( valorSaque == 0 ) {
                
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop se o usuário não deseja continuar
                
            } else {
                limiteDiario = limiteDiario - valorSaque;

                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }
        
        // Fechar o scanner
        scanner.close();
    }
}