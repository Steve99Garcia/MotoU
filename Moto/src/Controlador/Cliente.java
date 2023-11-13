/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Bismark
 */
import java.io.Serializable;

public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    private String idClientes;
    private String nombreCliente;
    private String identificacion;

    public Cliente(String idClientes, String nombreCliente, String identificacion) {
        this.idClientes = idClientes;
        this.nombreCliente = nombreCliente;
        this.identificacion = identificacion;
    }

    // Getters y setters

    public String getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(String idClientes) {
        this.idClientes = idClientes;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idClientes='" + idClientes + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", identificacion='" + identificacion + '\'' +
                '}';
    }
}
