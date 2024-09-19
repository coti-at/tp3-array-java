 import java.util.Scanner;

public class Tp2ejercicio12 {

    public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
        
    int[] numeros = new int[10];

        
        System.out.println("Ingrese 10 números:");
         for (int i = 0; i<numeros.length; i++){
             numeros[i]=x.nextInt();
         }
           
        System.out.print("Array ingresado: ");
        for (int i=0; i<numeros.length; i++){
                System.out.print(numeros[i] + " ");
        }

        System.out.println("Ingrese el número que desea eliminar:");
        int numeroAEliminar = x.nextInt();

        int contador = 0;
        for (var numero : numeros) {
            if (numero == numeroAEliminar) {
                contador++;
            }
        }

        //copia elemento diferente al elemento a eliminar para rellenar denuevo la lista
        int[] nuevoArray = new int[numeros.length - contador];
        int indice = 0;
        for (int numero : numeros) {
            if (numero != numeroAEliminar) {
                nuevoArray[indice++] = numero;
            }
        }

        
        System.out.print("Nuevo array sin el número " + numeroAEliminar + ": ");
        for (int i = 0; i<nuevoArray.length; i++ ){
                System.out.print(nuevoArray[i] +" ");
        }
    }

   
}

        
    

        
        
        
        
    

