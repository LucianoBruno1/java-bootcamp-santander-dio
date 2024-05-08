public class UsuarioSmartTv {

    public static void main(String[] args) {
        SmartTv tv = new SmartTv();

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();

        tv.mudarCanal(13);
        System.out.println(tv.canal);
    }
    
}
