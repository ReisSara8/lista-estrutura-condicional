import javax.swing.JOptionPane;

public class IMC{

    public static void main(String[] args) {
        
        double peso=Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));
        double altura=Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
        double imc=peso  /(altura *altura);
        
        if (imc <=9.99){
            System.out.print("Desnutrição Grau V");
        }else if(imc <=12.9){
            System.out.print("Desnutrição Grau IV");
        }else if(imc <=15.9){
            System.out.print("Desnutrição Grau III");
        }else if(imc <=16.9){
            System.out.print("Desnutrição Grau II");
        }else if(imc <=18.4){
            System.out.print("Desnutrição Grau I");
        }else if(imc <=24.9){
            System.out.print("Normal");
        }else if(imc <=29.9){
            System.out.print("Pré-obesidade");
        }else if(imc <=34.5){
            System.out.print("Obesidade Grau I");
        }else if(imc <=39.9){
            System.out.print("Obesidade Grau II");
        }else if(imc >=39.9){
            System.out.print("Obesidade Grau III");
            
        }
    }
}
