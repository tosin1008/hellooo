package com.hellooo.hellooo;
import java.util.*;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Enter an operator do you want to calculate(+,-,*,/,%)");
        char operator =scanner.next().charAt(0);
        switch(operator){
            case'+': System.out.println(a+b);
                   break;
            case'-': System.out.println(a-b);
                   break;
            case'*': System.out.println(a*b);
                   break;
            case'/': System.out.println(a/b);
                   break;
            case'%': System.out.println(a%b);
                   break;
            default:System.out.println("Invalid input");

        }

    }
    
}
