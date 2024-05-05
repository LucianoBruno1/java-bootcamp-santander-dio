import java.util.Scanner;

public class BoletimEstudantil {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite a primeira nota: ");
        double nota2 = input.nextDouble();

        if (nota1 > 10 || nota1 < 0) {
            System.out.println("A primeira nota digitada é inválida. Tente novamente."); 
        }
        if (nota1 > 10 || nota1 < 0) {
            System.out.println("A segunda nota digitada é inválida. Tente novamente."); 
        }
        

        double media = calcMedia(nota1, nota2);

        if(media >= 7){
            System.out.println("Sua média é: "+ media);
            System.out.println("Você está aprovado!");
        } else if (media >= 3 && media < 7){
            System.out.println("Sua média é: "+media);
            System.out.println("Você vai para a recuperação");
        }else if (media < 3){
            System.out.println("Você está reprovado");
        }
    }

    public static double calcMedia(double firstValue, double secondValue){
        return (firstValue + secondValue) / 2; 
    }
}