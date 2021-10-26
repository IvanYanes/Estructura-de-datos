
package ejercicio.pkg2;
    import java.util.Scanner;

/**
 *
 * @Ivan Yanes
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
     int Matriz[][],x,y;
            
            //El usuario ingresa las dimensiones que tendra la matriz
            System.out.println("Filas de la matriz?");
            x = entrada.nextInt();
            if(x >=10){
                System.out.println("No deberias usar un numero tan alto");
            } else {System.out.println("continùe"); //Mesnaje a traves de condicional
            }
            
            System.out.println("Columnas de la matriz?");
            y = entrada.nextInt();
            if(y >=10){
                System.out.println("No deberias usar un numero tan alto");
            } else {System.out.println("continue");//Mensaje a traves de condicional
            }
            
            Matriz = new int [x][y];
            
            //Numeros en la Matriz por parte del usuario
            System.out.println("Que datos quiere colocar?");
            for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
              System.out.print("["+i+"]["+j+"]:");
                Matriz[i][j] = entrada.nextInt();
                if (Matriz[i][j] >= 10) {
                    System.out.println("El numero es muy alto, elija uno mas bajo");
                    break;
                }
            }    
            }
            //Matriz dada por el usuario
            System.out.println("La matriz es: ");
            for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print("["+Matriz[i][j]+"]");
            }
                System.out.println("");
            }
            for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
              Matriz[i][j] = (int) (23 * Math.pow(i, 4) + 20 * Math.pow(j, 3) - 3);
                }
            }
            System.out.println("*******************************");
            System.out.println("*L funcion es: 23*X^4+20*Y^3-3*");
            System.out.println("*******************************");
            System.out.println("El resultados: ");
            //Impresion del resultado
            for (int i = 0; i < Matriz.length; i++){
                for (int j = 0; j < Matriz.length; j++){
                    System.out.println("x: " + i + " y: " + j + "Resultado");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(23 * Math.pow(i, 4) + 20 * Math.pow(j, 3) - 3);
              
                }
            }
            //Final del proceso
             System.out.println("Fin del proceso");
                    System.out.println("¡Gracias!");
        }
    }
    

