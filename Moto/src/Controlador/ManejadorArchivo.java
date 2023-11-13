/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.List;
import java.io.*;
import java.util.ArrayList;

public class ManejadorArchivo {

    public static void guardarCliente(Cliente cliente) {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("clientes.dat", true))) {
            salida.writeObject(cliente);
            System.out.println("Cliente guardado en el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el cliente en el archivo: " + e.getMessage());
        }
    }

    public static void mostrarClientes() {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("clientes.dat"))) {
            while (true) {
                Cliente cliente = (Cliente) entrada.readObject();
                System.out.println(cliente);
            }
        } catch (EOFException e) {
            // Fin del archivo, no hay más datos
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer los clientes del archivo: " + e.getMessage());
        }
    }
    
     public static List<Cliente> obtenerClientes() {
        List<Cliente> clientes = new ArrayList<>();

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("clientes.dat"))) {
            while (true) {
                Cliente cliente = (Cliente) entrada.readObject();
                clientes.add(cliente);
            }
        } catch (EOFException e) {
            // Fin del archivo, no hay más datos
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer los clientes del archivo: " + e.getMessage());
        }

        return clientes;
    }
}
