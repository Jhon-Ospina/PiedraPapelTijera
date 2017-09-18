/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera;

import java.util.Scanner;


public class Persona {
    
    /*
        Se crean las variables y se inicializan las
        que se consideran necesarias
    */
    String alias = "";
    String correo = "";
    Scanner scan= new Scanner(System.in);
    
    /*
        Esta funcion se encarga de obgtener los datos del jugador
    */
    public void obtenerDatos()
    {
        System.out.println("Por favor escriba su alias");
        establecerAlias(scan.next());
        
        System.out.println("Por favor escriba su correo");
        establecerCorreo(scan.next());
    }
    
    /*
        Esta funcion se encarga de retornar los datos que se recibieron
    */
    public String mostrarDatosPersona()
    {
        return this.obtenerAlias()+"-"+this.obtenerCorreo();
    }
    
    /*
        estas funciones se encargan de almacenar los datos del jugador
        y tambien ayudan a tener acceso a los valores que se le dieron 
    */
    private void establecerAlias(String alias)
    { 
        this.alias = alias;
    }
    
    private void establecerCorreo(String correo)
    {
        this.correo = correo;
    }
    
    private String obtenerAlias()
    {
        return alias;
    }
    
    private String obtenerCorreo()
    {
        return correo;
    }
}
