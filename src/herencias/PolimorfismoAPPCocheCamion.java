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
        
    
    ArrayList<PolimorfismoCocheCamion> arraySito= new ArrayList(4);//arayyList
    PolimorfismoCocheCamion []aray=new PolimorfismoCocheCamion [4];//Array
    
    PolimorfismoCamion kamion1=new PolimorfismoCamion("4422-J");
    PolimorfismoCamion kamion2=new PolimorfismoCamion("4422-H");
    PolimorfismoCoche koche1=new PolimorfismoCoche(2,"2234-J");
    PolimorfismoCoche koche2=new PolimorfismoCoche(3,"24-J");
    arraySito.add(kamion1); //para añadir el objeto en el arraylist
    arraySito.add(kamion2);
    arraySito.add(koche1);
    arraySito.add(koche2);
    Remolque generalRemolque=new Remolque(800);
    
    
    
        System.out.println("Ejemplo de instaceof con Array ");
    
        for (int i = 0; i < aray.length; i++) {//Asignamos al array cada posicion un objeto
            aray[0]=kamion1;
            aray[1]=kamion2;
            aray[2]=koche1;
            aray[3]=koche2;
            
        }
        
        for (int i = 0; i < aray.length; i++) {//Imprimimos los datos del coche en caso de que sea un coche
            if (aray[i] instanceof PolimorfismoCoche) {
                System.out.println("Esto es un coche:   " +((PolimorfismoCoche)(aray[i])).toString());
                
            }else if(aray[i] instanceof PolimorfismoCamion){
                System.out.println("Esto es un camion:  "+((PolimorfismoCamion)(aray[i])).toString());
                
            }
            
        }
        System.out.println("\n A continuacion va el arraylist");
        System.out.println("\n");
        
        
        
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