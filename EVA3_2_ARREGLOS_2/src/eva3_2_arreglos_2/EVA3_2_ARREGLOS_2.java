/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_arreglos_2;

/**
 *
 * @author invitado
 */
public class EVA3_2_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int datos[] = new int[100000000];
        
        for (int i = 0; i < datos.length; i++) {
            datos[i] =(int) (Math.random() * 100);
            
        }
   for (int i = 0; i < 10; i++){
         System.out.print("[" + datos[i] + "]");
        }
}
}
    
    

