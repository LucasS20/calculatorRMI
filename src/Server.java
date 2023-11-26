package com.rmi.server;

import com.rmi.interfaces.Calculadora;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public Server() {}

    public static void main(String args[]) {
        try {
            // Instanciando a implementação da calculadora
            CalculadoraImpl calc = new CalculadoraImpl();

            // Criando o registro na porta 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Registrando a implementação da calculadora no registro
            registry.bind("Calculadora", calc);

            System.err.println("Servidor pronto...");
        } catch (Exception e) {
            System.err.println("Exceção do servidor: " + e.toString());
            e.printStackTrace();
        }
    }
}
