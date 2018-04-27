package com.company.My;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame{

    public MyJFrame(){
        super("Calculator");
        this.setSize(400, 400);

        JPanel cont = (JPanel)this.getContentPane(); //konténer ahova minden kerül
        FlowLayout flo = new FlowLayout(); //layout elrendező  (border layouttal megadható mi hova kerüljön)
        JCheckBox jCheck = new JCheckBox("Jelölj be", true); //chekbox. szöveg, plusz a jelölése
        JCheckBox jCheck2 = new JCheckBox("Jelölj be", false);
        JComboBox jComb = new JComboBox();
        //mindhárom szöveges alapú
        JLabel jLabel = new JLabel("jlabel"); //egyszerű felirat. amit megadok az kerül oda
        JTextField jTextField = new JTextField("ide egy egysoros"); //egysoros beviteli mező
        JTextArea jTextArea = new JTextArea(5, 20); //többsörös szövegmező (5 sor, 20 betű)

        cont.setLayout(flo);

        JButton button0 = new JButton("nullas gomb"); //hozzáadom a gombot.  sima gomb (Buttonnal is kérhető)
        button0.setText("Okéka"); //felülírom a tartalmát,


        jComb.addItem("Első"); //lenyíló fül
        jComb.addItem("Második");
        jComb.setEditable(true); // szerkeszthetővé válik a box

        cont.add(button0); //a panelhez sima addal tudunk hozzáadni
        cont.add(jCheck);
        cont.add(jCheck2);
        cont.add(jComb);
        cont.add(jLabel);
        cont.add(jTextField);
        cont.add(jTextArea);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        super.setVisible(true);
    }
}
