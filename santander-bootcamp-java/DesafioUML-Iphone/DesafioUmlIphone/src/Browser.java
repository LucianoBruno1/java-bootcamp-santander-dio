import java.util.ArrayList;
import java.util.List;

public class Browser extends Funcionalidades {

   private List<String> abas = new ArrayList<>();
   private int abaAtual=-1;

   public void mostrarPagina(String url){
    abas.add(url);
    abaAtual = abas.size() + 1;
   }

   public void adicionarNovaAba(String novaAba){

    abas.add(novaAba);
    abaAtual = abas.size() +1;
   }
   public void fecharAba(String aba){
    abas.remove(aba);
   }

   public void atualizarPagina(String pagina){
    abas.get(abaAtual);
    System.out.println("Página atualizada");

   }
    

    
    
}
