/* A Checkbox object can be in either of the two states: “on” (true) or “off” (false). It has a small
rectangular area which remains empty for “off” state and shows a small tick mark (√) for “on” state.
Clicking on a check box toggles its state. The following program creates three check boxes in a grid
layout: */
// package com.company;

import java.awt.*;
public class CheckBoxDemo {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(150,100);
        f.setLayout(new GridLayout(3,1));
        f.add(new Checkbox("WiFi",null, true));
        f.add(new Checkbox("3G"));
        f.add(new Checkbox("Camera"));
        f.setVisible(true);
    }
}
