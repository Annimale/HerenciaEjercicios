/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;


public class Pelicula extends Multimedia{
    private String actorPrincipal, actrizPrincipal;
    public Pelicula(String titulo, String autor, format formato, String duracion, String actorPrincipal, String actrizPrincipal) throws Exception{
        super(titulo, autor, formato, duracion);
        
        if (actorPrincipal == null && actrizPrincipal == null || actorPrincipal.length()==0 && actrizPrincipal.length()==0) {
            throw new Exception("Los nombres del actor principal y la actriz principal no pueden estar vacios");
        } else{
            this.actorPrincipal = actorPrincipal;
            this.actrizPrincipal = actrizPrincipal;
        }
        
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nActor Principal: "+actorPrincipal+"\nActriz Principal: "+actrizPrincipal;
    }
}
