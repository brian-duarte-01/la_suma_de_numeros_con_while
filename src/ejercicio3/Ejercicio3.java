//Ejercicio3
package ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

  
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int numero=1;
        int suma = 0;
        
        while(numero!=0){
            System.out.println("ingrese un numero ");
            numero=in.nextInt();
            suma=suma+numero;
           
            
        }
        System.out.println("la suma es:" +suma);
    }
    
}
