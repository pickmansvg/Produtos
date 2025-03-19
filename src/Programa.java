public class Programa{
    
    public static void main (String [] args){
        
        Produto produto1 = new Produto("Notebook", "A55", 35, 2000);
        Produto produto2 = new Produto("Celular", "A56", 25, 3000);
        Produto produto3 = new Produto("Calça", "A57", 15, 4000);
        Produto produto4 = new Produto("Blusa", "A58", 5, 5000);
        Produto produto5 = new Produto("Garrafa", "A59", 90, 7000);
        Produto produto6 = new Produto("Pote", "A60", 80, 1500);
          
        ProdutoMapDAO map = new ProdutoMapDAO();
        
      
        
        map.cadastrar(produto1);
        map.cadastrar(produto2);
        map.cadastrar(produto3);
        map.cadastrar(produto4);
        map.cadastrar(produto5);
        map.cadastrar(produto6);
        
        for (Produto produto : map.listar()){
            
            System.out.println(produto); 
        }
        
        
        CarrinhoMapDAO carrinho = new CarrinhoMapDAO(map);
        
        carrinho.adicionar("A55", 0);
        
        
        
    }
    
}
