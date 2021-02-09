package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame
{
    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setTitle("GridLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextField field = new JTextField();
        setLayout(new GridLayout(4, 3));
        add(field);
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText("0");
            }
        });

        JButton[] jbs = new JButton[10];

        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton(" " + i);
            add(jbs[i]);

        }

        jbs[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "0");
            }
        });

        jbs[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "1");
            }
        });
        jbs[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "2");
            }
        });
        jbs[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "3");
            }
        });

        jbs[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "4");
            }
        });
        jbs[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "5");
            }
        });
        jbs[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "6");
            }
        });
        jbs[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "7");
            }
        });
        jbs[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "8");
            }
        });
        jbs[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "9");
            }
        });

        JButton clearButton = new JButton("C");
        add(clearButton);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText("");
            }
        });

        JButton plusButton = new JButton("+");
        add(plusButton);
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "+");
            }
        });

        JButton minusButton = new JButton("-");
        add(minusButton);
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "-");
            }
        });

        JButton multiplyButton = new JButton("*");
        add(multiplyButton);
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "*");
            }
        });

        JButton divisionButton = new JButton("/");
        add(divisionButton);
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "/");
            }
        });

        JButton equalityButton = new JButton("=");
        add(equalityButton);
        equalityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(resultOfCalculation(field.getText()));
            }
        });
        setVisible(true);
    }

    public String resultOfCalculation(String s)
    {
        //считаем количество знаков операций,чтобы определить количество знаков
        int operCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/')
            {
                operCount++;
            }
        }
        String[] numArray = s.split("[+\\-\\*\\/]"); //составляем массив из строк с цифрами

        char[] operArray = new char[operCount];
        int kNum = 0;
        int oNum = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((oNum <= operCount) && (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'))
            {
                operArray[oNum] = s.charAt(i);
                oNum++;
            }
        }



        Double resultCalc = Double.parseDouble(numArray[0]);

        for (int i = 1; i < numArray.length; i++) {
           outer: for (int j = 0; j < operArray.length; j++) {
                switch (operArray[j]){
                    case '+':
                    {
                        resultCalc = resultCalc + Double.parseDouble(numArray[i]);
                        break outer;
                    }
                    case '-':
                    {
                        resultCalc = resultCalc - Double.parseDouble(numArray[i]);
                        break outer;
                    }
                    case '*':
                    {
                        resultCalc = resultCalc * Double.parseDouble(numArray[i]);
                        break outer;
                    }
                    case '/':
                    {
                        resultCalc = resultCalc / Double.parseDouble(numArray[i]);
                        break outer;
                    }
                }
            }
        }
        return resultCalc.toString();
    }
}
