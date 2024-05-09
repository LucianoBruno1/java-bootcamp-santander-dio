public class Ex002 {
    /*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
    números 4, 5 e 6. A soma das duas médias. A média das médias */

    public static void main(String[] args) {

        int num8 = 8;
        int num9 = 9;
        int num7 = 7;

        int num4 = 4;
        int num5 = 5;
        int num6 = 6;

        double media1 = (num8 + num9 + num7) / 3;
        double media2 = (num4 + num5 + num6) / 3;
        double somaDasMedias = media1 + media2;
        double mediaDasMedias = (media1 + media2)/2;

        System.out.println("A média aritmética dos números 8, 9 e 7 é: "+media1);
        System.out.println("A média aritmética dos números 4, 5 e 6 é: "+media2);
        System.out.println("A soma das médias é: "+somaDasMedias);
        System.out.println("A média das médias é: "+mediaDasMedias);
        
    }

}
