
import java.util.Scanner;

public class Tp3java {
 
     //inicio codigo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el ejercicio a revisar:");
      int numeroEjercicio =sc.nextInt();
      
      switch (numeroEjercicio){
      
          case 2 -> {
              //ejercicio2
              int[] arregloUno = new int[5];
              arregloUno[0] = 5;
              arregloUno[1] = 10;
              arregloUno[2] = 15;
              arregloUno[3] = 20;
              arregloUno[4] = 25;
              for ( int i =0; i<arregloUno.length; i++){
                  System.out.println(arregloUno[i]);
              }
            }
            case 3 -> {
                //ejercicio3
                
                int tamanoArreglo;
                System.out.println("indique el tamaño del arreglo:");
                tamanoArreglo=sc.nextInt();
                int[] arregloDos = new int [tamanoArreglo];
                System.out.println("dime un numero:");
                int nro = sc.nextInt();
                int resultado;
                System.out.println("--------------------");
                    for (int i = 1; i< arregloDos.length;i++){
                        resultado = nro*i;
                        arregloDos[i]=resultado;
                        System.out.println(arregloDos[i]);
                    }
                break;
                 }
            default ->{
                break;
            }
            }
            
                }
                   
    }         

      
               

