package Praktikum4;

public class OperasiPenjumlahan extends OperasiBilangan {
    @Override
    protected void setA(double a){
        this.a = a;
    }
    
     @Override
    protected void setB(double b){
        this.b = b;
    }
    
     @Override
    protected void setC(){
        this.c = a+b;

    }
    
    @Override
    protected double getA(){
        return a;
    }
    
     @Override
    protected double getB(){
        return b;
    }
    
     @Override
    protected double getC(){
        return c;
    }
    
     @Override
    protected void tampil(){
    } 
}
