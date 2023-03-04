/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;

import java.util.ArrayList;

/**
 *
 * @author skril
 */
public class PolimorfismoAPPCocheCamion {
    public static void main(String[] args)throws DemasiadoRapidoException {
        
    
    ArrayList<PolimorfismoCocheCamion> arraySito= new ArrayList(4);
    
    PolimorfismoCamion kamion1=new PolimorfismoCamion("4422-J");
    PolimorfismoCamion kamion2=new PolimorfismoCamion("4422-H");
    PolimorfismoCoche koche1=new PolimorfismoCoche(2,"2234-J");
    PolimorfismoCoche koche2=new PolimorfismoCoche(3,"24-J");
    arraySito.add(kamion1);
    arraySito.add(kamion2);
    arraySito.add(koche1);
    arraySito.add(koche2);
    Remolque generalRemolque=new Remolque(800);
    
     
        
        for (int i = 0; i < arraySito.size(); i++) {
            if (arraySito.get(i)instanceof PolimorfismoCamion) {
                ((PolimorfismoCamion)(arraySito.get(i))).ponRemolque(generalRemolque);
                
            }
            arraySito.get(i).acelerar(80);
            System.out.println("Vehiculo: "+i+",   "+arraySito.get(i).toString());
        }
             kamion1.acelerarCamion();
        System.out.println(kamion1.toString());
        
        
}
}