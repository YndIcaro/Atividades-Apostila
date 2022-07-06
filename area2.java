package Pagina27;
    import java.util.Scanner;
    public class area2 {/*icaro de oliveira 3-52
        h = altura
        b = base menor
        B = base maior
        Área = (h . (b + B)) / 2;*/
public static void main(String[]args){
    
    System.out.printf("Digite o valor da altura: ");
     Scanner h = new Scanner(System.in); // Valor a ser recebido
     float altura = h.nextFloat();
    
     System.out.println("     "); //Um espaço 
    
    System.out.printf("Digite o valor da base menor: ");
     Scanner b = new Scanner(System.in); // Valor a ser recebido 
     float basemenor = b.nextFloat();
    
     System.out.println("     ");
    
    System.out.printf("Digite o valor da base maior: ");
     Scanner B = new Scanner(System.in); // Valor a ser recebido
     float basemaior = B.nextFloat();
    
     System.out.println("     ");
     float area = altura*(basemenor + basemaior)/2; //Calculo
    
    System.out.println("A área total foi de: " + area); //Area total calculada

    System.out.println("O valor arredondado da área foi de: " +Math.round(area)); //Area arredondada 
        b.close();
        B.close();
        h.close();
} 
}

