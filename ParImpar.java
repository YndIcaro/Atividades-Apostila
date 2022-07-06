package Pagina33;
/*Icaro 3-52 Questao 3 - Faça um programa para ler um número do teclado e imprimir na tela se ele é par ou ímpar.
Imprima também se ele é primo. */

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
      
    System.out.printf("Digite um numero: ");
    Scanner n = new Scanner(System.in);//Valor a ser recebido
    int a = n.nextInt();
      //Desvio Condicional 
     if( Primo(a) ){ //Desvio para informar se é primo
  System.out.println(a + " - É primo.");  
     }else{
  System.out.println(a+ " - Não é primo.");
     }         
    if (a % 2 == 0) { //Desvio para informar se é par ou impar
  System.out.println(a + " - Numero par");
     }else{ 
  System.out.println(a + " - Numero impar");
        n.close();
     }
}
public static boolean Primo(int numero) { //Faz retornar um valor verdadeiro ou falso
  for (int num = 2; num < numero ; num++) { //Contar apartir do numero 2 (0 e 1 ta contando como se fosse primo)
    if (numero % num == 0) //Desvio para mostrar o resto da divsão 
  return false;   
  }
 return true;

}
}

