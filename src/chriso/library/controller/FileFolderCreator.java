/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.TreePath;

/**
 *
 * @author Amit
 */
public class FileFolderCreator {
     private boolean FLAG; //true -> file
                           //false-> folder
     

     //this method is used to create the file 
    public static void createFile(TreePath path, String name) {
        try {
        String documentPath = FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
        for(int level=0; level<path.getPathCount(); level++){
            documentPath += "\\"+path.getPathComponent(level).toString();
            if(checkExistance(documentPath,false)){ // means previous path and the directory exist in real
                    //do nothing
            }else{
                File file  = new File(documentPath);
                file.mkdir(); //create the new directory
                System.out.println("folder created Success "+documentPath);
                break;
            }
           /* else{//means previous path and the file doesn't exist in real so create it 
                File file  = new File(documentPath);
                System.out.println(documentPath);
                FileOutputStream fos  = new FileOutputStream(file);
                System.out.println("file created Success");
                fos.close();
            }*/
        }//end of foor loop 
        
            File file = new File(documentPath + "\\" + name);
            System.out.println(documentPath + "\\" + name);
            FileOutputStream fis = new FileOutputStream(file);
            System.out.println("file created Success from out "+name);
            fis.close();
        }//end of try block 
        catch (Exception ex) {
            System.out.println(ex);
        }
    }

    //this method is used to create the folder
    public static void createFolder(TreePath path, String name) {
        String documentPath; //to hold the existing path the folder /files
        documentPath = FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
        System.out.println(path.toString());
        for(int level=0; level<path.getPathCount(); level++){
            documentPath += "\\"+path.getPathComponent(level).toString();
            System.out.println(level);
            if(checkExistance(documentPath,false)){ // means previous path and the directory exist in real
                 //do nothing
            }
            else{//means previous path and the directory doesn't exist in real so create it 
                File file  = new File(documentPath);
                file.mkdir(); //create the new directory
                System.out.println("folder created Success "+documentPath);
            }
        }//end of foor loop 
       File file = new File(documentPath + "\\" + name);
       if(file.mkdir()){
            
       System.out.println("folder created Success out " +name);
       }
       else{
           System.out.println(documentPath + "\\" + name);
           System.out.println("failed ot create the folder");
       }
    } //end of the create folder blocck

    private static boolean checkExistance(String path, boolean flag){
        File file = new File(path);
        if(flag){ //true -> file
            if(file.isFile()){
                return true;
            }
            
        } //end of if
        else{ //false ->folder
        if(file.isDirectory()){
            return true;
        }
        }//end of else 
        return false;
    }
    
    public static  String  treePathToSystemPath(TreePath path){
    String base = FileSystemView.getFileSystemView().getDefaultDirectory().getPath().toString();
    for(int level = 0; level<path.getPathCount();level++){
        String nodeName = path.getPathComponent(level).toString();
        base+="\\"+nodeName;
    }
    System.out.println(base);   
    return base ;
    }
}
