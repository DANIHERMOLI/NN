 import java.util.Scanner;
 /**
 * Este programa esta diseñado para recibir numeros y saber su escritura en inglés
 * 
 * @author (Grupo) 
 * @version (1.0)
 */
  public class Proyecto
 {
  
        public static void main(String[] args)
    
     {
        Scanner teclado = new Scanner(System.in);
        int ingl;
        System.out.print("Ingrese el numero que quiere traducir");
        ingl= teclado.nextInt();
        
        
        int ing []= {0,1,2,3,4,5,6,7,8,9};//new int[10];
        
        for (int i=0;i<ing.length;i++)
         {
        if (ing [i]==0)
          {
                System.out.println("zero");
    
          }
         else if(ing [i]==1)
          {
                System.out.println("one");
    
          }
          else if(ing [i]==2)
          {
                System.out.println("two");
    
          }
          else if(ing [i]==3)
          {
                System.out.println("three");
    
          }
          else if(ing [i]==4)
          {
                System.out.println("four");
    
          }
          else if(ing [i]==5)
          {
                System.out.println("five");
    
          }
          else if(ing [i]==6)
          {
                System.out.println("six");
    
          }
          else if(ing [i]==7)
          {
                System.out.println("seven");
    
          }
          else if(ing [i]==8)
          {
                System.out.println("eigth");
    
          }
          else if(ing [i]==9)
          {
                System.out.println("nine");
    
          }
          
        
         System.out.println("Traducción al numero:"+ing[i]);
        
        }
    }
}
