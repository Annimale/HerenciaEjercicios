/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;

/**
 *
 * @author ivamar
 */
import herencias.Multimedia.format;

public class Polimorfismo {

    public static void main(String[] args) throws Exception {
        ListaMultimedia multiLista = new ListaMultimedia(10);
        DISCO d1 = new DISCO("Rock", "Los pacos", "Paco", format.wav, "120");
        DISCO d2 = new DISCO("Rock", "Las pacas", "Paca", format.dvd, "130");
        DISCO d3 = new DISCO("Rock", "Les paces", "Pace", format.dvd, "130");
        multiLista.add(d1);
        multiLista.add(d2);
        multiLista.add(d3);

        Pelicula p1 = new Pelicula("Bob Esponja", "Manolo", format.wav, "20", "Patricio", "Arenita");
        Pelicula p2 = new Pelicula("Bab Esponja", "Manola", format.wav, "20", "Patricia", "Arenitaa");
        Pelicula p3 = new Pelicula("Beb Esponja", "Manole", format.wav, "20", "Patricie", "Arenita");
           Pelicula p4 = new Pelicula("Beb Esponja", "Manole", format.wav, "20", "Patricie", "");
        multiLista.add(p1);
        multiLista.add(p2);
        multiLista.add(p3);
        multiLista.add(p4);
        

//Visualizamos la lista completa
        System.out.println(multiLista.toString());
       
        
//Visualizamos el total de minutos que tiene la lista
        int total = 0;
        for (int i = 0; i < multiLista.size(); i++) {
            total += Integer.parseInt(multiLista.get(i).getDuracion());

        }
        System.out.println("Minutos totales de la lista:  " + total);
        //Cuantas peliculaes hay sin actriz
        int contadorSinActriz=0;
        for (int i = 0; i < multiLista.size(); i++) {
            if (multiLista.get(i) instanceof Pelicula) {
               if(((Pelicula)(multiLista.get(i))).getActrizPrincipal().equals("")){
                contadorSinActriz++;
            }
            
        }
    }
        System.out.println("Peliculas sin actriz: "+contadorSinActriz);
        
        //Cuantos discos hay de rock
         int contadorRock=0;
        for (int i = 0; i < multiLista.size(); i++) {
            if (multiLista.get(i) instanceof DISCO) {
               if(((DISCO)(multiLista.get(i))).getGenero().toLowerCase().equals("rock")){//
                contadorRock++;
            }
            
        }
    }
        System.out.println("Discos totales de genero Rock:  "+contadorRock);
}
}
