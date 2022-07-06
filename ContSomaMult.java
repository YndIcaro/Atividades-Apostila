package Pagina33;
/*Icaro 3-52
Questao 1
Escreva um programa que imprima na tela a soma dos números ímpares entre 0 e 30 e a
multiplicação dos números pares entre 0 e 30. */
public class ContSomaMult {
public static void main(String[] args){
  //Atribuição de valores
  long prodPar = 1;
  int somaImpar = 0;
  int numero;
//Contar ate um valor
  for(numero = 0; numero <= 30; numero++) {  
    //Desvio Condicional 
    if(numero % 2 == 1) {

    somaImpar += numero;

    //Desvio Condicional      

    }else{
        if(numero > 0)
        prodPar *= numero;
    }
 }        
 //Resposta Final 
     System.out.println("Soma dos ímpares: " + somaImpar);
     System.out.println("Produto dos pares: " + prodPar);         
                 

}
}
