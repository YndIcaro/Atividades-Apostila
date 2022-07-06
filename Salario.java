package Pagina33;
/*Icaro 3-52 questão 4 - O valor pago por um Hotel da Praia de Iracema para seus porteiros é de R$ 10,25 por hora de
trabalho. Faça um programa que pergunte ao usuário quantas horas ele trabalhou e imprima na
tela o valor do salário a ser recebido por ele */

import java.util.Scanner;

public class Salario {
 public static void main(String[] args) {
  float valorhora = (10.25f); //Atribuir o valor das horas
  System.out.printf("Digite o Valor de Horas trabalhadas: ");
  Scanner Htb = new Scanner(System.in); //Digitar a quantidade de horas trabalhadas
   float diaria = Htb.nextFloat();
   float salario = (diaria * valorhora); //Atribuir a multiplicação dos valores para o salario 
    System.out.println("Seu Salario é de: " + salario); //Resposta Final 
     Htb.close();
    }
    
}
    