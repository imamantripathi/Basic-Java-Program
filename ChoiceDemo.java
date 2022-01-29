// package com.company;

/*A Choice object represents a pop-up menu of items, one of which may be chosen at any
time. The current choice is displayed as the title of the menu. Clicking on the choice causes a
menu to appear with the current choice highlighted. The following program creates pop-menu
of three items.*/
import java.awt.*;
public class ChoiceDemo {
 public static void main(String[] args) {
 Frame f = new Frame("Choice Demo");
 f.setSize(300,120);
 f.setLayout(new FlowLayout());
Choice colors = new Choice();
 colors.add("Green");
 colors.add("Red");
 colors.add("Blue");
 f.add(new Label("Choose a color"));
 f.add(colors);
 f.setVisible(true);
 }
}
