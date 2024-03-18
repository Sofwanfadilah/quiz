/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class pilihsewa extends JFrame{

    private JButton motorButton;
    private JButton mobilButton;

    public pilihsewa() {
        setTitle("Pilihan Kendaraan");
        setSize(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Inisialisasi
        motorButton = new JButton("motor");
        mobilButton = new JButton("mobil");

        // Set layout
        setLayout(new flowLayout());

        // memasukan kompenen ke frame
        add(motorButton);
        add(mobilButton);

        // Set frame visible
        setVisible(true);
    }

}
    
    

