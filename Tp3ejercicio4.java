import java.util.Scanner;
public class Tp2ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ejercicio 4
       float[] numerosDecimales = new float[20];
       
                for (int i =0; i<numerosDecimales.length; i++){
                    System.out.println( i + ") ingrese un numero decimal:");
                    numerosDecimales[i]= sc.nextFloat();
                }
     
       float menor = numerosDecimales[0];
       float mayor = numerosDecimales[0];
            //inicio for 
            for (int i = 0; i< numerosDecimales.length; i++){
     
                    if (numerosDecimales [i] > mayor){
                          mayor = numerosDecimales[i];
                    }
           
                    if (numerosDecimales[i] < menor ){
                            menor= numerosDecimales[i];
                    }
            }//fin for 
            
        System.out.println("--------------------------------------");    
        System.out.println("el mayor numero ingresado fue: " + mayor);  
        System.out.println("el menor numero ingresado fue: " + menor);
        float rango = mayor- menor;
        System.out.println("el rango de los numeros ingresados es de: " + rango);

    }
}
