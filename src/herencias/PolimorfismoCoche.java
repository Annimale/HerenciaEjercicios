/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;

/**
 *
 * @author skril
 */
public class PolimorfismoCoche extends PolimorfismoCocheCamion {
    protected int numPuertas;

    public PolimorfismoCoche(int numPuertas, String matricula) {
        super(matricula);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void devolverPuertas(PolimorfismoCoche coche){
        System.out.println("Este coche tiene "+coche.getNumPuertas()+" puertas");
    }

    @Override
    public String toString () {
        return super.toString() + "PolimorfismoCoche{" + "numPuertas=" + numPuertas + '}';
    }
    
}
