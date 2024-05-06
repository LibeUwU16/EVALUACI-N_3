/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_12_metodos;

/**
 *
 * @author invitado
 */
public class EVA3_12_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarMensaje("Huevito :D");
        mostrarMuchosMsj("Odi", 22);
        
    }
    public static void mostrarMensaje(String Huevito){ //Encabezado (Nombre del método)
        System.out.println(Huevito);
    }
    public static void mostrarMuchosMsj(String msj, int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println(msj);
        }
    }
}
