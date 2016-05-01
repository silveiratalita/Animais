/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author Talita
 */
public class Mamifero extends Animal {

    public boolean isIsVoando() {
        return isVoando;
    }

    public void setIsVoando(boolean isVoando) {
        this.isVoando = isVoando;
    }

    public boolean isIsAndando() {
        return isAndando;
    }

    public void setIsAndando(boolean isAndando) {
        this.isAndando = isAndando;
    }

    public boolean isHasPelo() {
        return hasPelo;
    }

    public void setHasPelo(boolean hasPelo) {
        this.hasPelo = hasPelo;
    }

   private boolean isVoando=false;
   private boolean isAndando=true;
   private boolean hasPelo=true;

 public void amamentar(){
       System.out.println("O mamifero "+getNome()+ "está amamentando seus filhotes");
 }
 
  public void reproduzir(){
       System.out.println("O mamifero "+getNome()+ "está dando a luz  aos seus filhotes");
 }
   public void mamar(){
       System.out.println("Os filhotes do "+getNome()+ "estão mamando na mãe");
 }
    public void nadar(){
       System.out.println("O mamifero "+getNome()+ " e seus filhotes estão nadando.");
 }
}