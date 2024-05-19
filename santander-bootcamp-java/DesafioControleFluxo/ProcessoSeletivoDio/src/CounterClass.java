public class CounterClass {

    public static void counter(int parameterOne, int parameterTwo)throws InvalidParametersException{
        if(parameterOne > parameterTwo){
            throw new InvalidParametersException("The first parameter must be lower than the second parameter");
        }

        int count = parameterTwo - parameterOne;
        for (int i = 1; i < count; i++) {
            System.out.println("printing number: "+i);
            
        }
    }
    
}
