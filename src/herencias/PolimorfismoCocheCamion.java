/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;

/**
 *
 * @author skril
 */
public class PolimorfismoCocheCamion {
    protected String matricula;
    protected int velocidad;
    

    
    

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public PolimorfismoCocheCamion() {
    }

    public PolimorfismoCocheCamion(String matricula) {//Constructor que se introduce matricula y velocidad seteada a 0
        this.matricula = matricula;
        this.velocidad = 0;
    }

    @Override
    public String toString() {
        return "PolimorfismoCocheCamion{" + "matricula=" + matricula + ", velocidad=" + velocidad + '}';
    }
    public void acelerar(int velocidad){
        this.velocidad+=velocidad;
    }

  
    
}
