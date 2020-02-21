package com.caddocareer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel jPanel;
    private JTextField textFieldFirstNum;
    private JTextField textFieldSecondNum;
    private JButton addButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton clearButton;
    private JLabel labelRepeatEqu;
    private JLabel labelOutput;
    private JButton exitButton;

    public JPanel getjPanel()
    {
        return jPanel;
    }

    public Calculator()
    {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelOutput.setText("" + add(Double.parseDouble(textFieldFirstNum.getText()), Double.parseDouble(textFieldSecondNum.getText())));
                labelRepeatEqu.setText(textFieldFirstNum.getText() + " + " + textFieldSecondNum.getText() + " =");
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelOutput.setText("" + multiply(Double.parseDouble(textFieldFirstNum.getText()), Double.parseDouble(textFieldSecondNum.getText())));
                labelRepeatEqu.setText(textFieldFirstNum.getText() + " * " + textFieldSecondNum.getText() + " =");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelOutput.setText("" + divide(Double.parseDouble(textFieldFirstNum.getText()), Double.parseDouble(textFieldSecondNum.getText())));
                labelRepeatEqu.setText(textFieldFirstNum.getText() + " / " + textFieldSecondNum.getText() + " =");
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textFieldFirstNum.setText("");
                textFieldSecondNum.setText("");
                labelOutput.setText("");
                labelRepeatEqu.setText("");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(-1);
            }
        });
    }

    //Adds the numbers together
    private double add(double one, double two)
    {
        return one + two;
    }

    //Multiplies the numbers together
    private double multiply(double one, double two)
    {
        return one * two;
    }

    //Divides the numbers
    private double divide(double one, double two)
    {
        return one / two;
    }
}
