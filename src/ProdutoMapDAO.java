import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class ProdutoMapDAO implements IProdutoDAO{
    
    private Map <String, Produto> produtos = new HashMap<>();
    
    
    
    public Boolean cadastrar (Produto produto){
        if (this.produtos.containsKey(produto.getIdProd())){
            return false;
        }
        
        this.produtos.put(produto.getIdProd(), produto);
        return true;
    }
    public Collection <Produto> listar(){
        
        return this.produtos.values();
    }
    
    
    public Produto consultar (String idProd){
       return this.produtos.get(idProd);
        }
        
    
    public void remover (String idProd){
        
         Produto prodCad = this.produtos.get(idProd);
        if (prodCad != null){
            this.produtos.remove(prodCad.getIdProd(), prodCad); 
        }
    }
    public void editar (Produto produto){
        
            Produto prodCad = this.produtos.get(produto.getIdProd());
            if (prodCad != null){
                prodCad.setNome(produto.getNome());
                prodCad.setQtd(produto.getQtd());
                prodCad.setPreco(produto.getPreco());

            
            }
    
        }

    
}
