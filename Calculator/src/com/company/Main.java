package com.company;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Main {

    private JFrame frame;
    private JTextField resultField;
    public String sanswer = null;
    public String stemp1 = "";
    public String stemp2 = "";
    public double answer = 0.0D;
    public boolean ss = true;
    public boolean dec = false;
    public char operation;
    private JTextField num1;
    private JTextField num2;
    private JTextField OpField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    String piku = ".3";
                    System.out.println(Double.parseDouble(piku) + 1.0D);
                    Main window = new Main();
                    window.frame.setVisible(true);
                } catch (Exception var3) {
                    var3.printStackTrace();
                }

            }
        });
    }

    public Main() {
        this.initialize();
    }

    public void initialize() {
        this.frame = new JFrame();
        this.frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.frame.setBounds(100, 100, 651, 416);
        this.frame.setDefaultCloseOperation(3);
        this.frame.getContentPane().setLayout((LayoutManager)null);
        JButton button1 = new JButton("1");
        button1.setBounds(45, 140, 115, 25);
        this.frame.getContentPane().add(button1);
        JButton button2 = new JButton("2");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Main.this.ss) {
                    Main.this.stemp1 = Main.this.stemp1 + "2";
                    Main.this.resultField.setText(Main.this.stemp1);
                } else {
                    Main.this.stemp2 = Main.this.stemp2 + "2";
                    Main.this.resultField.setText(Main.this.stemp2);
                }

            }
        });
        button2.setBounds(185, 140, 115, 25);
        this.frame.getContentPane().add(button2);
        JButton button3 = new JButton("3");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Main.this.ss) {
                    Main.this.stemp1 = Main.this.stemp1 + "3";
                    Main.this.resultField.setText(Main.this.stemp1);
                } else {
                    Main.this.stemp2 = Main.this.stemp2 + "3";
                    Main.this.resultField.setText(Main.this.stemp2);
                }

            }
        });
        button3.setBounds(320, 140, 115, 25);
        this.frame.getContentPane().add(button3);
        JButton button4 = new JButton("4");
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Main.this.ss) {
                    Main.this.stemp1 = Main.this.stemp1 + "4";
                    Main.this.resultField.setText(Main.this.stemp1);
                } else {
                    Main.this.stemp2 = Main.this.stemp2 + "4";
                    Main.this.resultField.setText(Main.this.stemp2);
                }

            }
        });
        button4.setBounds(45, 180, 117, 25);
        this.frame.getContentPane().add(button4);
        JButton button5 = new JButton("5");
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Main.this.ss) {
                    Main.this.stemp1 = Main.this.stemp1 + "5";
                    Main.this.resultField.setText(Main.this.stemp1);
                } else {
                    Main.this.stemp2 = Main.this.stemp2 + "5";
                    Main.this.resultField.setText(Main.this.stemp2);
                }

            }
        });
        button5.setBounds(185, 180, 115, 25);
        this.frame.getContentPane().add(button5);
        JButton button6 = new JButton("6");
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Main.this.ss) {
                    Main.this.stemp1 = Main.this.stemp1 + "6";
                    Main.this.resultField.setText(Main.this.stemp1);
                } else {
                    Main.this.stemp2 = Main.this.stemp2 + "6";
                    Main.this.resultField.setText(Main.this.stemp2);
                }

            }
        });
        button6.setBounds(320, 180, 115, 25);
        this.frame.getContentPane().add(button6);
        JButton button7 = new JButton("7");
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Main.this.ss) {
                    Main.this.stemp1 = Main.this.stemp1 + "7";
                    Main.this.resultField.setText(Main.this.stemp1);
                } else {
                    Main.this.stemp2 = Main.this.stemp2 + "7";
                    Main.this.resultField.setText(Main.this.stemp2);
                }

            }
        });
        button7.setBounds(45, 217, 117, 25);
        this.frame.getContentPane().add(button7);
        JButton button8 = new JButton("8");
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Main.this.ss) {
                    Main.this.stemp1 = Main.this.stemp1 + "8";
                    Main.this.resultField.setText(Main.this.stemp1);
                } else {
                    Main.this.stemp2 = Main.this.stemp2 + "8";
                    Main.this.resultField.setText(Main.this.stemp2);
                }

            }
        });
        button8.setBounds(185, 217, 117, 25);
        this.frame.getContentPane().add(button8);
        JButton button9 = new JButton("9");
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Main.this.ss) {
                    Main.this.stemp1 = Main.this.stemp1 + "9";
                    Main.this.resultField.setText(Main.this.stemp1);
                } else {
                    Main.this.stemp2 = Main.this.stemp2 + "9";
                    Main.this.resultField.setText(Main.this.stemp2);
                }

            }
        });
        button9.setBounds(320, 217, 117, 25);
        this.frame.getContentPane().add(button9);
        JButton button0 = new JButton("0");
        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Main.this.ss) {
                    Main.this.stemp1 = Main.this.stemp1 + "0";
                    Main.this.resultField.setText(Main.this.stemp1);
                } else {
                    Main.this.stemp2 = Main.this.stemp2 + "0";
                    Main.this.resultField.setText(Main.this.stemp2);
                }

            }
        });
        button0.setBounds(183, 254, 117, 25);
        this.frame.getContentPane().add(button0);
        JButton buttonDecimal = new JButton(".");
        buttonDecimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Main.this.ss && !Main.this.dec) {
                    Main.this.stemp1 = Main.this.stemp1 + ".";
                    Main.this.resultField.setText(Main.this.stemp1);
                    Main.this.dec = true;
                } else if (!Main.this.dec) {
                    Main.this.stemp2 = Main.this.stemp2 + ".";
                    Main.this.resultField.setText(Main.this.stemp2);
                    Main.this.dec = true;
                }

            }
        });
        buttonDecimal.setBounds(320, 254, 117, 25);
        this.frame.getContentPane().add(buttonDecimal);
        JButton buttonAdd = new JButton("+");
        buttonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Main.this.ss && Main.this.stemp1 != "") {
                    Main.this.ss = false;
                    Main.this.resultField.setText("");
                    Main.this.dec = false;
                }

                if (!Main.this.ss) {
                    Main.this.operation = '+';
                }

            }
        });
        buttonAdd.setBounds(45, 304, 117, 25);
        this.frame.getContentPane().add(buttonAdd);
        JButton buttonSub = new JButton("-");
        buttonSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Main.this.ss && Main.this.stemp1 != "") {
                    Main.this.ss = false;
                    Main.this.resultField.setText("");
                    Main.this.dec = false;
                }

                if (!Main.this.ss) {
                    Main.this.operation = '-';
                }

            }
        });
        buttonSub.setBounds(185, 304, 117, 25);
        this.frame.getContentPane().add(buttonSub);
        JButton buttonMul = new JButton("*");
        buttonMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (Main.this.ss && Main.this.stemp1 != "") {
                    Main.this.ss = false;
                    Main.this.resultField.setText("");
                    Main.this.dec = false;
                }

                if (!Main.this.ss) {
                    Main.this.operation = '*';
                }

            }
        });
        buttonMul.setBounds(318, 304, 117, 25);
        this.frame.getContentPane().add(buttonMul);
        JButton buttonDiv = new JButton("/");
        buttonDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (Main.this.ss && Main.this.stemp1 != "") {
                    Main.this.ss = false;
                    Main.this.resultField.setText("");
                    Main.this.dec = false;
                }

                if (!Main.this.ss) {
                    Main.this.operation = '/';
                }

            }
        });
        buttonDiv.setBounds(469, 304, 117, 25);
        this.frame.getContentPane().add(buttonDiv);
        JButton buttonEq = new JButton("=");
        buttonEq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!Main.this.ss && Main.this.stemp1 != "" && Main.this.stemp2 != "") {
                    Main.this.ss = true;
                    Main.this.dec = false;
                    if (Main.this.stemp1.lastIndexOf(".") == Main.this.stemp1.length() - 1) {
                        Main.this.stemp1 = Main.this.stemp1.substring(0, Main.this.stemp1.length() - 1);
                        if (Main.this.stemp1.length() <= 0) {
                            Main.this.stemp1 = "0";
                        }
                    }

                    if (Main.this.stemp2.lastIndexOf(".") == Main.this.stemp2.length() - 1) {
                        Main.this.stemp2 = Main.this.stemp2.substring(0, Main.this.stemp2.length() - 1);
                        if (Main.this.stemp2.length() <= 0) {
                            Main.this.stemp2 = "0";
                        }
                    }

                    Main.this.stemp1.replaceAll("^0+", "");
                    Main.this.stemp2.replaceAll("^0+", "");
                    Main.this.num1.setText("num1 : " + Main.this.stemp1);
                    Main.this.num2.setText("num2 : " + Main.this.stemp2);
                    Main.this.OpField.setText("         " + Character.toString(Main.this.operation));
                    if (Main.this.operation == '+') {
                        Main.this.resultField.setText(Double.toString(Double.parseDouble(Main.this.stemp1) + Double.parseDouble(Main.this.stemp2)));
                    } else if (Main.this.operation == '-') {
                        Main.this.resultField.setText(Double.toString(Double.parseDouble(Main.this.stemp1) - Double.parseDouble(Main.this.stemp2)));
                    } else if (Main.this.operation == '*') {
                        Main.this.resultField.setText(Double.toString(Double.parseDouble(Main.this.stemp1) * Double.parseDouble(Main.this.stemp2)));
                    } else if (Main.this.operation == '/') {
                        if (Double.parseDouble(Main.this.stemp2) == 0.0D) {
                            JOptionPane.showMessageDialog((Component)null, "Can't divide by zero, can you?");
                        } else {
                            Main.this.resultField.setText(Double.toString(Double.parseDouble(Main.this.stemp1) / Double.parseDouble(Main.this.stemp2)));
                        }
                    }

                    Main.this.stemp1 = "";
                    Main.this.stemp2 = "";
                    Main.this.operation = 'a';
                }

            }
        });
        buttonEq.setBounds(497, 180, 117, 25);
        this.frame.getContentPane().add(buttonEq);
        this.resultField = new JTextField();
        this.resultField.setFont(new Font("Accanthis ADF Std", 1, 15));
        this.resultField.setEditable(false);
        this.resultField.setBounds(46, 36, 389, 66);
        this.frame.getContentPane().add(this.resultField);
        this.resultField.setColumns(10);
        JButton buttonX = new JButton("C");
        buttonX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Main.this.ss) {
                    if (Main.this.stemp1 != "") {
                        Main.this.stemp1 = Main.this.stemp1.substring(0, Main.this.stemp1.length() - 1);
                        if (Main.this.stemp1.lastIndexOf(".") != -1) {
                            Main.this.dec = true;
                        } else {
                            Main.this.dec = false;
                        }
                    }

                    if (Main.this.stemp1.length() <= 0) {
                        Main.this.stemp1 = "";
                        Main.this.dec = false;
                    }

                    Main.this.resultField.setText(Main.this.stemp1);
                    if (Main.this.stemp1 == "" && Main.this.stemp2 == "") {
                        Main.this.resultField.setText("0.0");
                    }
                } else if (Main.this.stemp1.length() <= 0) {
                    Main.this.ss = true;
                } else {
                    if (Main.this.stemp2 != "") {
                        Main.this.stemp2 = Main.this.stemp2.substring(0, Main.this.stemp2.length() - 1);
                        if (Main.this.stemp2.lastIndexOf(".") != -1) {
                            Main.this.dec = true;
                        } else {
                            Main.this.dec = false;
                        }
                    }

                    if (Main.this.stemp2.length() <= 0) {
                        Main.this.stemp2 = "";
                        Main.this.dec = false;
                    }

                    Main.this.resultField.setText(Main.this.stemp2);
                }

            }
        });
        buttonX.setBounds(497, 56, 117, 25);
        this.frame.getContentPane().add(buttonX);
        this.num1 = new JTextField();
        this.num1.setEditable(false);
        this.num1.setText("num1 : ");
        this.num1.setBounds(46, 13, 114, 19);
        this.frame.getContentPane().add(this.num1);
        this.num1.setColumns(10);
        this.num2 = new JTextField();
        this.num2.setEditable(false);
        this.num2.setText("num2 : ");
        this.num2.setBounds(321, 13, 114, 19);
        this.frame.getContentPane().add(this.num2);
        this.num2.setColumns(10);
        this.OpField = new JTextField();
        this.OpField.setForeground(Color.BLUE);
        this.OpField.setFont(new Font("Dialog", 1, 17));
        this.OpField.setEditable(false);
        this.OpField.setBounds(186, 13, 114, 19);
        this.frame.getContentPane().add(this.OpField);
        this.OpField.setColumns(10);
    }
}
