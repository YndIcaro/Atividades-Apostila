package Pagina33;
/*Icaro 3-52 
Questão 6 
Existem 454 gramas em uma libra, e 1000 gramas em um quilo. Faça um programa que converta
quilos para libras e vice-versa. (Dica: use um caractere indicando a ordem da conversão,
exemplo "java q 1000" seria o comando para converter 1000 quilos para libra, e "java l 1000"
seria o comando para converter 1000 libras para quilo) */
import java.util.Scanner;
public class Converter { 
    public static void main(String[] args) {
//Atribuição de variaveis
String valorSimb=""; 
double resulL=0; 
double resulKg=0;
//                          Menu
 System.out.println("1 - Converter Kg em libras");
 System.out.println("2 - Converter Libras em Kg");  
    Scanner Resposta = new Scanner (System.in);
     System.out.printf("Digite:  "); //Valor pra mostrar opção
 int opcao = Resposta.nextInt(); 

 //Pode ser feito com case tambêm ficaria mais organizado 

    if(opcao==1) { //Desvio para a primeira opção = Conversão em libras "Lbs - Pounds" 
     System.out.printf("Digite o valor em KG : ");//Texto para indicar a ação
    double d = Resposta.nextDouble(); //  d = valor Digitado / Valor para ser Recebido
     resulL= d * 2.2046; valorSimb="lbs"; //Calculo da conversão + (Valor recebido * Valor de 1kg em libras = 2.2046...) + atribuição do simbolo (Exemplo de Atribuição com String)

  System.out.println("O valor aproximado é de: "+resulL+" "+ valorSimb); // Resultado final

} 
    else { //Segunda Opção = Conversão para kilos
     System.out.printf("Digite o valor em Libras: "); //Texto para indicar a ação
    double d = Resposta.nextDouble(); // d = valor digitado / Valor para ser recebido 
     resulKg = d * 0.4536; valorSimb="kg"; //Calculo da conversão +(Valor recebido * valor de libras = 0.4536 kg) + atribuição do simbolo

 System.out.println("O valor aproximado é de : "+resulKg+" "+ valorSimb);//Resultado final 
    } 
    Resposta.close();
    } 
}