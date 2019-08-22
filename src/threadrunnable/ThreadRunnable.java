/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadrunnable;

/**
 *
 * @author LENOVO
 */
public class ThreadRunnable implements Runnable  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadRunnable Thread1 = new ThreadRunnable();
        Thread t= new Thread(Thread1);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
           
            if(i==7 ){
                System.out.print("");
                
            }
            
            if(i==8){
                System.out.println("pelajari modul");
                System.out.println("Multi threading");
            }
            else{
                System.out.println(i); 
            }
           
            
        }
    }
    
}
