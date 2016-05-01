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
public class Ave extends Animal {

    private boolean isVoando = false;
    private boolean hasPena = true;
    private boolean hasBico = true;

    public boolean isIsVoando() {
        return isVoando;
    }

    public void setIsVoando(boolean isVoando) {
        this.isVoando = isVoando;
    }

    public boolean isHasPena() {
        return hasPena;
    }

    public void setHasPena(boolean hasPena) {
        this.hasPena = hasPena;
    }

    public boolean isHasBico() {
        return hasBico;
    }

    public void setHasBico(boolean hasBico) {
        this.hasBico = hasBico;
    }

    public void alimentarFilhotes() {
        System.out.println("A ave " + getNome() + "está alimentando seus filhotes");
    }

    public void fazerCocoNaCabecaDeHumanos() {
        System.out.println("A ave " + getNome() + "está fazendo cocô na cabeça de humanos.");
    }

    public void limparPenas() {
        System.out.println("A ave " + getNome() + "está limpando suas penas.");
    }

    public void nadar() {
        System.out.println("A ave " + getNome() + "está nadando no lago.");
    }

    public void pescar() {
        System.out.println("A ave " + getNome() + "está pescando no lago.");
    }
}
