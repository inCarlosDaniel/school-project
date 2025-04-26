
package Apto_ou_Nao_Apto;
import java.util.Scanner;


public class AptoouNaoApto {


    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        System.out.println("Qual a nota do Aluno?");
        int N1 = N.nextInt();
        
        if (N1 > 9) { 
            System.out.println(" ALUNO APROVADO! ");
            System.out.println(" NOTA OTIMA! ");
        } else if ( N1 > 4) {
            System.out.println(" ALUNO APROVADO! ");
            System.out.println(" NOTA REGULAR!");
        }
        else {
            System.out.println(" ALUNO NÃO APTO! ");
        }
        N.close();
    }
    
}

