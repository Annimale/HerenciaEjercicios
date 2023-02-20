/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;

import herencias.Multimedia.format;
import java.util.Scanner;

public class AplicacionHerencia {

    public static void main(String[] args) {
        ListaMultimedia listamultimedia = new ListaMultimedia(10);

        Scanner tcl = new Scanner(System.in);

        int seleccionar;
        // wav, mp3, midi, avi, mov, mpg, cdAudio, dvd
        do {
            System.out.println("BIENVENIDO AL VIDEOCLUB PARIS DE VALENCIA: seleccione si quiere registrar una pelicula o disco");
            System.out.println("1. PELICULA");
            System.out.println("2. DISCO");
            System.out.println("3. SALIR");
            System.out.println("································");
            seleccionar = tcl.nextInt();

            switch (seleccionar) {
                case 1:
                    String titulo="";
                    String autor="";
                    String duracion="";
                    String actorPrincipal="";
                    String actrizPrincipal="";
                    format formato=null;
                    
                    System.out.println("----\nHA SELECCIONADO PELICULA\n-----");
                    
                        System.out.println("Introduzca su titulo: ");
                        titulo=tcl.nextLine();
                        System.out.println("Introduzca su autor:  ");
                        autor=tcl.nextLine();
                        System.out.println("Introduzca la duracion");
                        
                        System.out.println("Escoja su formato");
                        System.out.println("1. WAV");
                        System.out.println("2. MP3");
                        System.out.println("3. MIDI");
                        System.out.println("4. AVI");
                        System.out.println("5. MOV");
                        System.out.println("6. MPG");
                        System.out.println("7. CD AUDIO");
                        System.out.println("8. DVD");
                        int selecFormato=tcl.nextInt();
                        switch(selecFormato) {
                            case 1:
                                formato= format.wav;
                            case 2:
                                formato=format.mp3;
                            case 3:
                                formato=format.mp3;
                            case 4:
                                formato=format.mp3;
                            case 5:
                                formato=format.mp3;
                            case 6:
                                formato=format.mp3;
                            case 7:
                                formato=format.mp3;
                            case 8:
                                
                                
                                
                                
                            
                        }
                        Pelicula(titulo,autor,formato,duracion,actorPrincipal,actrizPrincipal);
                    break;
                case 2:
                    System.out.println("-----\nHA SELECCIONADO DISCO\n-----");
                    break;
                case 3:
                    System.out.println("-----\nUSTED HA SALIDO\n-----");
                    break;

            }
        } while (seleccionar != 0);
        System.out.println("Has cerrado el programa");

    }
}
