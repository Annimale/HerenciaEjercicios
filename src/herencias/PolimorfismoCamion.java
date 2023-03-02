/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;

/**
 *
 * @author skril
 */
public class PolimorfismoCamion extends PolimorfismoCocheCamion{
    
    protected String remolque;

    public PolimorfismoCamion(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    public void ponRemolque(){
        this.remolque="Remolque puesto";
    }
     public void quitarRemolque(){
        this.remolque=null;
    }

    @Override
    public String toString() {
        return super.toString()+"PolimorfismoCamion{" + "remolque=" + remolque + '}';//Metemos el super despues del return para cuando hagamos un toString de camion nos de la informacion tambine de la matricula y de la velocidad
    }
    
    
}
