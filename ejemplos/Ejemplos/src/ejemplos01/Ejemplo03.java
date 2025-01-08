/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        // 
         Scanner entrada = new Scanner(System.in);
        int valor1;
        int valor2;
        System.out.println("Ingrese el primer valor:");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese el segundo valor:");
        valor2= entrada.nextInt();
        int valor = obtenerSuma(valor1, valor2); // se invoca al método 
                                         // obtenerSuma
        System.out.printf("El valor de la suma es: %d\n", valor);
        
        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }
    
    
    public static int obtenerSuma(int a, int b){
        int suma;
        suma = a + b;
        return suma;
        // return a + b;
    }
    
    
}
