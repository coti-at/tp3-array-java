import java.util.Scanner;
public class Tp2ejercicio7 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
      
       int[] nrosIngresados = new int[20];
       
       for (int i = 0; i< nrosIngresados.length; i++){
           System.out.println("ingrese un numero entero para la posicion " + i + " del arreglo");
           nrosIngresados[i] =sc.nextInt();   
       }
     int numerosPares=0;
     int numerosImpares=0;
     
     for ( int i = 0; i< nrosIngresados.length; i++){
         
         if (nrosIngresados[i] % 2 == 0){   
            numerosPares = numerosPares + nrosIngresados[i];
         }  else {
                numerosImpares=numerosImpares+nrosIngresados[i];
            }
    
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("la suma de los numeros pares ingresados en el array es de: " + numerosPares);
        System.out.println("la suma de los numeros impares ingresados en el array es de: " + numerosImpares);
    }
}
