package APP;

import CONEXION.ConexionUsuarios;
import CONEXION.Usuarios;
import javax.swing.JOptionPane;

public class REGISTRO extends javax.swing.JFrame {

    public REGISTRO() {
        initComponents();
        txtId.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        txtConContraseña = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 10, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 210, -1));

        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 210, -1));

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 210, -1));

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 210, -1));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 210, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 70, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefono");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ConContraseña");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, 20));

        jPanel1.setBackground(new java.awt.Color(72, 120, 239));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("REGISTRAR USUARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        jButton1.setBackground(new java.awt.Color(161, 198, 237));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 100, 30));

        jButton4.setBackground(new java.awt.Color(161, 198, 237));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 100, 30));

        jButton5.setBackground(new java.awt.Color(255, 204, 102));
        jButton5.setText("_");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 40, 30));

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 40, 30));

        jButton6.setBackground(new java.awt.Color(140, 136, 249));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Volver");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, 30));

        txtContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 210, -1));

        txtConContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtConContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 210, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LOGINFONDO.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtContraseña.getText() == null ? txtConContraseña.getText() == null : txtContraseña.getText().equals(txtConContraseña.getText())){
            Insertar();
            Limpiar();
        }else{
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
        LOGIN login = new LOGIN();
        login.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRO().setVisible(true);
            }
        });
    }
    
    private void Limpiar(){
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtUsuario.setText("");
        txtContraseña.setText("");
        txtConContraseña.setText("");
    }
    
    private void Insertar(){
        ConexionUsuarios conn = new ConexionUsuarios();

        String nombre = (txtNombre.getText());
        String apellido = (txtApellido.getText());
        String telefono = (txtTelefono.getText());
        String correo = (txtCorreo.getText());
        String usuario = (txtUsuario.getText());
        String contraseña = (txtContraseña.getText());
        String concontraseña = (txtConContraseña.getText());
        
        
        Usuarios usuarios = new Usuarios(nombre, apellido, telefono, correo, usuario, contraseña, concontraseña);
        conn.insertarUsuario(usuarios);
        
        Limpiar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtConContraseña;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
