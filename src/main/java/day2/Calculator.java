package day2;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addNumber(10,30);
        calculator.addNumber(10,20,30);
    }
    public void addNumber(int x,int y){
        int sum = x+y;
        System.out.println("addition of 2 numbers :"+sum);
    }
    public void  addNumber(int x, int y, int z){
        int sum =x+y+z;
        System.out.println("addition of 3 numbers :"+sum);
    }
}
