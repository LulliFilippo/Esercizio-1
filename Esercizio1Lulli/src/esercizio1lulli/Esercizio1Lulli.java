/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esercizio1lulli;

/**
 *
 * @author itismeucci
 */
public class Esercizio1Lulli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Player Lulli = new Player ("Lulli") ;
        Player Guilot = new Player ("Guilot");
        
        System.out.println("!!LET THE GAME BEGIN!!");
        
        Lulli.setPriority(10);
        
        Lulli.start();
        Guilot.start();
        
        
        Lulli.join();
        Lulli.sleep(1000);
        Guilot.join();
        
        if(Lulli.getLancio() == Lulli.getLancio2()){
            System.out.println("Lulli ha diritto a un lancio BONUS");
            int punt = Lulli.getPunteggio();
            punt += (int)(Math.random()*6+1);
            System.out.println("Il punteggio finale di Lulli é " + punt);
            Lulli.setPunteggio(punt);
        }
        if(Guilot.getLancio() == Guilot.getLancio2()){
            System.out.println("Guilot ha diritto a un lancio BONUS");
            int punt = Guilot.getPunteggio();
            punt += (int)(Math.random()*6+1);
            System.out.println("Il punteggio finale di Guilot é " + punt);
            Guilot.setPunteggio(punt);
        }
        
        System.out.println("!!GAME ENDS!!");
        
        if(Lulli.getPunteggio() > Guilot.getPunteggio()){
            System.out.println("--Lulli ha vinto--");
        }else{
            if(Lulli.getPunteggio() < Guilot.getPunteggio()){
            System.out.println("--Guilot ha vinto--");
        }else{
                System.out.println("--Pareggio--");
            }
        }
        
    }
    
}
