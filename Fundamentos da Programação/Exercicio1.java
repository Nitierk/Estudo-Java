
 /*
1. Soma dos múltiplos de 3 até x. Crie um algoritmo que leia um número inteiro 'x' e calcule
a soma de todos os múltiplos de 3 no intervalo de 1 até 'x' utilizando um loop PARA. Exiba o
resultado.
 */
 
import java.util.Scanner;

 public class Exercicio1{
    public static void main(String[] args){
      int Total = 0;
      int Qtd;

      Scanner in = new Scanner(System.in);

      System.out.print("Digite o valor limite das mutiplicações: ");
      Qtd = in.nextInt();

      for (int i = 1; i <= Qtd; i++) {
        System.out.println("3x" + i + "=" + i*3);
        Total = Total + (i*3);  
      }
      System.out.println("O resultado da soma de toda a tabela é : " + Total);  
    }
 }


 