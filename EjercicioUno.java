
package ejerciciouno;
import java.util.Scanner;

/**
 * Universidad de Margarita
 * @Ivan Yanes C.I- 28043565
 * 
 */
public class EjercicioUno {

    /**
     * Ejercicio numero 1
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int dimensiones_Matriz_uno = 0, dimensiones_Matriz_dos = 0,dimensiones_Matriz_tres = 0, dimensiones_Matriz_Resultante= 0;
       
       //Declaracion de las filas y las columnas, use una variable por cada matriz para cada las filas y las columnas por simplicidad//
       System.out.println("Elija siempre el mismo numero, de lo contrario tronara");
       System.out.println("******************************************************");
       System.out.println("");
       
       System.out.println("Â¿Cual va a ser la dimension de las filas y columnas en la primera Matriz?");
       dimensiones_Matriz_uno = in.nextInt();
       System.out.println("Â¿Cual va a ser la dimension de las filas y columnas en la segunda Matriz?");
       dimensiones_Matriz_dos = in.nextInt();
       System.out.println("Â¿Cual va a ser la dimension de las filas y columnas en la tercera Matriz?");
       dimensiones_Matriz_dos = in.nextInt();
       System.out.println("Â¿Cual va a ser la dimension de las filas y columnas en la resultante?");
       dimensiones_Matriz_Resultante = in.nextInt();
       
       
       //Declaracion de las matrices
       int M_1 [][] = new int [dimensiones_Matriz_uno][dimensiones_Matriz_uno];
       int M_2 [][] = new int [dimensiones_Matriz_dos][dimensiones_Matriz_dos];
       int M_3 [][] = new int [dimensiones_Matriz_tres][dimensiones_Matriz_tres]; 
       int M_Resultante [][] = new int [dimensiones_Matriz_Resultante][dimensiones_Matriz_Resultante];
       int M_Final [][] = new int [1][1];
       
       // llenado de la primera matriz
        for (int j = 0; j < M_1.length ; j++) {
            for (int i = 0; i < M_1.length   ; i++){
                M_1 [j][i] = (int) (Math.random() * 6);
            } 
                   
        }
        //Llenado de la segunda Matriz//
        for (int j = 0; j < M_2.length ; j++) {
            for (int i = 0; i < M_2.length ; i++){
                M_2 [j][i] = (int) (Math.random() * 6);
            }
        }
        //Llenado de la tercera Matriz//
        for (int j = 0; j < M_3.length; j++) {
            for (int i = 0; i < M_3.length; i++){
                M_3 [j][i] = (int) (Math.random() * 6);
            }
        }
        //Suma//
        for (int j = 0; j <  M_1.length ; j++) {
            for (int i = 0; i < M_2.length ; i++){ 
                  M_Resultante [j][i] = M_1[j][i]+M_2[j][i];
              
        }
            } 
        //Multiplicacion con el reultado final//
       
        for (int j = 0; j <  M_Resultante.length ; j++) {
            for (int i = 0; i < M_3.length ; i++){ 
                  M_Final [j][i] = M_Resultante[j][i]+M_3[j][i];
              
        }
            } 
        //Impresion de la matriz//
        
        for (int j = 0; j < M_1.length ; j++){       //Impresion de la matriz 1//
                   for (int i = 0; i < M_1.length ; i++){
                      System.out.print("[" + M_1[j][i] + "]");
                }
                   System.out.println("");
                   } 
                   System.out.println("     +");
                   
       for (int j = 0; j < M_2.length ; j++){        //Impresion de la matriz 2//
                   for (int i = 0; i < M_2.length ; i++){
                      System.out.print("[" + M_2[j][i] + "]");
                }
                   System.out.println("");
                   } 
                   System.out.println("     =");
                   
               for (int j = 0; j < M_Resultante.length ; j++){    //Impresion de la matriz resultante//
                   for (int i = 0; i < M_Resultante.length ; i++){
                      System.out.print("[" + M_Resultante[j][i] + "]");
                }
                   System.out.println("");
                   }    
              
                }    
    
     }       
    