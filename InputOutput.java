import java.util.Scanner;

public class InputOutput{
    public static void main(String[] arg){
       Scanner in = new Scanner(System.in);

       String Nome = "";
       int idade = 0;
       
       System.out.println("Digite o seu nome: " );
    
       Nome = in.nextLine();

       System.out.println("Digite sua idade: ");

       idade = in.nextInt();
       
       System.out.println("Seu nome é: " + Nome);
       System.out.println("E sua idade é: " + idade);

    } 
}