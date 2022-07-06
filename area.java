package Pagina27;
import java.util.Scanner;


public class area { /*icaro de oliveira 3-52
     h = altura
     b = base menor
     B = base maior
     Área = (h . (b + B)) / 2;*/
public static void main(String[]args){

  System.out.printf("Digite o valor da altura: ");
    Scanner h = new Scanner(System.in);// Valor a ser recebido
    int altura = h.nextInt();

  System.out.println("     ");

  System.out.printf("Digite o valor da base menor: ");
    Scanner b = new Scanner(System.in);// Valor a ser recebido
    int basemenor = b.nextInt();
  System.out.println("     ");

  System.out.printf("Digite o valor da base maior: ");
    Scanner B = new Scanner(System.in);// Valor a ser recebido
    int basemaior = B.nextInt();

    System.out.println("     ");

    float area = altura*(basemenor + basemaior)/2; //Calculo da area


    System.out.println("A área total foi de: " + area); //Area total calculada
        b.close();
        B.close();
        h.close();
}
    
}

    
