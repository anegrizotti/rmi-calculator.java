package com.mycompany.rmi_calculator;

import com.mycompany.rmi_calculator.interfaces.SubInterface;
import com.mycompany.rmi_calculator.interfaces.AddInterface;
import com.mycompany.rmi_calculator.interfaces.MulInterface;
import com.mycompany.rmi_calculator.interfaces.DivInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calc extends UnicastRemoteObject implements AddInterface, SubInterface, MulInterface, DivInterface {

    public Calc() throws Exception { super(); }
    
    @Override
    public int add(int x, int y) { return x + y; }
    
    @Override
    public int sub(int x, int y) { return x - y; }
    
    @Override
    public int mul(int x, int y) { return x * y; }
    
    @Override
    public int div(int x, int y) { return x / y; }
    
}
