/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author hanif
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
       public static void Tampilan() {
        String angka1 ="";
        String angka2 ="";
        String angka3 ="";
        
        int nilai1, nilai2, nilai3;
        int rata ;
          
        angka1 = JOptionPane.showInputDialog("number 1");
        angka2 = JOptionPane.showInputDialog("number 2");
        angka3 = JOptionPane.showInputDialog("number 3");
        
        nilai1 = Integer.parseInt(angka1);
        nilai2 = Integer.parseInt(angka2);
        nilai3 = Integer.parseInt(angka3);
        
        rata = (nilai1 + nilai2 + nilai3)/3;
        
        String msg = "number 1 = " + angka1 +" ,\n number 2 = " + angka2 +" ,\n number 3 = " + angka3 +" ,\n Rata- Rata = "+rata;
        JOptionPane.showMessageDialog(null, msg);
    
    }
    
    
     public static void main(String[] args) {
         
           try {
               UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
               
               Tampilan();
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(JavaApplication12.class.getName()).log(Level.SEVERE, null, ex);
           } catch (InstantiationException ex) {
               Logger.getLogger(JavaApplication12.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IllegalAccessException ex) {
               Logger.getLogger(JavaApplication12.class.getName()).log(Level.SEVERE, null, ex);
           } catch (UnsupportedLookAndFeelException ex) {
               Logger.getLogger(JavaApplication12.class.getName()).log(Level.SEVERE, null, ex);
           }
     
    }
    
}
