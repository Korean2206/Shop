package com.utils;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Cursor;

public class Hover {

    private Color exitColor = new Color(0,0,0);
    private Color enteredColor = new Color(255,204,204);
    private Color defaultColor = new Color(255, 204, 204);
    private Color clickedColor = new Color(204, 255, 0);
    private Color white = new Color(255, 255, 255);
    private Color red = new Color(255,51,51);
    public void changeCursor(Boolean b,JLabel l) {
        if(b){
            l.setForeground(enteredColor);
            l.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
        else {
            l.setForeground(exitColor);
        }
    }
    public void changeCursorClick(Boolean b,JPanel l) {
        if(b){
            l.setBackground(clickedColor);
            l.setForeground(white);
        }
        else {
            l.setBackground(defaultColor);
        }
    }

}
