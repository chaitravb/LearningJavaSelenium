package day2;

public class CalculatorFloat {
    public static void main(String[] args) {
        CalculatorFloat calculatorf = new CalculatorFloat();
        calculatorf.addNumber(10.5f,30.4f);
        calculatorf.addNumber(10.2f, 20.6f, 30.1f);
    }
    public void addNumber(float x,float y){
        float sum = x+y;
        System.out.println("addition of 2 numbers :"+sum);
    }
    public void  addNumber(float x, float y, float z){
        float sum =x+y+z;
        System.out.println("addition of 3 numbers :"+sum);
    }
}
