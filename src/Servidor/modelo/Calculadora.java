package Servidor.modelo;

import java.rmi.RemoteException;

public class Calculadora implements Interfaz {

    @Override
    public double suma(double a, double b) {
        return a + b;
    }

    @Override
    public double resta(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicacion(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
    }

    @Override
    public double promedio(double[] vector) {
        double resultado = 0;
        for (int i = 0; i < vector.length; i++) {
            resultado += vector[i];
        }
        return resultado / vector.length;
    }

    @Override
    public double desviacion(double[] vector) {
        double resultado = 0;
        double promedio = promedio(vector);
        for (int i = 0; i < vector.length; i++) {
            double valor = vector[i] - promedio;
            resultado += valor * valor;
        }
        return Math.sqrt(resultado / (vector.length - 1));
    }

    @Override
    public double potencia(double a, double b) throws RemoteException {
        return Math.pow(a, b);
    }

    @Override
    public double factorial(double a) throws RemoteException {
        if(a == 0)
            return 1;
        return factorial(a - 1) * a;
    }

    @Override
    public double seno(double a) throws RemoteException {
        return Math.sin(a);
    }

    @Override
    public double raiz(double a) throws RemoteException {
        return Math.sqrt(a);
    }
}
