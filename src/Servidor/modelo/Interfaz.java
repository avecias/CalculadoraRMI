package Servidor.modelo;

import java.rmi.Remote;

public interface Interfaz extends Remote{

    public double suma(double a, double b) throws java.rmi.RemoteException;

    public double resta(double a, double b) throws java.rmi.RemoteException;

    public double multiplicacion(double a, double b) throws java.rmi.RemoteException;

    public double division(double a, double b) throws java.rmi.RemoteException;
    
    public double potencia(double a, double b) throws java.rmi.RemoteException;
    
    public double factorial(double a) throws java.rmi.RemoteException;
    
    public double seno(double a) throws java.rmi.RemoteException;
    
    public double raiz(double a) throws java.rmi.RemoteException;

    public double promedio(double[] vector) throws java.rmi.RemoteException;

    public double desviacion(double[] vector) throws java.rmi.RemoteException;
}
