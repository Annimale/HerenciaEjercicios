/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;


public class ListaMultimedia {
    private Multimedia[] lista;
    private int total = 0;

    public ListaMultimedia(int x) {
        lista = new Multimedia[x];
    }
    
    public int size(){
        return total;
    }
    
    public boolean add (Multimedia x){
        if (total < lista.length) {
            lista[total] = x;
            total++;
            return true;
        } else{
            return false;
        }
    }
    
    public Multimedia get(int posicion){
        return lista[posicion];
    }
    
    public int indexOf(Multimedia m){
        for (int i = 0; i < total; i++) {
            if (lista[i].equals(m)) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public String toString(){
        String resultado = "";
        
        for (int i = 0; i < this.size(); i++) {
            resultado = resultado + "\nMultimedia [" + i + "]: \n "+this.get(i).toString()+"\n";
        }
        return resultado;
    }
}
