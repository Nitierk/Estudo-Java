import java.util.Scanner;

/*
2. Tabuada de multiplicação de “X”. Escreva um algoritmo que leia um número inteiro 'x' e
crie uma tabuada de multiplicação que vai de 1 x “X” à 10 x “X” utilizando um loop PARA.
Exiba a tabuada na tela. 
*/

public class Exercicio2{
    public static void main(String[] args){
       int Valor;
       System.out.print("Digite o numero para montar a tabuada de 1 a 10:");
       Scanner in = new Scanner(System.in);     
       Valor = in.nextInt();

       for(int i = 1; i <= 10; i++){
        System.out.println(i +"x" + Valor + "=" + Valor*i);
       }
    }
}
