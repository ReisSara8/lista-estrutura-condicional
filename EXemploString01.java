import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class EXemploString01{

    public static void main(String[] args) {
        
        String nome = "Curso de Java";
        //retorna a quantidade de caracteres da String
        System.out.println(nome);
        System.out.println("Tamanho da String: "
         + nome.length());

         String nick = JOptionPane.showInputDialog(null,
                "Informe o nick do seu pager");
        if(nick.equals("")){
            JOptionPane.showMessageDialog(null,
            "Filho eu pedi pra voce o seu nick, ta difícil?");
        }
    
        String jogoDoAno = " League of Legends ";
        // remove espaços do começo e do fim
        jogoDoAno = nome.trim();
    
        String sistemaOperacional ="LINUX";
        
        sistemaOperacional = sistemaOperacional
                    .toUpperCase();
        System.out.println(sistemaOperacional);

        sistemaOperacional =sistemaOperacional
                    .toLowerCase();
        System.out.println(sistemaOperacional);
    
    }

    
}