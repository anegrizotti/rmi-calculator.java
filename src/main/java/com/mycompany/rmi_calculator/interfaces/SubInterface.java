package com.mycompany.rmi_calculator.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SubInterface extends Remote {
    public int sub(int x, int y) throws RemoteException;
}
