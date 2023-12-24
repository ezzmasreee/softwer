/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.p2p_chatting;

import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class Net1P1_Chatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Client clientsend = new Client();
        clientsend.setVisible(true);
        clientsend.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Client clientrespons = new Client();
        clientrespons.setVisible(true);
        clientrespons.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
