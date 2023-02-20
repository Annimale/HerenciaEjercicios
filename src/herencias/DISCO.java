/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;

/**
 *
 * @author ivamar
 */
public class DISCO extends Multimedia{
    
    private String genero;

    public DISCO(String genero, String titulo, String autor, format formato, String duracion) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "DISCO{" + "genero=" + genero + '}';
    }
    
    
}
