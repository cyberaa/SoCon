/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.io.File;
import javax.swing.filechooser.FileFilter;
/**
 *
 * @author exceltior
 */
public class imageFilter extends FileFilter{
    private String imageformat = "GIF";
    private char DotIndex = '.';
    
    public String extension(File F){
        String FileName = F.getName();
        int indexfile = FileName.lastIndexOf(DotIndex);
        if(indexfile > 0 && indexfile<FileName.length()-1){
            return FileName.substring(indexfile+1);
            
        }
        else{
            return "";
        }
    }
    public String getDescription(){
        
        return "Gif Only";
    }
    public boolean accept(File F){
        if(F.isDirectory()){
            return true;
        }
        if(extension(F).equalsIgnoreCase(imageformat)){
            return true;
        }
        else{
            return false;
        }
    }


}
