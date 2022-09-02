package com.mycompany.rmi_calculator;

import java.rmi.Naming;

public class Server {
    public static void main(String[] args) throws Exception
    {
        Calc obj = new Calc();
  
        Naming.rebind("ADD", obj);
  
        System.out.println("Server Started");
    }
}
