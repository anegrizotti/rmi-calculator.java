package com.mycompany.rmi_calculator.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DivInterface extends Remote {
    public int div(int x, int y) throws RemoteException;
}
