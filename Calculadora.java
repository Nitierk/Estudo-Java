import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double number1, number2, soma, sub, mul, div;

        System.out.print("Digite o primeiro numero: ");
        number1 = in.nextDouble();

        System.out.print("Digite o segundo numero: ");
        number2 = in.nextDouble();

        soma  =  number1 + number2;
        sub  =  number1 - number2;
        mul  =  number1 * number2;
        div  =  number1 / number2;

        JOptionPane.showMessageDialog(null, "Soma: "+ soma + ,=);

    }
}
