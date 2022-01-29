// package com.company;
/*   Several check boxes can be put in a group using the CheckboxGroup class. In a group of check
boxes, atmost one can be in the “on” state at any time. Clicking on a check box turns it on and turns
all other in the group off. The following program crates a group of three check boxes:*/
import java.awt.*;
public class CheckBoxGroupDemo {
 public static void main(String[] args) {
 Frame f = new Frame();
 f.setSize(150,100);
 f.setLayout(new GridLayout(3,1));
CheckboxGroup cbg = new CheckboxGroup();
 f.add(new Checkbox("one", cbg, false));
 f.add(new Checkbox("two", cbg, true));
 f.add(new Checkbox("three", cbg, false));
 f.setVisible(true);
 }
}