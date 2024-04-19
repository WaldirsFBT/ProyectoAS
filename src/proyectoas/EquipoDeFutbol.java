
package proyectoas;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class EquipoDeFutbol extends javax.swing.JFrame implements ActionListener {

    public EquipoDeFutbol() {
        initComponents();
        btnGuardar.addActionListener(this);
        btnLeer.addActionListener(this);
    }
   
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGuardar) {
            guardarInformacionEquipo();
        } else if (e.getSource() == btnLeer) {
            leerInformacionEquipos();
        }
    }

    private void guardarInformacionEquipo() {
        String nombreEquipo = txtNombreEquipo.getText();
        String nombreEntrenador = txtNombreEntrenador.getText();
        String nombreJugador = txtNombreJugador.getText();
        String numeroCamiseta = txtNumeroCamisetaJugador.getText();
        String posicionJugador = txtPosicionJugador.getText();

        String rutaArchivo = "registro_equipos.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(rutaArchivo, true))) {
            writer.println("Equipo: " + nombreEquipo);
            writer.println("Entrenador: " + nombreEntrenador);
            writer.println("Jugador: " + nombreJugador + " - Número de camiseta: " + numeroCamiseta + " - Posición: " + posicionJugador);
            writer.println("--------------------------------------------------------------------------");
            JOptionPane.showMessageDialog(this, "Información guardada correctamente.");

            // Limpiar los campos después de guardar los datos
            limpiarCampos();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar la información del equipo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void leerInformacionEquipos() {
        String rutaArchivoEntrada = "registro_equipos.txt";
        String rutaArchivoSalida = "registro_equipos_leidos.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivoEntrada));
             PrintWriter writer = new PrintWriter(new FileWriter(rutaArchivoSalida))) {
            String linea;
            StringBuilder contenido = new StringBuilder();
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n");
                writer.println(linea); // Guardar la línea en el archivo de salida
            }
            JOptionPane.showMessageDialog(this, contenido.toString(), "Información de Equipos", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(this, "Información guardada en el archivo registro_equipos_leidos.txt.", "Información Guardada", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al leer la información del archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarCampos() {
        txtNombreEquipo.setText("");
        txtNombreEntrenador.setText("");
        txtNombreJugador.setText("");
        txtNumeroCamisetaJugador.setText("");
        txtPosicionJugador.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreEquipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreEntrenador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreJugador = new javax.swing.JTextField();
        txtPosicionJugador = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnLeer = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNumeroCamisetaJugador = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setText("Equipo de Fútbol");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setText("Nombre de Equipo de Futbol");

        txtNombreEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEquipoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel3.setText("Entrenador");

        txtNombreEntrenador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEntrenadorKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel4.setText("Nombre del Jugador");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setText("Posición del jugador");

        txtNombreJugador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreJugadorKeyTyped(evt);
            }
        });

        txtPosicionJugador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPosicionJugadorKeyTyped(evt);
            }
        });

        btnLeer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLeer.setText("Leer");

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel6.setText("Nro de Camiseta");

        txtNumeroCamisetaJugador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCamisetaJugadorKeyTyped(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo futbol (3).jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtPosicionJugador)
                    .addComponent(txtNombreEntrenador)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreJugador)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(txtNumeroCamisetaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtPosicionJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtNumeroCamisetaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreJugadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreJugadorKeyTyped
    
        char c = evt.getKeyChar();
    
        if ((c<'a'|| c>'z') &&(c<'A')| c>'Z') evt.consume();
        
        
    }//GEN-LAST:event_txtNombreJugadorKeyTyped

    private void txtNombreEntrenadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEntrenadorKeyTyped
    char c = evt.getKeyChar();
    
        if ((c<'a'|| c>'z') &&(c<'A')| c>'Z') evt.consume();
        
    }//GEN-LAST:event_txtNombreEntrenadorKeyTyped

    private void txtPosicionJugadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPosicionJugadorKeyTyped
    char c = evt.getKeyChar();
    
        if ((c<'a'|| c>'z') &&(c<'A')| c>'Z') evt.consume();
    }//GEN-LAST:event_txtPosicionJugadorKeyTyped

    private void txtNombreEquipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEquipoKeyTyped
    char c = evt.getKeyChar();
    
        if ((c<'a'|| c>'z') &&(c<'A')| c>'Z') evt.consume();
    }//GEN-LAST:event_txtNombreEquipoKeyTyped

    private void txtNumeroCamisetaJugadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCamisetaJugadorKeyTyped
    char c = evt.getKeyChar();
    
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtNumeroCamisetaJugadorKeyTyped

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
            java.util.logging.Logger.getLogger(EquipoDeFutbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EquipoDeFutbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EquipoDeFutbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EquipoDeFutbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EquipoDeFutbol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLeer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombreEntrenador;
    private javax.swing.JTextField txtNombreEquipo;
    private javax.swing.JTextField txtNombreJugador;
    private javax.swing.JTextField txtNumeroCamisetaJugador;
    private javax.swing.JTextField txtPosicionJugador;
    // End of variables declaration//GEN-END:variables
}
