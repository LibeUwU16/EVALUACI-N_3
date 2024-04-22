/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_arreglos;

/**
 *
 * @author invitado
 */
public class EVA3_1_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LOS ARREGLOS EN JAVA SON OBJETOS.
        // LOS CREAMOS ANTES DE USARLOS.
        // [] -->> manejar los índices.
        // declaración = creación (new)
        int arreglo[] = new int[10]; //UN ARREGLO DE 10 ENTEROS
        //a tráves de ídices:
        // conocer las pocisiones de los valores:
        // PRIMERA POCISIÓN DE UN ARREGLO ES 0
        // ULTIMA POSICIÓN DE UN ARREGLO ES N - 1, donde
        // N ES EL TAMAÑO DEL ARREGLO 
        arreglo[1] = 100;
        System.out.println("Valor del arreglo[1] = " + arreglo[1]);
        System.out.println(arreglo);
        System.out.println(arreglo.length);
    }
    
}
