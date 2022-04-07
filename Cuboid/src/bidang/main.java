/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bidang;
import javax.swing.*;
import java.awt.event.*;
import ruang.Balok;
/**
 *
 * @author mac
 */
public class main {
     public static void main(String[] args){
        View gui = new View();
        gui.bcount.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try{
                    double length, width, height;
                    length  = Double.valueOf(gui.getFLength());
                    width   = Double.valueOf(gui.getFWidth());
                    height  = Double.valueOf(gui.getFHeight());
                    
                    Balok cube = new Balok (height, length,width);
                    gui.RectArea.setText("Area             : " + cube.hitungLuas());
                    gui.RectCir.setText("Perimeter      : " + cube.hitungKeliling());
                    gui.CubVol.setText("Volume         : " + cube.hitungVolume());
                    gui.CubSurf.setText("Surface Area : " + cube.hitungLuasMuka());
                    
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage() + "  !Please input NUMBER!");
                }
            }
            
        });
        gui.breset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                gui.RectArea.setText("");
                gui.RectCir.setText("");
                gui.CubVol.setText("");
                gui.CubSurf.setText("");
                 
                gui.fheight.setText("");
                gui.flength.setText("");
                gui.fwidth.setText("");
            }
        });
    }
}
