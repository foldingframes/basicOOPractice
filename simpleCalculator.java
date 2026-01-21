// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter your first number: ");
        double num1 = userInput.nextDouble();
        System.out.println("Enter your second number: ");
        double num2 = userInput.nextDouble();
        
        Calculator c = new Calculator();
        c.setNum1(num1);
        c.setNum2(num2);
        
        System.out.println("The sum is " +c.calculateSum() + " and the difference is " + c.calculateDifference());
        
    }
}

class Calculator{
    
    private double num1;
    private double num2;
    private double sum;
    private double difference;
    
    public double setNum1(double numOne){
        this.num1 = numOne;
        return num1;
    }
    
    public double setNum2(double numTwo){
        this.num2 = numTwo;
        return num2;
    }
    
    public double calculateSum(){
        sum = num1 + num2;
        return sum;
    }
    
    public double calculateDifference(){
        difference = num1 - num2;
        return difference;
    }
}
