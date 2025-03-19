import java.util.Collection;


interface IProdutoDAO{
    
    public Boolean cadastrar (Produto produto);
    public Collection <Produto> listar();
    public Produto consultar (String idProd); 
    public void remover (String idProd);
    public void editar (Produto produto);
    
}