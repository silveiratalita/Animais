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
public class Reptil extends Animal {

    private boolean hasCarapaça = false;
    private boolean hascouraça = false;
    private boolean hasEscamas = false;
    private boolean hasVeneno= false;

    
  
  
  
    public void nadar() {
        System.out.println("O reptil " + getNome() + "está nadando.");
    }

    public void mudarDeCor() {
        System.out.println("O reptil " + getNome() + "está mudando de cor.");
    }

    public void rastejar() {
        System.out.println("O reptil " + getNome() + "está rastejando.");
    }

    public void moderHumano() {
        System.out.println("O reptil " + getNome() + "esta modendo um humano.");
    }
}
