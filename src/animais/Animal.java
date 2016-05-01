/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

import java.util.Random;

/**
 *
 * @author Talita
 */
public class Animal {

    private String nome;
    private String especie;
    private int id;

    private String cor;
    private boolean isDormindo = false;
    private int tamanho;
    private int peso;
    private String reinoAnimal;

    public String getCor() {
        return cor;
    }

    @Override
    public boolean equals(Object o) {
        Animal a = (Animal) o;
        if(a.id == this.id){
            return true;
        } else{
            return false;
        }
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getReinoAnimal() {
        return reinoAnimal;
    }

    public void setReinoAnimal(String reinoAnimal) {
        this.reinoAnimal = reinoAnimal;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    //Metodos
    public void dormir() {
        isDormindo = true;
        System.out.println("O animal está dormindo.");
    }

    public void acordar() {
        isDormindo = false;
        System.out.println("O animal está acordado.");
    }

    public void comer() {
        System.out.println("O animal está se alimentando.");
    }

    public void reproduzir() {
        System.out.println("O animal está se reproduzindo.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isIsDormindo() {
        return isDormindo;
    }
}
