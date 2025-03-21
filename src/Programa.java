import javax.swing.JOptionPane;

public class Programa{
    
    public static void main (String [] args){
        
        String opcao = JOptionPane.showInputDialog(null, "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração e 5 para sair",
         "Cadastro", JOptionPane.INFORMATION_MESSAGE);

         while(!isOpcaoValida(opcao)){

            if ("".equals(opcao)){

                sair();
                            }
                opcao = JOptionPane.showInputDialog(null, "Opção Inválida! Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração e 5 para sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
       
                
                         }
                         
                         
                                 
                                 
                                 
                                 
                                 
                                 
                             }
                         
                             private static boolean isOpcaoValida(String opcao) {
                        if("1".equals(opcao) || "2".equals(opcao)|| "3".equals(opcao)
                        || "4".equals(opcao) || "5".equals(opcao)) {
                            return true;
                        }
                        return false;
                    }
                
                            private static void sair() {
                                JOptionPane.showInputDialog(null, "Até logo",
                "Sair", JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
             }
    
}
