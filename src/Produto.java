


public class Produto {
    
    private String nome; 
    private String idProd;
    private Integer qtd;
    private Integer preco;
    
    public Produto (String nome, String idProd, Integer qtd, Integer preco){
        
        this.nome = nome;
        this.idProd = idProd;
        this.qtd = qtd;
        this.preco = preco;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setIdProd(String idProd){
        this.idProd = idProd;
    }
    
    public String getIdProd() {
        return this.idProd;
    }
    
    public void setQtd(Integer qtd){
        this.qtd = qtd;
    }
    
    public Integer getQtd(){
        return this.qtd;
    }
    
    public void setPreco(Integer preco){
        this.preco = preco;
    }
    
    public Integer getPreco(){
        return this.preco;
    }
    
    
    public String toString(){
        
        return "Produto {nome = " + nome + ", Identificador = " + idProd + ", Quantidade = " + qtd + ", Preço = " + preco + "}";
        
    }
    
    
    
}
