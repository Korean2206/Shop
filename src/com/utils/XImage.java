package com.utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

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
    
    
}
