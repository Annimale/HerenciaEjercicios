/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;

import java.util.Scanner;

/**
 *
 * @author skril
 */
public class PolimorfismoCamion extends PolimorfismoCocheCamion {

    static Scanner tcl = new Scanner(System.in);
    protected Remolque remolque;

    public PolimorfismoCamion(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitarRemolque() {
        this.remolque = null;
    }

    @Override
    public String toString() {
        return super.toString() + "PolimorfismoCamion{" + "remolque=" + remolque + '}';//Metemos el super despues del return para cuando hagamos un toString de camion nos de la informacion tambine de la matricula y de la velocidad
    }

    public void acelerarCamion() throws DemasiadoRapidoException {
        int velo;
        boolean buleano;
        do {

            System.out.println("Introduzca la velocidad");
            velo = tcl.nextInt();
            buleano=true;
            try {
                if ((super.velocidad + velo) > 100 && this.remolque != null) {
                     buleano=false;
                    throw new DemasiadoRapidoException("Frena o quita el remolque");
                }else{
                    this.velocidad+=velo;
                }
                
            } catch (DemasiadoRapidoException a) {
                System.out.println(a.getMessage());
            }
        } while (!buleano);//REPITEME TODO ESTE DO WHILE CUANDO BULEANO SIGA SIENDO FALSE ES DECIR CUANDO SE CUMPLA LA CONDICION DE QUE LA VELOCIDAD TOTAL NO PUEDE SER MAYOR A 100

    }

}
