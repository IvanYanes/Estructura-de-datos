
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @Ivan Yanes
 */
public class Ejercicio4 {

    public static void main(String[] args) {
          Scanner entrada= new Scanner(System.in);
        
        int matriz [][] = new int [4][4];
        
        //Donde se ingresan los valores de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Cuales son los valores de la matriz?");
                matriz[i][j] = entrada.nextInt();
                if (matriz[i][j] <= 2){System.out.println("has elegido un numero menor que dos");
                } else  if (matriz[i][j] >= 10) {System.out.println("Has elegido un numero mayor a 10, bastante alto");
                } 
            } 
        }
             //Matriz triangular superior
               if ( matriz[1][0] == 0 && matriz[2][0] == 0 && matriz[2][1] == 0 ) 
                 {
               //Dependiendo de los numeros seleccionados si sale una matriz triangular superior aparecera en pantalla un mensaje confirmandolo
               System.out.println("Es una matriz triangular superior!");
        }      else {
               System.out.println("No es una matriz triangular superior :c");
        }
               //Resultado de la matriz
               for (int i = 0; i < matriz.length; i++){
                   for(int j = 0; j < matriz.length; j++){
                    System.out.print("["+matriz[i][j]+"]");
                   }
                   System.out.println("  ");
                   
                   //Fin del programa
      }
               System.out.println("---------Gracias por llegar hasta aqui!---------"); 
               System.out.println("------------------Un saludo!--------------------"); 
               System.out.println("------------------*_*_*_*_*_--------------------");
    }  
}
    
    

