/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;

import herencias.Multimedia.format;


public class E3D_MAIN {
    public static void main(String[] args) {
        ListaMultimedia listamultimedia = new ListaMultimedia(10);
    
        try{
            Pelicula Batman = new Pelicula("Batman Begins", "Bruce Wayne",format.mp3,"124","Gerard Butler","Jennifer Lawrence");
            Pelicula Superman = new Pelicula("Superman Returns","Steven Spielberg",format.wav,"132","Richard Gere","Jennifer Anniston");
            Pelicula Torrente = new Pelicula("Torrente", "Santiago Segura", format.dvd,"96","Santiago Segura", "Neus Asensi");
            
            listamultimedia.add(Batman);
            listamultimedia.add(Superman);
            listamultimedia.add(Torrente);
        } catch(Exception x){
                System.out.println("Datos Incorrectos. ListaMultimedia no creada");
        }
        
        System.out.println(listamultimedia);
        
        
    }
}
