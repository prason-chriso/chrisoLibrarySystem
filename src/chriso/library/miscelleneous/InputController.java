/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chriso.library.miscelleneous;

import java.awt.event.KeyEvent;

/**
 *
 * @author Amit
 */
public class InputController {
    
    public static boolean allowOnlyNumber(KeyEvent event, char c){
      if (!(c >= '0' && c <= '9')){
        event.consume();
        System.out.println("non printable character is pressed or not a number character");
         return false;
     }
      else{
          return true;
      }
    }//end of allowOnlyNumberBlock

    
    public static boolean allowWordAndNumber(KeyEvent event, char c){
     
     if (!((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z'))){ 
        event.consume();
        System.out.println("non printable character is pressed or illegal word character");
         return false;
     }
      else{
          return true;
      }
    }//end of allowWordAndNumberBlock
    
    public static boolean allowOnlyWord(KeyEvent event, char c){
     
     if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c==' ')){ 
        event.consume();
        System.out.println("non printable character is pressed or illegal word character");
         return false;
     }
      else{
          return true;
      }
    }//end of allowWordAndNumberBlock
   
    
}
