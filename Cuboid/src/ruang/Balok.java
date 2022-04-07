/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruang;
import MenghitungBidang.PersegiPanjang;


/**
 *
 * @author mac
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    double height;
    
    
    public Balok(double length, double width, double height){
        super(length, width);
        this.height = height;
    }
    
    @Override
    public double hitungVolume() {
        return super.hitungLuas() * height;
    }

    @Override
    public double hitungLuasMuka() {
        return 2 * (super.hitungLuas() + super.hitungLuas(super.getLength(), height) + super.hitungLuas(super.getWidth(), height));
    }
}
