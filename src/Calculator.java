import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner sc=new Scanner(System.in);
        double num1=sc.nextDouble();
        System.out.println("Enter the second integer:");
        double num2=sc.nextDouble();
        System.out.println("Enter an operator :");
        char operator;
        operator=sc.next().charAt(0);
        double result;
        switch(operator){
            case'+':result=num1+num2;
                System.out.println("Sum of "+num1+" and "+num2+" is : "+result);
                break;
            case '-': result=num1-num2;
                System.out.println("Subtraction of "+num1+" and "+num2+" is : "+result);
                break;
            case '*': result=num1*num2;
                System.out.println("Multiplication  of "+num1+" and "+num2+" is : "+result);
                break;
            case '/': result=num1/num2;
                System.out.println("Division  of "+num1+" and "+num2+" is : "+result);
                break;
            case '%': result=num1%num2;
                System.out.println("Mod of "+num1+" and "+num2+" is : "+result);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
