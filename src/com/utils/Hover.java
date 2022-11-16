package com.utils;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Cursor;

public class Hover {

    private Color exitColor = new Color(0,0,0);
    private Color enteredColor = new Color(255,204,204);
    public void changeCursor(Boolean b,JLabel l) {
        if(b){
            l.setForeground(enteredColor);
            l.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
        else {
            l.setForeground(exitColor);
        }
    }

}
