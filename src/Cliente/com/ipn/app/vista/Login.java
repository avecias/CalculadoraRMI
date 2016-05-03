package Cliente.com.ipn.app.vista;

import Cliente.com.ipn.app.controlador.ArchivoXML;
import Cliente.com.ipn.app.modelo.entidades.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private ArrayList<Usuario> usuarios;

    public Login() {
        initComponents();
        usuarios = ArchivoXML.leerUsuarios();
    }
    
    public Login(ArrayList<Usuario> usuarios) {
        initComponents();
        this.usuarios = usuarios;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagen = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelClave = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        passClave = new javax.swing.JPasswordField();
        ok = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cliente/com/ipn/app/imagenes/login.gif"))); // NOI18N

        titulo.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        titulo.setText("Manejador de Base de Datos");

        labelUsuario.setText("Usuario");

        labelClave.setText("Clave");

        passClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enter(evt);
            }
        });

        ok.setText("Ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okEnter(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsuario)
                            .addComponent(labelClave))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passClave, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelar)
                                .addGap(18, 18, 18)
                                .addComponent(ok)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelClave)
                            .addComponent(passClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ok)
                            .addComponent(cancelar)))
                    .addComponent(imagen))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // Sale de la aplicacion
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enter
        // Enter detectado en el jtextfield de password
        if (evt.getKeyChar() == 10) {
            String nombre = textoUsuario.getText();
            String clave = passClave.getText();
            buscar(nombre, clave);
        }
    }//GEN-LAST:event_enter

    private void okEnter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okEnter
        // ok enter
        String nombre = textoUsuario.getText();
        String clave = passClave.getText();
        buscar(nombre, clave);
    }//GEN-LAST:event_okEnter


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel labelClave;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JButton ok;
    private javax.swing.JPasswordField passClave;
    private javax.swing.JTextField textoUsuario;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void buscar(String nombre, String clave) {
        for (Usuario usuario : usuarios) {
            if (usuario.getClave().equals(clave) && usuario.getNombre().equals(nombre)) {
                System.out.println("Encontrado");
                JOptionPane.showMessageDialog(null, "Bienvenido " + usuario.getNombre());
                new Principal(usuarios, usuario).setVisible(true);
                this.dispose();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario y/o clave no validos ");
        textoUsuario.setText("");
        passClave.setText("");
    }
}
