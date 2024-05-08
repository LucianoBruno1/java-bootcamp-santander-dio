import java.util.Scanner;
public class ContaTerminal{
   public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int numero;
    String agencia;
    String nome_cliente;
    double saldo = 237.48;

    System.out.print("Por favor, digite o número da agência: ");
    agencia = input.nextLine();
    System.out.print("Agora digite seu nome: ");
    nome_cliente = input.nextLine();
    System.out.print("Número da conta (apenas números): ");
    numero = input.nextInt();
    input.close();

    System.out.print("Olá "+nome_cliente+"! Obrigado por criar uma conta em nosso banco, sua agencia é: "+agencia+", conta número: "+numero+" e seu saldo R$"+saldo+" já está disponível para saque");





   }

}