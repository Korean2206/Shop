package com.utils;
import java.awt.Component;

import javax.swing.JOptionPane;

public class Message {
    public static void alert(Component parent, String msg) {
        JOptionPane.showMessageDialog(parent, msg, "SecondHand Shop", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean confirm(Component parent, String msg) {
        int result = JOptionPane.showConfirmDialog(parent, msg, "SecondHand Shop", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }

    public static String prompt(Component parent, String msg) {
        return JOptionPane.showInputDialog(parent, msg, "SecondHand Shop", JOptionPane.INFORMATION_MESSAGE);
    }
}
