import java.util.Random;
public class Tp2ejercicio5 {

    public static void main(String[] args) {
        Random numerosAleatorios = new Random();
       int[] numerosEnteros = new int [20];
       for (int i =0; i<numerosEnteros.length; i++){
           numerosEnteros[i]=numerosAleatorios.nextInt(100)+1;
           System.out.println(i +1 + ")" + numerosEnteros[i]);
       }
        System.out.println("---------------------------------------");
    //promedio Aritmetico      
     int sumaArreglo =0;
     int promedioAritmetico;
            for (int i= 0; i<numerosEnteros.length; i++){
                sumaArreglo= sumaArreglo+ numerosEnteros[i];  
            }
    promedioAritmetico= sumaArreglo / 20;
        System.out.println("el promedio aritmetico del arreglo es: " + promedioAritmetico);
        System.out.println("------------------------------------------------");    
      int numerosIguales=0;
      int numerosMayores=0;
      int numerosMenores=0;
    for (int i= 0; i<numerosEnteros.length; i++){
     
         if (numerosEnteros[i] == promedioAritmetico){
             numerosIguales= numerosIguales+1;
         }
         if (numerosEnteros[i] < promedioAritmetico){
             numerosMenores= numerosMenores+1;
         }
         if (numerosEnteros[i] > promedioAritmetico){
             numerosMayores= numerosMayores+1;
         }
        
     }   
        System.out.println("Numeros iguales al promedio aritmetico: " + numerosIguales);  
        System.out.println("Numeros menores al promedio aritmetico: " + numerosMenores);
        System.out.println("Numeros mayores al promedio aritmetico: " + numerosMayores);
    }
    
}
