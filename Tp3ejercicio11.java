import java.util.Scanner;
public class Tp2ejercicio11 {

    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        int[] arregloUno = new int [5];
        int[] arregloDos = new int [10];
        
        
        System.out.println("rellene el primer arreglo con 5 numeros");
        for (int i = 0; i<arregloUno.length; i++){
            System.out.println("posicion " + i);
            arregloUno[i]=x.nextInt();
        }
        
        
        System.out.println("rellene el segundo arreglo con 10 numeros");
        for (int i = 0; i<arregloDos.length; i++){
            System.out.println("posicion " + i );
            arregloDos[i]=x.nextInt();
        }
        
        int[] arregloTres = new int[5];    
        int sumaNumeros =0;
            
        for (int i = 0; i<arregloTres.length; i++){
                arregloTres[i]=arregloUno[i]* arregloDos[i];   
                    for (int j = 0 ; j< arregloTres.length; j++){
                            sumaNumeros = sumaNumeros+ arregloTres[i];
                        }
            }
        System.out.println("---------------------------");
        System.out.println("arreglo uno:");
        for (int i= 0; i<arregloUno.length; i++){
            System.out.print(arregloUno[i]);
        }
        System.out.println("--------------------");
        System.out.println("arreglo dos");
        for (int i= 0; i<arregloDos.length; i++){
            System.out.print(arregloDos[i]);
        }
        System.out.println("-------------------------");
        System.out.println("arreglo tres");
        for (int i= 0; i<arregloTres.length; i++){
            System.out.print(arregloTres[i]);
        }

    }
}
