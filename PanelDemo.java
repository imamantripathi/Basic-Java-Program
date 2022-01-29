// package com.company;

import javax.swing.*;
import java.awt.*;

public class PanelDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculater") ;
        f.setSize(150,200);
        // set up button
        Panel p =new Panel();
        p.setLayout(new GridLayout(5,3));
        String[] s = {"0", "+", "-", "*", "/", "="};
        for(int i=1;i<=9;i++)
            p.add(new Button(i+""));
        for(int i=0;i<s.length;i++)
            p.add(new Button(s[i]));
        f.add(new TextField(15),BorderLayout.NORTH);
        f.add( p,BorderLayout.CENTER );
        f.setVisible(true);



    }
}
