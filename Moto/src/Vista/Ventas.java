/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Cliente;
import Controlador.ManejadorArchivo;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Bismark
 */
public class Ventas extends javax.swing.JFrame {

   
    private String idClientes;
    private String nombreCliente;
    private String identificacion;

    public Ventas() {
        initComponents();
        agregarListeners();
    }

    private void agregarListeners() {
        agregarPlaceholder(Id_Clientes, "Ingrese ID Cliente");
        agregarPlaceholder(Nombre_Cliente, "Ingrese Nombre");
        agregarPlaceholder(Identificacion, "Ingrese Identificación");
    }

    private void agregarPlaceholder(JTextField textField, String placeholder) {
        textField.setForeground(java.awt.Color.GRAY);
        textField.setText(placeholder);

        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(java.awt.Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(java.awt.Color.GRAY);
                    textField.setText(placeholder);
                }
            }
        });
    }

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        ID_Cliente = new javax.swing.JLabel();
        Id_Clientes = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        Nombre_Cliente = new javax.swing.JTextField();
        Identificacion = new javax.swing.JTextField();
        Cedula = new javax.swing.JLabel();
        Guardar_DT_Cliente = new javax.swing.JButton();
        Lista_Cliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Datos del cliente");

        ID_Cliente.setText("ID Cliente");

        Id_Clientes.setForeground(new java.awt.Color(204, 204, 204));
        Id_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Id_ClientesActionPerformed(evt);
            }
        });

        Nombre.setText("Nombre");

        Nombre_Cliente.setForeground(new java.awt.Color(204, 204, 204));
        Nombre_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_ClienteActionPerformed(evt);
            }
        });

        Identificacion.setForeground(new java.awt.Color(204, 204, 204));
        Identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentificacionActionPerformed(evt);
            }
        });

        Cedula.setText("Cedula");

        Guardar_DT_Cliente.setText("Guardar");
        Guardar_DT_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_DT_ClienteActionPerformed(evt);
            }
        });

        Lista_Cliente.setText("Editar");
        Lista_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_ClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ID_Cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Id_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nombre)
                                    .addComponent(Cedula))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Nombre_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(Identificacion)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Guardar_DT_Cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Lista_Cliente)))))
                .addContainerGap(498, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_Cliente)
                    .addComponent(Id_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(Nombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cedula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar_DT_Cliente)
                    .addComponent(Lista_Cliente))
                .addContainerGap(310, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Id_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Id_ClientesActionPerformed
         // Obtener el texto del JTextField Id_Clientes
    }//GEN-LAST:event_Id_ClientesActionPerformed

    private void Nombre_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_ClienteActionPerformed
        
    }//GEN-LAST:event_Nombre_ClienteActionPerformed

    private void IdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentificacionActionPerformed


    }//GEN-LAST:event_IdentificacionActionPerformed

    private void Guardar_DT_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_DT_ClienteActionPerformed
     idClientes = Id_Clientes.getText();
    nombreCliente = Nombre_Cliente.getText();
    identificacion = Identificacion.getText();

    // Validar que se haya ingresado algo antes de guardar
    if (!idClientes.equals("Ingrese ID Cliente") && !nombreCliente.equals("Ingrese Nombre")
            && !identificacion.equals("Ingrese Identificación")) {

        // Mostrar mensaje
        JOptionPane.showMessageDialog(this, "Datos guardados:\n" +
                "ID Cliente: " + idClientes + "\n" +
                "Nombre: " + nombreCliente + "\n" +
                "Identificación: " + identificacion);

        // Crear objeto Cliente y guardarlo en el archivo
        Cliente cliente = new Cliente(idClientes, nombreCliente, identificacion);
        ManejadorArchivo.guardarCliente(cliente);
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos antes de guardar.");
    }
    }//GEN-LAST:event_Guardar_DT_ClienteActionPerformed

    private void Lista_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista_ClienteActionPerformed
        ListarCliente Lista = new ListarCliente();
        
        Lista.setVisible(true);
    }//GEN-LAST:event_Lista_ClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cedula;
    private javax.swing.JButton Guardar_DT_Cliente;
    private javax.swing.JLabel ID_Cliente;
    private javax.swing.JTextField Id_Clientes;
    private javax.swing.JTextField Identificacion;
    private javax.swing.JButton Lista_Cliente;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField Nombre_Cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}
