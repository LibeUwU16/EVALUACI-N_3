/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_indice_erroneo;

/**
 *
 * @author invitado
 */
public class EVA3_3_INDICE_ERRONEO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int datos[] = new int[10];
        datos[10] = 100; //ERROR EN TIEMPO DE EJECUCIÓN: el índice 10 no existe
        System.out.println("El valor en datos[10] = " + datos[10]);
        
    }
    
}
