package org.example.oops;

public class ComplexNumber {
    int real;
    int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }
    public void plus(ComplexNumber c1){
        this.real = this.real + c1.real;
        this.imaginary = this.imaginary + c1.imaginary;
    }

    public  void multiply(ComplexNumber c1){
        int real = (this.real*c1.real) + (this.imaginary*c1.imaginary*-1);
        int imaginary = (this.real*c1.imaginary)+(this.imaginary * c1.real);
        this.real = real;
        this.imaginary = imaginary;

    }
    public void print(){
        if(imaginary >=0 ){
            System.out.println(real+" + i"+this.imaginary);
        }else{
            System.out.println(real+" - i"+this.imaginary);
        }


    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3,6);
        ComplexNumber c2 = new ComplexNumber(7,9);
        c1.multiply(c2);
        c1.print();
    }
}
