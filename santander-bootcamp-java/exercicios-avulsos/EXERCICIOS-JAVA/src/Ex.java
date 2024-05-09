import java.util.Scanner;
import java.util.InputMismatchException;
public class Ex {
    /*. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
    mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
    (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) */

    public static void main(String[] args) throws Exception {
       
        Scanner input = new Scanner(System.in);
        

      
        try{
            System.out.print("Digite quantos anos você tem: ");
        int idade = input.nextInt();

        System.out.print("você possui "+idade+" anos e quantos meses? ");
        int meses = input.nextInt();

        System.out.print("Você possui "+idade+" anos, "+meses+" meses e quantos dias de idade? ");
        int dias = input.nextInt();

        int diasDeVida = (idade * 365) + (meses * 30) + dias;
        
        System.out.println("Você possui "+diasDeVida+" dias de vida!");

        } catch(InputMismatchException e){
            System.out.println("Digite apenas números inteiros.");
        }
    }
}
