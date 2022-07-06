package Pagina27;
public class valorverdadeiro { //icaro de oliveira 3-52
// a. (1 > 2) // exemplo: false
//b. (8 == 8) // exemplo: true
//c. ((12 – 5) > 6)
//d. (0 < 3) && (8 < 9)
//e. ((i++) > i) Unário ++ Incrementa o valor da variável em uma unidade. Exemplo: i++; contador++;
//f. ((10 * 90 / 50 – 2) == 16
   public static void main(String[] args) {
       
//Apenas o System.out.println Retorna um valor boolean - True / False mais rapido e pratico
//If faz um devio condicional semelhante apenas mais completo para se fazer podendo botar variações de resposta ou mais condições

System.out.println("Primeira verificação 1 > 2 ");
System.out.println(1 > 2); 
 if (1 > 2) {
     System.out.print("Verdadeiro");
 } else {
    System.out.println("Falso");  
 }
 System.out.println("      ");

 System.out.println("Segunda verificação 8 = 8");
 System.out.println(8 == 8);
 if (8==8) {
    System.out.println("Verdadeiro");
} else {
   System.out.println("Falso");  
       } 
   System.out.println("      ");

   System.out.println("Terceira verificação 12 - 5 > 6");
   System.out.println(12-5>6);
   if ((12 - 5) > 6 ) {
    System.out.println("Verdadeiro");
} else {
   System.out.println("Falso");  
}
System.out.println("      ");

System.out.println("Quarta verificação 0 < 3 e 8 < 9 ");
System.out.println(0<3 && 8 < 9);
if ((0 < 3 ) && ( 8 < 9 )) {
    System.out.println("Verdadeiro");
} else {
   System.out.println("Falso");;
}
System.out.println("      ");

int i = 9; //atribui um valor a "i" 
System.out.println("Quinta Verificação I++ > i // i = 9 ");
System.out.println(i++ > i);
if ( i++ > i){
System.out.println("Verdadeiro");
} else {
   System.out.println("Falso");;
}
System.out.println("      ");
   
System.out.println("Sexta e ultima verificação 10 * 90 / 50 - 2 = 16");
System.out.println(10 * 90 / 50 - 2 == 16);
 if ((10 * 90 / 50 - 2) == 16) {
    System.out.println("Verdadeiro");
} else {
   System.out.println("Falso");
}

}
}