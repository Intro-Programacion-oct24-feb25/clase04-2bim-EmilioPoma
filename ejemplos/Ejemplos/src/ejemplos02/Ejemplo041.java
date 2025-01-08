/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {
    /*
    Dentro del main hay 3 arreglos bidimensionales de tipo entero, 2 de los 3 arreglos ya tienen datos 
    mientras que el tercero se encuentra vacio. Utilizamos un ciclo repetitivo de tipo for para darle valores al 
    tercer arreglo, llamamos a la funcion obtenerMultiplicacion y almacenamos sus valores en el arreglo 3. 
    Lo que hace obtenerMultiplicacion es multiplicar mediante un ciclo For los valores de los primeros 2 arreglos.
    Lo siguientte es llamar al proceidmiento obtener Reporte tres veces teniendo como parametros cada uno 
    de los arreglos. 
    */

    public static void main(String[] args) {
        // 
        
        int [][] arreglo1 = {{1,2,3}, {3,2,4}, {2,6,2}};
        int [][] arreglo2 = {{1,2,3}, {2,2,2}, {3,1,2}};
        int [][] arreglo3 = new int[3][3];
        
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                arreglo3[i][j] = obtenerMultiplicacion(arreglo1[i][j], 
                        arreglo2[i][j]);
            }
        }
        
        obtenerReporte(arreglo1);
        obtenerReporte(arreglo2);
        obtenerReporte(arreglo3);
    }
    
    public static void obtenerReporte(int[][] arreglo1){
        String cadena = "";
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, arreglo1[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }
    
    public static int obtenerMultiplicacion(int a, int b){
        int operacion;
        operacion = a * b;
        return operacion;
        
    }
    
    
}
