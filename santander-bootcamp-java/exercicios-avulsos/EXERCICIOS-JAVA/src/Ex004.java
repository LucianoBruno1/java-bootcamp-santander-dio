import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex004 {

    /*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00) */

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.print("Digite o valor do salário minimo atual: ");
    double salarioMinimo = input.nextDouble();

    System.out.print("Digite o seu salario: ");
    double salarioAtual = input.nextDouble();

    double quantidadeDeSalariosMinimos = salarioAtual/salarioMinimo;

    System.out.print("O seu salário de R$"+salarioAtual +" corresponde a "+df.format(quantidadeDeSalariosMinimos)+" salários mínimos");

}

}
