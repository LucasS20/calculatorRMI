package com.rmi.server;

import com.rmi.interfaces.Calculadora;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {

    public CalculadoraImpl() throws RemoteException {
        super();
    }

    @Override
    public double soma(double a, double b) throws RemoteException {
        return a + b;
    }

    @Override
    public double subtracao(double a, double b) throws RemoteException {
        return a - b;
    }

    @Override
    public double multiplicacao(double a, double b) throws RemoteException {
        return a * b;
    }

    @Override
    public double divisao(double a, double b) throws RemoteException {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
        return a / b;
    }
}
