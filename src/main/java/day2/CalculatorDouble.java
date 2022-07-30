package day2;

public class CalculatorDouble {
    public static void main(String[] args) {
        CalculatorDouble calculatord = new CalculatorDouble();
        calculatord.addNumber(10.785,30.985);
        calculatord.addNumber(10.89,20.98,30.12);
    }
    public void addNumber(double x,double y){
        double sum = x+y;
        System.out.println("addition of 2 numbers :"+sum);
    }
    public void  addNumber(double x, double y, double z) {
        double sum = x + y + z;
        System.out.println("addition of 3 numbers :" + sum);
    }
}
