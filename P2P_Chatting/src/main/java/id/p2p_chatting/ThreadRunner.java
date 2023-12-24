/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.p2p_chatting;

/**
 *
 * @author hp
 */
public class ThreadRunner implements Runnable {

    Client copy;

    ThreadRunner(Client aThis) {
        copy = aThis;
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }

    
    public void run() {
        while (true) {
            copy.receive();
        }
    }
}
