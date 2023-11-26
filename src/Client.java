package com.rmi.client;

import com.rmi.interfaces.Calculadora;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private Client() {}

    public static void main(String[] args) {
        String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Calculadora calc = (Calculadora) registry.lookup("Calculadora");

            System.out.println("2 + 3 = " + calc.soma(2, 3));
            System.out.println("2 - 3 = " + calc.subtracao(2, 3));
            System.out.println("2 * 3 = " + calc.multiplicacao(2, 3));
            System.out.println("2 / 3 = " + calc.divisao(2, 3));
        } catch (Exception e) {
            System.err.println("Exceção do cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}
