package Servidor.controlador;

import Servidor.modelo.Calculadora;
import Servidor.modelo.Interfaz;
import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            System.out.println("Puerto " + Registry.REGISTRY_PORT);
            Interfaz i = new Calculadora();
            Remote stub = UnicastRemoteObject.exportObject(i, 0);
            registry.bind("Calculadora", stub);
            System.out.println("Proceso terminado");
        } catch (RemoteException ex) {
            System.out.println("Error al conectar remotamente " + ex);
        } catch (AlreadyBoundException ex) {
            System.out.println("Error al vincular " + ex);
        }
    }
}
