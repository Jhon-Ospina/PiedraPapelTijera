    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera;

/**
 *
 * @
 */
public class PiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        /*
            se realiza la instancia de los dos objetos que contendran
            las funciones del juego 
        */
        Persona Per = new Persona();
        Juego Jueg = new Juego();
        
        //se llama la funcion encargada de obtener lso datos del jugador
        Per.obtenerDatos();
        System.out.println("Jugador");
        System.out.println(Per.mostrarDatosPersona());
        //se llama la funcion que incia el juego
        Jueg.jugar();
        
    }
    
}
