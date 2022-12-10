package com.utils;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class XImage {
    
    public static void save(File src){
        File file = new File("AnhSP",src.getName());
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(file.getAbsolutePath());
            Files.copy(from,to,StandardCopyOption.REPLACE_EXISTING);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static ImageIcon read(String filename){
        File path = new File("AnhSP",filename);
        return new ImageIcon(path.getAbsolutePath());
    }

    public static void setIconApp(JDialog parent) {
        URL iconUrl = parent.getClass().getResource("/com/image/icons8_adidas_trefoil_95px.png");
        ImageIcon icon = new ImageIcon(iconUrl);
        parent.setIconImage(icon.getImage());
    }
    public static void setIconApp(JFrame parent) {
        URL iconUrl = parent.getClass().getResource("/com/image/icons8_adidas_trefoil_95px.png");
        ImageIcon icon = new ImageIcon(iconUrl);
        parent.setIconImage(icon.getImage());
    }
    
    
}
