package Pagina33;
//Icaro 3-52 Questao 2 - Faça um programa para imprimir os números primos de 1 a 123.

public class ValorPrimos {

public static void main(String[] args) {    
 for (int num = 2; num <= 123; num++) //Valor inicial e valor final 
     if( Primo(num)){
     System.out.println(num + " é primo.");
     }  
     }
     
public static boolean Primo(int numero) {//Faz retornar um valor verdadeiro ou falso
  for (int primo = 2; primo < numero; primo++) { //Contar apartir do numero 2 (0 e 1 ta contando como se fosse primo)
  if (numero % primo == 0)
  return false;   
  }
 return true;
}
}


