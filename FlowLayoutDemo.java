// package com.company;

import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        Frame f = new Frame("flowlayout demo");
        f.setSize(720,350);
      Button b = new Button("ohk");
      Button c = new Button("exit");
      /*b.setSize(200,100);
      c.setSize(200,100);*/
     //   f.setBackground(Color.BLUE);

        f.setLayout(new GridLayout(1,2));
f.add(b);
f.add(c);
f.setVisible(true);

    }
}
