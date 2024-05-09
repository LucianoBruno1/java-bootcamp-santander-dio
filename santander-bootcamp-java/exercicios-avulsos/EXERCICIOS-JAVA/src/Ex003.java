import java.util.Scanner;

public class Ex003 {

    /*Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. */

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //PEÇA 1
    System.out.print("Digite a porcentagem do IPI a ser acrescido no valor das peças: ");
    double porcentagemIPI = input.nextDouble();
    System.out.println("Digite o código da peça 1: ");
    int codigoPeca1 = input.nextInt();
    System.out.println("Digite o valor unitário da peça 1: ");
    double valorUnitarioPeca1 = input.nextDouble();
    System.out.println("Digite a quantidade de peças do modelo 1: ");
    int quantidadePecas1 = input.nextInt();

    //PEÇA 2
    System.out.println("Digite o código da peça 2: ");
    int codigoPeca2 = input.nextInt();
    System.out.println("Digite o valor unitário da peça 2: ");
    double valorUnitarioPeca2 = input.nextDouble();
    System.out.println("Digite a quantidade de peças do modelo 2: ");
    int quantidadePecas2 = input.nextInt();

    double precoPecas = (valorUnitarioPeca1 * quantidadePecas1) +  (valorUnitarioPeca2 + quantidadePecas2) * (porcentagemIPI/100 + 1);

    System.out.println("O total do valor das peças, acrescido das taxas é de: R$"+precoPecas);
}

}
