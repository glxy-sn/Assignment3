/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenghitungBidang;

/**
 *
 * @author mac
 */
public class PersegiPanjang implements MenghitungBidang{
    double length;
    double width;
    
    //constructor input length and width
    public PersegiPanjang(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public double hitungLuas(double x, double y){
        return x * y;
    }
    
    @Override
    public double hitungLuas() {
        return width * length;
    }

    @Override
    public double hitungKeliling() {
         return 2*(width+length);
    }
    
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
}
