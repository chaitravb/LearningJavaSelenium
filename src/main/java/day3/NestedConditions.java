package day3;

public class NestedConditions {
    public static void main(String[] args) {
        int marks = 65;
        if(marks<35)
        {
            System.out.println("PASS");
        } else if(marks>=35 && marks<60){
            System.out.println("Second class");
        } else if(marks>=65 && marks<85)
        {
            System.out.println("First class");
        } else if(marks>=85 && marks<=100){
           System.out.println("Distinction");
        }
    }
}
