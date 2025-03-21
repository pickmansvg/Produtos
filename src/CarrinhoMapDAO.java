import java.util.Map;
import java.util.HashMap;


public class CarrinhoMapDAO {
    
    private Map <String, Integer> carrinho = new HashMap<>();
    
    ProdutoMapDAO produtoCarri;
    
    public CarrinhoMapDAO(ProdutoMapDAO produtoCarri){
        
        this.produtoCarri = produtoCarri;
    }

  
   public void adicionar (String idProd, Integer qtd){
       Produto produtoCarrinho = produtoCarri.consultar(idProd); 
       Integer nqtd;
       if (produtoCarrinho != null){
            if(this.carrinho.containsKey(idProd)){
                nqtd = this.carrinho.get(idProd) + qtd;
                if(produtoCarrinho.getQtd() >= nqtd){
                    this.carrinho.put(idProd, nqtd);
                    System.out.println("Quantidade atualizada");
                }else{
                    System.out.println("Estoque insuficiente! Você só pode adicionar mais " + (produtoCarrinho.getQtd() - this.carrinho.get(idProd)) + " produtos ao carrinho");
                }
                
            }else{
                if(produtoCarrinho.getQtd() >= qtd){
                this.carrinho.put(idProd, qtd);
                System.out.println("Produto no Carrinho");
                }else{
                    System.out.println("Você só pode adicionar até " +produtoCarrinho.getQtd()+ " produtos");
                }
            }


            
       }else{
        System.out.println("Produto Não Encontrado");

       }
    }
       
   

   public void remover (String idProd){


        if (this.carrinho.get(idProd) != null){
        this.carrinho.remove(idProd);
        System.out.println("Produto Removido com Sucesso");
        }else {
            System.out.println("Produto não encontrado");
        }


   }


   public void valorTotal (String idProd){

    Produto produtoCarrinho = produtoCarri.consultar(idProd);
    for (Integer qtd : this.carrinho.values()){

        Double vt = (double) 0;
        vt = vt + (produtoCarrinho.getPreco() * qtd);
        System.out.println("Total a pagar: R$ " + vt);
        System.out.println("Quantidade total: " + qtd + " unidades");
    
    }
   }
    
    
}