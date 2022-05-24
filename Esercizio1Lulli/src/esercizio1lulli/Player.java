/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizio1lulli;

/**
 *
 * @author itismeucci
 */
public class Player extends Thread{
    private String nome;
    private int lancio;
    private int lancio2;
    private int punteggio = 0;

    public Player(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLancio() {
        return lancio;
    }

    public void setLancio(int lancio) {
        this.lancio = lancio;
    }

    public int getLancio2() {
        return lancio2;
    }

    public void setLancio2(int lancio2) {
        this.lancio2 = lancio2;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }
    
    public void run(){ 
        System.out.println(this.nome + " è entrato in partita");
        for (int i = 0; i < 2; i++) {
            this.lancio2 = (int)(Math.random()*6+1);
            System.out.println(this.nome + " ha tirato ed è uscito " + this.lancio2);
            this.punteggio += this.lancio2;
        }
        System.out.println("Il punteggio finale di "+ this.nome + " é " + this.punteggio);
        this.lancio = this.punteggio - this.lancio2;
        
    }
}
