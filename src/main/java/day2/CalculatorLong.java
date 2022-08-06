package day2;

public class CalculatorLong {
    public static void main(String[] args) {
        CalculatorLong calculatorl = new CalculatorLong();
        calculatorl.addNumber(107859622l,309852222l);
        calculatorl.addNumber(108956788l,20982233l,30129876677l);
    }
    public void addNumber(long x,long y){
        long sum = x+y;
        System.out.println("addition of 2 numbers :"+sum);
    }
    public void  addNumber(long x, long y, long z) {
        long sum = x + y + z;
        System.out.println("addition of 3 numbers :" + sum);
    }     
}
