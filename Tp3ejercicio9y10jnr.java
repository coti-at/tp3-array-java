
    package com.mycompany.tp2ejercicio9y10jnr;
    
    import java.util.Scanner;
public class Tp2ejercicio9y10jnr {

    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);

        System.out.println("------------------ejercicio 9--------------------");
            System.out.println("Ingrese los numeros deseados, separados por guion (-):");
            String cadena = x.nextLine();

        // metodo split
            String[] partes = cadena.split("-");

      
            int suma = 0;
                for (String parte : partes) {
                    suma += Integer.parseInt(parte);
                 }
        
            double promedio = (double) suma / partes.length;

        
            System.out.println("la suma total de los numeros ingresados es de: " + suma);
            System.out.println("el promedio total de los numeros ingresados es de: " + promedio);
        
        
            System.out.println("-----------------ejercicio 10----------------------");
        System.out.println("ingrese su numero de documento sin puntos ni espacios:");
            int DNI = x.nextInt();
        
                int letra = DNI % 23;
       
                String[] caracter = new String [23];
               //T R W A G M Y F P D X B N J Z S Q V H L C K E
                caracter[0]="T";
                caracter[1]="R";
                caracter[2]="W";
                caracter[3]="A";
                caracter[4]="G";
                caracter[5]="M";
                caracter[6]="Y";
                caracter[7]="F";
                caracter[8]="P";
                caracter[9]="D";
                caracter[10]="X";
                caracter[11]="B";
                caracter[12]="N";
                caracter[13]="J";
                caracter[14]="Z";
                caracter[15]="S";
                caracter[16]="Q";
                caracter[17]="V";
                caracter[18]="H";
                caracter[19]="L";
                caracter[20]="C";
                caracter[21]="K";
                caracter[22]="E";
                
        System.out.println("la letra de su dni es: " +caracter[letra]);
       
         }                           
      }                      