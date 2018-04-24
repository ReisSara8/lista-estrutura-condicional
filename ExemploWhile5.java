import javax.swing.JOptionPane;

public class ExemploWhile04{

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(
            "Digite seu nome");

            /*
            while(!nome.equalsIgnoreCase("Sair")&&
                  !nome.equalsIgnoreCase("Fim")){
            */
            while(!nome.equalsIgnoreCase("Sair")){
                double nota1=Double.parseDouble(JOptionPane
                .showInputDialog("Digite a sua nota 1"));
                double nota2=Double.parseDouble(JOptionPane
                .showInputDialog("Digite a sua nota 2"));
                double nota3=Double.parseDouble(JOptionPane
                .showInputDialog("Digite a sua nota 3"));
                double media=(nota1 +nota2 +nota3) /3;
                JOptionPane.showMessageDialog(null,
                     "Olá" +nome +" sua média é" +media);

                     if(media <7){
                         JOptionPane.showMessageDialog(null, "Reprovado jovi");
                     }else {
                         JOptionPane.showMessageDialog(null, "Jovem padawan");
                     }

                     nome=JOptionPane.showInputDialog("Digite seu nome.\nSe desejar sair digite \"Sair\".  :)");
            } 

    }
}