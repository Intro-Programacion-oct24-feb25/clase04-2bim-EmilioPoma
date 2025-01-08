 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;
import java.util.Scanner;



/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        String mensaje = "";
         int valor1;
        int valor2;
        String opcion;
        System.out.println("Ingrese el valor para el limite de la tabla:");
        valor1 = entrada.nextInt();
        
        System.out.println("Ingrese el valor de la tabla:");
        valor2= entrada.nextInt();
        
        System.out.println("Ingrese el proceso a realizar: Suma (1) o Multiplicacion (2)");
        entrada.nextLine();
        opcion = entrada.nextLine();
        
        switch (opcion){
            case ("1"):
                mensaje = obtenerTablaSumar(valor1, valor2);
            case ("2"):
                mensaje = obtenerTablaMultiplicar (valor1, valor2);
            
        }
        
        System.out.printf("%s\n", mensaje);
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
