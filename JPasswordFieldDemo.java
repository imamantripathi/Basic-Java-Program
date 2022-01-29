// package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordFieldDemo {
    public static void main(String args[])
    {
        final JFrame f = new JFrame("JPasswordField Demo");
        Container c = f.getContentPane();
        f.setSize(200,80);
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Password"));
        final JPasswordField pf = new JPasswordField(10);
        c.add(pf);
        pf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pw = new String(pf.getPassword());
                JOptionPane.showMessageDialog(f,"Password is: " + pw);
            }
        });
        f.setVisible(true);
    }
}
