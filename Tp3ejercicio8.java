import java.util.Scanner;
public class Tp2ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int[] arregloUno = new int [10];
    //arreglo original
         for (int i = 0; i< arregloUno.length; i++){
                System.out.println(i + ")ingrese un numero para el arreglo: ");
                 arregloUno[i]= sc.nextInt();
         }
        System.out.println("arreglo original");
       
         for (int i = 0; i< arregloUno.length; i++){
                System.out.print("[" + arregloUno[i] + "]" );
        }
         
        System.out.println("-------------------");
     
        
        //copio arreglo original a arreglo ascendente
    int[] arregloAscendente = new int [10];
        System.arraycopy(arregloUno, 0, arregloAscendente, 0, arregloAscendente.length);
        
            for(int i = 0; i<arregloAscendente.length; i++){
                for(int j = 0; j<arregloAscendente.length -1; j++){
         
                         if (arregloAscendente[j]> arregloAscendente[j+1]){
                            int aux;
                            aux = arregloAscendente[j];
                            arregloAscendente[j] = arregloAscendente[j+1];
                            arregloAscendente[j+1] = aux;           
                        }
                }
            }   
        System.out.println("arreglo ordenado de forma ascendente");
                for ( int i = 0; i< arregloAscendente.length; i++){
                        System.out.print("[" + arregloAscendente[i] + "]");
                }    
        System.out.println("--------------------------------------"); 
        
        
       //copio arreglo original a arreglo descendente
        
    int[] arregloDescendente = new int[10];
        System.arraycopy(arregloUno, 0, arregloDescendente, 0, arregloDescendente.length);
        
            for(int i = 0; i<arregloDescendente.length; i++){
                for(int j = 0; j<arregloDescendente.length -1; j++){
         
                        if (arregloDescendente[j]< arregloDescendente[j+1]){
                                int aux;
                                aux = arregloDescendente[j];
                                arregloDescendente[j] = arregloDescendente[j+1];
                                arregloDescendente[j+1] = aux;           
                        }          
                }
            }   
            System.out.println("arreglo ordenado de forma descendente");
                    for ( int i = 0; i< arregloDescendente.length; i++){
                            System.out.print("[" + arregloDescendente[i] + "]");
                    }    
            System.out.println("--------------------------------------"); 
    
    }
}
