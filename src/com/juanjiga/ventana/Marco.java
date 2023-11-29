package com.juanjiga.ventana;

import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana(){
        //setSize(300, 300);
        //etLocation(500, 500);
        setBounds(500, 500, 300, 300);
        setResizable(true);
        setTitle("Ventana");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
