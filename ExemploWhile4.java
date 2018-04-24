import javax.swing.JOptionPane;

public class ExemploWhile4{

    public static void main(String[] args) {
        
        String nome=JOptionPane.showInputDialog
        ("Digite o seu nome");

        while(!nome.equalsIgnoreCase("Sair")&&
              !nome.equalsIgnoreCase("fim")){
        
                while(!nome.equalsIgnoreCase("Sair"))
               System.out.println("CAIU OBA");
            nome=JOptionPane.showInputDialog
            ("Digite seu nome.\nSe desejar sair digite \"Sair\" ou \"Fim\"");

        }
    }


}