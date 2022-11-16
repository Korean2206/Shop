package com.utils;

import javax.swing.JPanel;

public class TabbedPane {

    public void changePanel(JPanel child,JPanel parent) {
        parent.removeAll();
        parent.add(child);
        parent.repaint();
        parent.revalidate();
    }
}
