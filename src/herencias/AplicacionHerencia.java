/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;

import herencias.Multimedia.format;
import java.util.Scanner;

public class AplicacionHerencia {

    public static void main(String[] args) throws Exception{
        ListaMultimedia listamultimedia = new ListaMultimedia(10);

        Scanner tcl = new Scanner(System.in);

        int seleccionar;
        // wav, mp3, midi, avi, mov, mpg, cdAudio, dvd

        System.out.println("BIENVENIDO AL VIDEOCLUB PARIS DE VALENCIA: seleccione si quiere registrar una pelicula o disco");
        System.out.println("1. PELICULA");
        System.out.println("2. DISCO");
        System.out.println("3. SALIR");
        System.out.println("································");
        seleccionar = tcl.nextInt();

        switch (seleccionar) {
            case 1:
                String titulo = "";
                String autor = "";
                String duracion = "";
                String actorPrincipal = "";
                String actrizPrincipal = "";
                format formato = null;

                System.out.println("----\nHA SELECCIONADO PELICULA\n-----");

                System.out.println("Introduzca su titulo: ");
                titulo = tcl.nextLine();
                System.out.println("Introduzca su autor:  ");
                autor = tcl.nextLine();
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
                int selecFormato = tcl.nextInt();
                switch (selecFormato) {
                    case 1:
                        formato = format.wav;
                    case 2:
                        formato = format.mp3;
                    case 3:
                        formato = format.midi;
                    case 4:
                        formato = format.avi;
                    case 5:
                        formato = format.mov;
                    case 6:
                        formato = format.mpg;
                    case 7:
                        formato = format.cdAudio;
                    case 8:
                        formato = format.dvd;
                }
                Pelicula p1= new Pelicula (titulo, autor, formato, duracion, actorPrincipal, actrizPrincipal);
                break;
            case 2:
                String genero = "";
                String tituloDisco = "";
                String autorDisco = "";
                String duracionDisco = "";
                format formatoDisco = null;

                
                
                System.out.println("-----\nHA SELECCIONADO DISCO\n-----");
                
                 System.out.println("Introduzca su genero: ");
                genero = tcl.nextLine();
                System.out.println("Introduzca el titulo del disco:  ");
               tituloDisco = tcl.nextLine();
                System.out.println("Introduzca el autor del disco");
                autorDisco=tcl.nextLine();
                System.out.println("Introduzca la duracion del disco");
                duracionDisco=tcl.nextLine();
                
                
                System.out.println("Escoja su formato");
                System.out.println("1. WAV");
                System.out.println("2. MP3");
                System.out.println("3. MIDI");
                System.out.println("4. AVI");
                System.out.println("5. MOV");
                System.out.println("6. MPG");
                System.out.println("7. CD AUDIO");
                System.out.println("8. DVD");
                int selecFormato2 = tcl.nextInt();
                switch (selecFormato2) {
                    case 1:
                        formato = format.wav;
                    case 2:
                        formato = format.mp3;
                    case 3:
                        formato = format.midi;
                    case 4:
                        formato = format.avi;
                    case 5:
                        formato = format.mov;
                    case 6:
                        formato = format.mpg;
                    case 7:
                        formato = format.cdAudio;
                    case 8:
                        formato = format.dvd;
                        break;
                }
                Disco d1= new Disco()
            case 3:
                System.out.println("-----\nUSTED HA SALIDO\n-----");
                break;

        }
        System.out.println("Has cerrado el programa");
    }
}
