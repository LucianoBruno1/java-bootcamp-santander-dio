import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the first parameter: ");
        int firstParameter = input.nextInt();

        System.out.print("Type the second parameter: ");
        int secondParameter = input.nextInt();
        input.close();

        try{
            CounterClass.counter(firstParameter, secondParameter);
        }catch(InvalidParametersException e){
            System.out.println(e.getMessage());
        }
    }

   
}