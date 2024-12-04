package com.gui;

import javax.swing.*;

public class SmartHomeApp {
  private JButton button1;
  private JPanel panel1;
  
  public SmartHomeApp() {
    button1.addActionListener(e -> {
      System.out.println("Button clicked");
    });
  }
  
  public static void main(String[] args) {
    JFrame frame = new JFrame("SmartHomeApp");
    frame.setContentPane(new SmartHomeApp().panel1);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
