package Pagina33;
    
import java.util.Scanner;
/* Icaro 3-52 
Questão 5 
Modifique o programa anterior para que o sistema imprima uma mensagem de alerta quando o
valor a ser pago ao funcionário seja inferior a R$ 50,00: "Atenção, dirija-se à direção do Hotel!".
*/
public class Salariomod {
        public static void main(String[] args) {
         float valorhora = (10.25f);// Valor fixo das horas
        System.out.printf("Digite o Valor de Horas trabalhadas: ");
        Scanner Htb = new Scanner(System.in);// htb = Horas trabalhadas - Digitar o valor das horas
        float diaria = Htb.nextFloat(); // Diaria = total de horas 
       float salario =  (diaria * valorhora); // Salario = Total do dia - Multiplicação dos valores 
       
    // Saber se o salario foi acima ou abaixo do valor esperado.
        if (salario > 50.00f){
         System.out.println("Seu Salario é de: R$ " + salario); //Retorna o Valor "verdadeiro"
        }else{
            System.out.println("Seu Salario é de: R$ " + salario + " Atenção, dirija-se à direção do Hotel!"); //Retorna o valor "falso"
        }
        Htb.close();
        }
        
    }
         
