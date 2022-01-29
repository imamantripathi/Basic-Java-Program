// package com.company;


import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        Frame f = new Frame("BorderLayoutDemo");
        f.setSize(200,100);
        f.setLayout(new BorderLayout());
        f.add(new Button("north"),BorderLayout.NORTH);
        f.add(new Button("south"),BorderLayout.SOUTH);
        f.add(new Button("east"),BorderLayout.EAST);
        f.add(new Button("west"),BorderLayout.WEST);
        f.add(new Button("center"),BorderLayout.CENTER);
f.setVisible(true);
    }
}
