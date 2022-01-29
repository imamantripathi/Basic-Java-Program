// package com.company;

import java.awt.*;

public class ButtonDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Button");
        f.setSize(200,100);
        f.setLayout(new FlowLayout());
        Button b = new Button("love");
        f.add(b);
        f.setVisible(true);
    }
}
