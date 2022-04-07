/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bidang;
import javax.swing.*;

/**
 *
 * @author mac
 */
public class View extends JFrame{
    JLabel llength = new JLabel("Length : ");
    JTextField flength = new JTextField();
    
    JLabel lwidth = new JLabel("Width   : ");
    JTextField fwidth = new JTextField();
    
    JLabel lheight = new JLabel("Height : ");
    JTextField fheight = new JTextField();
    
    JButton bcount = new JButton ("Count");
    JButton breset = new JButton ("Reset");
    
    JLabel lresult = new JLabel("Result : ");
    
    JLabel RectArea = new JLabel("");
    JLabel RectCir  = new JLabel("");
    JLabel CubVol   = new JLabel("");
    JLabel CubSurf  = new JLabel("");
    
    public View (){
        setTitle("Cuboid Calculator");
        setSize(350,200);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(llength);
        add(flength);
        add(lwidth);
        add(fwidth);
        add(lheight);
        add(fheight);
        add(bcount);
        add(breset);
        add(lresult);
        
        add (RectArea);
        add (RectCir);
        add (CubVol);
        add (CubSurf);
        
        llength.setBounds(10, 10, 120, 20);
        flength.setBounds(130, 10, 150, 20);
        lwidth.setBounds(10, 35, 120, 20);
        fwidth.setBounds(130, 35, 150, 20);
        lheight.setBounds(10, 60, 120, 20);
        fheight.setBounds(130, 60, 150, 20);
        lresult.setBounds(10, 95, 120, 20);
        
        RectArea.setBounds(15, 250, 150, 30);
        RectCir.setBounds(15, 280, 150, 30);
        CubVol.setBounds(15, 310, 150, 30);
        CubSurf.setBounds(15, 340, 150, 30);
        
        bcount.setBounds(130, 125, 100, 20);
        breset.setBounds(230, 125, 100, 20);
    }
    public String getFLength(){
        return flength.getText();
    }
    public String getFWidth(){
        return fwidth.getText();
    }
    public String getFHeight(){
        return fheight.getText();
    }
   
}
