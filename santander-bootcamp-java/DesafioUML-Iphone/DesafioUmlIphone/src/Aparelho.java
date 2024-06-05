public class Aparelho extends Funcionalidades implements Iphone {

    private boolean realizandoLigacao = false;
    private String contatoLigacao;
    @Override
    public void ligar(String contato) {
        contatoLigacao = contato;
        realizandoLigacao = true;
        System.out.println("Chamando");

    }

    @Override
    public void atender() {
        realizandoLigacao = true;
        System.out.println("Em chamada com: "+contatoLigacao);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz de: "+contatoLigacao);
    }

    @Override
    public void desligar() {
       realizandoLigacao = false;
       System.out.println("Ligação com "+contatoLigacao+" encerrada.");
    }

    
    
}
