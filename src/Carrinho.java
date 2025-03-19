import java.util.Map;
import java.util.HashMap;

class CarrinhoMapDAO {
    
    private Map <String, Integer> carrinho = new HashMap<>();
    
    ProdutoMapDAO produtoCarri;
    
    public CarrinhoMapDAO(ProdutoMapDAO produtoCarri){
        
        this.produtoCarri = produtoCarri;
    }
    
   public Boolean adicionar (String idProd, Integer qtd){
       
       
       if (produtoCarri.consultar(idProd) != null && qtd>0){
           
           this.carrinho.put(idProd, qtd);
           System.out.println("Produto No Carrinho");
           return true;
       }else {
           System.out.println("Produto não Encontradp");
           return false;
       }
       
       
   }
    
    
}