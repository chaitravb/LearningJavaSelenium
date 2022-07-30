package day2;

public class CalculatorShort {
    public static void main(String[] args) {
        CalculatorShort calculators = new CalculatorShort();
        short a = 345;
        short b = 345;
        short c = 234;
        calculators.addNumber(a, b);
        calculators.addNumber(a,b,c);
    }
    public void addNumber(short x,short y){
        int sum = x+y;
        System.out.println("addition of 2 numbers :"+sum);
    }
    public void  addNumber(short x, short y, short z){
        int sum =x+y+z;
        System.out.println("addition of 3 numbers :"+sum);
    }
}
