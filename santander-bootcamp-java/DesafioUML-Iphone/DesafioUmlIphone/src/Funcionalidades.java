public class Funcionalidades {

    private boolean tocando = false;
    private String nomeMusica;

    public void tocarMusica(){
        if(!tocando){
            System.out.println("Nenhuma música em reprodução no momento.");
        }else{
            System.out.println(nomeMusica + "Em reprodução");
        }
    };

    public void pausar(){
        if (tocando) {
            System.out.println("Música pausada!");
            tocando = false;
        }
    }

    public void tocarMusica(String musica){
        this.nomeMusica = musica;
        System.out.println("Tocando: "+nomeMusica);
    }
    
}
