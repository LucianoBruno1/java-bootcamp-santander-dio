public class SmartTv {
     boolean ligada = false;
     int canal = 1;
     int volume = 25;

    public  void ligarTV(){
        if (ligada) {
            System.out.println("A TV já está ligada");
        }else{
            ligada = true;
            System.out.println("tv ligada com sucesso");
        }
    }

    public void desligarTV(){
        if(ligada){
            ligada = false;
            System.out.println("TV DESLIGADA");
        }else{
            System.out.println("A TV já está desligada");
        }
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
