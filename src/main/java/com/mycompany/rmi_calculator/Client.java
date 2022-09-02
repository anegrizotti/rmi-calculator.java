package com.mycompany.rmi_calculator;

import com.mycompany.rmi_calculator.interfaces.SubInterface;
import com.mycompany.rmi_calculator.interfaces.AddInterface;
import com.mycompany.rmi_calculator.interfaces.MulInterface;
import com.mycompany.rmi_calculator.interfaces.DivInterface;
import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println(
                "\n1.Addition\n2.Subtraction\n3.multiplication\n4.division\n5.Exit");
            System.out.println("Enter the option:");
            int opt = sc.nextInt();
            if (opt == 5) {
                break;
            }
            System.out.println(
                "Enter the the first number:");
            int a = sc.nextInt();
            System.out.println("Enter the second number:");
            int b = sc.nextInt();
            int n;
            switch (opt) {
            case 1:

                AddInterface obj
                    = (AddInterface)Naming.lookup("ADD");
                n = obj.add(a, b);
                System.out.println("Addition= " + n);
                break;
            case 2:
                SubInterface obj1
                    = (SubInterface)Naming.lookup("ADD");
                n = obj1.sub(a, b);
                System.out.println("Subtraction= " + n);
                break;
            case 3:
                MulInterface obj2
                    = (MulInterface)Naming.lookup("ADD");
                n = obj2.mul(a, b);
                System.out.println("Multiplication = " + n);
                break;
            case 4:
                DivInterface obj3
                    = (DivInterface)Naming.lookup("ADD");
                n = obj3.div(a, b);
                System.out.println("Division = " + n);
                break;
            }
        }
    }
    
}
