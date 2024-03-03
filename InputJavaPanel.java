import javax.swing.JOptionPane;

public class InputJavaPanel{
    public static void main(String[] args){
        String nome = "";
        nome = JOptionPane.showInputDialog(null, "Digite o Seu nome!");
      JOptionPane.showMessageDialog(null, "Olá "+ nome+ ", seja bem vindo ao Java grafico!");  

    }
}