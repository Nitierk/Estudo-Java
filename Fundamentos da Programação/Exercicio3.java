/*
 3. Faturamento semestral. Uma empresa quer saber o seu faturamento semestral assim
como a média mensal. Crie um algoritmo para ler o valor do faturamento de cada mês do
semestre (mês 1, mês 2 … mês 6) utilizando um loop PARA. Imprima a média do
faturamento mensal e o faturamento total daquele semestre.
 
 */
import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args){
        float fatuMensal, fatuTotal;
         fatuTotal = 0;
        for(int i = 1; i < 7; i++){
            fatuTotal = fatuTotal + Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do " + i +"º Mês: "));
        }
        fatuMensal = fatuTotal/6;

        JOptionPane.showMessageDialog(null, "Faturamento total: R$ " + fatuTotal
                                      + " | Media do Faturamento Mensal: R$" + fatuMensal, "Faturamento", 1);          


    }
}
