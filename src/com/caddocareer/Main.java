package com.caddocareer;

import javax.swing.*;

public class Main extends ConsoleProgram {

    public static JFrame frame = new JFrame();
    public static Calculator calculator = new Calculator();

    public static void main(String[] args)
    {
        frame.setTitle("Calculator");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setContentPane(calculator.getjPanel());
    }

}
