/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_.pkgfor.each;

/**
 *
 * @author invitado
 */
public class EVA3_10_ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String díasSemana[] = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        
        for (String día : díasSemana) {
            System.out.println(día);
        }
        
        int salario[] = {1400, 4000, 3000, 1200, 900, 2000};
        for (int cant: salario)
                System.out.println("$" + cant);
    

    String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junip", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        for (String mes : meses){
            System.out.println(mes);
        }
  }
}

