/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piedrapapeltijera;

import java.util.Random;
import java.util.Scanner;


public class Juego {
    
    /*
        Se crean las variables y se inicializan las
        que se consideran necesarias
    */
    private int jugadaPersona;
    private int jugadaCompu;
    int partida = 1;
    private int victoriasJugador = 0;
    private int victoriaComputador = 0;
    
    /*
        Estos son metodos de Java donde el primero es para guardar lo escrito por el teclado
        y el segundo para usar metodos que ayudan a generar numeros aleatorios
    */
    Scanner scan= new Scanner(System.in);
    Random ran = new Random();
    
    /*
        Este metodo se encarga de hacer la logica del juego y llamar funciones
        necesarias para el mismo.
    */
    public void jugar()
    {
       while(partida<4)
       {   
           System.out.println(" ");
           System.out.println("RONDA:"+partida);
           System.out.println(" ");
           System.out.println("Seleccione su jugada escribiendo un numero");
           System.out.println("0:Piedra\n"
                   + "1:Papel\n"
                   + "2:Tijera\n");
           int opcionJugador = scan.nextInt();
           imprimirJugadaEnLetras(opcionJugador, generarJuegoComputador());
           
           
           partida++;
       }
       buscarEImprimirGanadorFinal();
    }
    
    /*
      Esta funcion se encarga de retornar la opcion por el computador  
    */
    private int generarJuegoComputador()
    {
        int opcionComputador = ran.nextInt(3);
        return opcionComputador;
    }
    
    /*
        Esta funcion se encarga de mostrar cuales fueron las opciones seleccionadas
        por cada unos de los jugadores.
    */
    private void imprimirJugadaEnLetras(int opcionJugador, int opcionComputador)
    {
        if(opcionJugador == opcionComputador)
        {
            if(opcionJugador == 0)
            {
                System.out.println("=======================");
                System.out.println("Jugador persona: Piedra");
                System.out.println("Jugador Computador: Piedra");
                System.out.println("=======================");
                System.out.println("EMPATE");
            }
            else if(opcionJugador == 1)
            {
                System.out.println("=======================");
                System.out.println("Jugador persona: Papel");
                System.out.println("Jugador Computador: Papel");
                System.out.println("=======================");
                System.out.println("EMPATE");
            }
            else if(opcionJugador == 2)
            {
                System.out.println("=======================");
                System.out.println("Jugador persona: Tijera");
                System.out.println("Jugador Computador: Tijera");
                System.out.println("=======================");
                System.out.println("EMPATE");
            }
        }
        else
        {
            if(opcionJugador == 0 && opcionComputador == 2)
            {
                System.out.println("=======================");
                System.out.println("Jugador persona: Piedra");
                System.out.println("Jugador Computador: Tijera");
                System.out.println("=======================");
                victoriajugador();
                
            }
            else if(opcionJugador == 1 && opcionComputador == 0)
            {
                System.out.println("=======================");
                System.out.println("Jugador persona: Papel");
                System.out.println("Jugador Computador: Piedra");
                System.out.println("=======================");
                victoriajugador();
            }
            else if(opcionJugador == 2 && opcionComputador == 1)
            {
                System.out.println("=======================");
                System.out.println("Jugador persona: Tijera");
                System.out.println("Jugador Computador: Papel");
                System.out.println("=======================");
                victoriajugador();
            }
            else if(opcionComputador == 0 && opcionJugador == 2)
            {
                System.out.println("=======================");
                System.out.println("Jugador persona: Tijera");
                System.out.println("Jugador Computador: Piedra");
                System.out.println("=======================");
                victoriaComputador();
            }
            else if(opcionComputador == 1 && opcionJugador == 0)
            {
                System.out.println("=======================");
                System.out.println("Jugador persona: Piedra");
                System.out.println("Jugador Computador: Papel");
                System.out.println("=======================");
                victoriaComputador();
            }
            else if(opcionComputador == 2 && opcionJugador == 1)
            {
                System.out.println("=======================");
                System.out.println("Jugador persona: Papel");
                System.out.println("Jugador Computador: Tijera");
                System.out.println("=======================");
                victoriaComputador();
            }
        }
    }
    
    /*
        Este metodo se encarga de imprimir quien fue el ganador final de las 3 rondas
    */
    private void buscarEImprimirGanadorFinal()
    {
        if(this.victoriasJugador == this.victoriaComputador)
        {
            System.out.println("----------Empate-----------");
            System.out.println("Los dos jugadores sacaron la misma cantidad de aciertos");
        }
        else if(this.victoriasJugador > this.victoriaComputador)
        {
           System.out.println("----------Gnador-----------");
           System.out.println("Persona");
           System.out.println("Número de aciertos:"+this.victoriasJugador);
        }
        else if(this.victoriasJugador < this.victoriaComputador)
        {
           System.out.println("----------Gnador-----------");
           System.out.println("Computador");
           System.out.println("Número de aciertos:"+this.victoriaComputador);
        }
    }
    
    /*
        Estos dos metodos se encargan de almacenar en sus respectivas variables 
        las victorias que consigue cada uno de los participantes.
    */
    private void victoriajugador()
    {
      this.victoriasJugador = this.victoriasJugador +1;
    }
    
    private void victoriaComputador()
    {
       this.victoriaComputador = this.victoriaComputador +1; 
    }
        
        
}
