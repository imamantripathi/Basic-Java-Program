// package com.company;

import java.awt.*;
public class GridLayoutDemo1 {
    public static void main(String[] args) {
        Frame f = new Frame("GridLayout Demo");
        Panel p = new Panel();
        f.setLayout(new FlowLayout());
        p.setLayout(new GridLayout(3, 2));
        f.setSize(200, 140);
        p.add(new Label("Login"));
       // p.setSize(200,200);
        p.add(new TextField());
        p.add(new Label("Password"));
        TextField pass = new TextField();
        pass.setEchoChar('*');
        p.setBackground(Color.white);
        f.setBackground(Color.green);
        p.add(pass);
        p.add(new Button("OK"));
        p.add(new Button("Cancel"));
        f.add(p);
        f.setVisible(true);
    }
}
