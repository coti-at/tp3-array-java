import java.util.Random;
import java.util.Scanner;
public class Tp2ejercicio6 {

    public static void main(String[] args) {
        Random numerosAleatorios = new Random();
        Scanner sc = new Scanner(System.in);
       //creo arreglo y lo relleno
        int[] arregloAleatorio = new int [50];
            for (int i =0; i<arregloAleatorio.length; i++){
                arregloAleatorio[i]=numerosAleatorios.nextInt(100)+1;
                System.out.println(i +1 + ")" + arregloAleatorio[i]);
       }
       System.out.println("---------------------------------------");
       //ingreso de numero para iniciar la busqueda aritmetica
        System.out.println("ingrese el numero que desea reastrear en el array:");
        int nro = sc.nextInt();
       //inicio de busqueda aritmetica
       for (int i = 0; i<arregloAleatorio.length; i++){
           
           if (nro == arregloAleatorio[i]){
               System.out.println("el numero se encontro en la posicion: " + i);
               break;   
           }else {
               System.out.println("el numero no se encontro");
               break;
           }
               
       }
        
    }
}
