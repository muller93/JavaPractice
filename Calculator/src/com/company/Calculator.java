package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class Calculator {
    private JButton button1;
    private JButton ACButton;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton xButton;

    // nums
    private JButton a0Button;
    private JButton button10;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a1Button;
Main main = new Main();
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        /*frame.setContentPane(new Calculator().a0Button);*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void butFunc(){
        //a0Button.addActionListener(new Exit());
    }

}
