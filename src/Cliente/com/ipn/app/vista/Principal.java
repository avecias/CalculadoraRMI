package Cliente.com.ipn.app.vista;

import Cliente.com.ipn.app.modelo.entidades.Usuario;
import Servidor.modelo.Interfaz;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    private ArrayList<Usuario> usuarios;
    private Usuario usuario;
    private Double a, b;
    private Integer tama;
    private double vector[];
    private Interfaz calculadora;
    private Registry registry;

    public Principal(ArrayList<Usuario> usuarios, Usuario usuario) {
        initComponents();
        this.usuarios = usuarios;
        this.usuario = usuario;
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        ventanaInterna = new javax.swing.JInternalFrame();
        panelPrincipal = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        tabEscuela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNumeros = new javax.swing.JTable();
        refrescarAlumno = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Resultado1 = new javax.swing.JFormattedTextField();
        resultado2 = new javax.swing.JFormattedTextField();
        menuBarra = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        menuRelogin = new javax.swing.JMenuItem();
        menuMisDatos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Base de Datos");
        setResizable(false);

        escritorio.setName("des"); // NOI18N
        escritorio.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                escritorioventanCerrada(evt);
            }
        });

        ventanaInterna.setClosable(true);
        ventanaInterna.setIconifiable(true);
        ventanaInterna.setMaximizable(true);
        ventanaInterna.setResizable(true);
        ventanaInterna.setTitle("Manejador");
        ventanaInterna.setAutoscrolls(true);
        ventanaInterna.setDoubleBuffered(true);
        ventanaInterna.setName("principal"); // NOI18N
        ventanaInterna.setVisible(true);

        tabs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });

        tablaNumeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Numeros"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaNumeros);

        refrescarAlumno.setText("Calcular");
        refrescarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrescarAlumnoActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicacion", "Division", "Potencia", "Factorial", "Seno", "Raiz" }));

        jLabel1.setText("Resultado:");

        jButton1.setText("Promedio/Desv");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Promedio", "Desviacion" }));

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Resultado: ");

        javax.swing.GroupLayout tabEscuelaLayout = new javax.swing.GroupLayout(tabEscuela);
        tabEscuela.setLayout(tabEscuelaLayout);
        tabEscuelaLayout.setHorizontalGroup(
            tabEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabEscuelaLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(tabEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabEscuelaLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(tabEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tabEscuelaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(resultado2))
                    .addGroup(tabEscuelaLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(refrescarAlumno))
                    .addGroup(tabEscuelaLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(tabEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabEscuelaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton2))
                    .addGroup(tabEscuelaLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Resultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104))
        );
        tabEscuelaLayout.setVerticalGroup(
            tabEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabEscuelaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(tabEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refrescarAlumno)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Resultado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(tabEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabEscuelaLayout.createSequentialGroup()
                        .addGroup(tabEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(27, 27, 27)
                        .addGroup(tabEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        tabs.addTab("Calculadora", tabEscuela);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ventanaInternaLayout = new javax.swing.GroupLayout(ventanaInterna.getContentPane());
        ventanaInterna.getContentPane().setLayout(ventanaInternaLayout);
        ventanaInternaLayout.setHorizontalGroup(
            ventanaInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaInternaLayout.setVerticalGroup(
            ventanaInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        escritorio.setLayer(ventanaInterna, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(ventanaInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ventanaInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        menuArchivo.setText("Archivo");

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalir(evt);
            }
        });
        menuArchivo.add(menuSalir);

        menuBarra.add(menuArchivo);

        menuUsuario.setText("Usuario");

        menuRelogin.setText("Relogin");
        menuRelogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relogin(evt);
            }
        });
        menuUsuario.add(menuRelogin);

        menuMisDatos.setText("Mis datos");
        menuMisDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMisDatos(evt);
            }
        });
        menuUsuario.add(menuMisDatos);

        menuBarra.add(menuUsuario);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalir
        // Salir de aplicacion
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_menuSalir

    private void relogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relogin
        // Iniciar con un nuevo usuario
        Login login = new Login(usuarios);
        login.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_relogin

    private void menuMisDatos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMisDatos
        // Ver datos del usuario
        JOptionPane.showMessageDialog(null, usuario.toString());
    }//GEN-LAST:event_menuMisDatos

    private void escritorioventanCerrada(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_escritorioventanCerrada
        // TODO add your handling code here:
    }//GEN-LAST:event_escritorioventanCerrada

    private void click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click
        // TODO add your handling code here:
        System.out.println(tabs.getSelectedIndex());
    }//GEN-LAST:event_click

    private void refrescarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarAlumnoActionPerformed
        // TODO add your handling code here:
        if (validar()) {
            operacion();
        } else {
            JOptionPane.showMessageDialog(null, "No son numeros");
        }
    }//GEN-LAST:event_refrescarAlumnoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (validarLista()) {
            promedioODesviacion();
        } else {
            JOptionPane.showMessageDialog(null, "No son numeros");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tama = Integer.valueOf(JOptionPane.showInputDialog("Inserte el numero de elementos"));
        tablaNumeros.setModel(new DefaultTableModel(tama, 1));
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Resultado1;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenuItem menuMisDatos;
    private javax.swing.JMenuItem menuRelogin;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton refrescarAlumno;
    private javax.swing.JFormattedTextField resultado2;
    private javax.swing.JPanel tabEscuela;
    private javax.swing.JTable tablaNumeros;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JInternalFrame ventanaInterna;
    // End of variables declaration//GEN-END:variables

    private boolean validar() {
        try {
            a = Double.valueOf(jTextField1.getText());
            b = Double.valueOf(jTextField2.getText());
            return true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
            return false;
        }
    }

    private void operacion() {
        try {
            if (jComboBox1.getSelectedItem().equals("Suma")) {
                Resultado1.setText(String.valueOf(calculadora.suma(a, b)));
            } else if (jComboBox1.getSelectedItem().equals("Resta")) {
                Resultado1.setText(String.valueOf(calculadora.resta(a, b)));
            } else if (jComboBox1.getSelectedItem().equals("Multiplicacion")) {
                Resultado1.setText(String.valueOf(calculadora.multiplicacion(a, b)));
            } else if (jComboBox1.getSelectedItem().equals("Division")) {
                Resultado1.setText(String.valueOf(calculadora.division(a, b)));
            } else if (jComboBox1.getSelectedItem().equals("Potencia")) {
                Resultado1.setText(String.valueOf(calculadora.potencia(a, b)));
            } else if (jComboBox1.getSelectedItem().equals("Factorial")) {
                Resultado1.setText(String.valueOf(calculadora.factorial(a)));
            } else if (jComboBox1.getSelectedItem().equals("Seno")) {
                Resultado1.setText(String.valueOf(calculadora.seno(a)));
            } else if (jComboBox1.getSelectedItem().equals("Raiz")) {
                Resultado1.setText(String.valueOf(calculadora.raiz(a)));
            }
        } catch (RemoteException e) {
            System.err.println("Error al consultar al objeto remoto " + e);
        }
    }

    private void iniciar() {
        try {
            calculadora = (Interfaz) Naming.lookup("Calculadora");
//            registry = LocateRegistry.getRegistry();
//            System.out.println("Direccion " + registry.toString());
//            calculadora = (Calculadora) registry.lookup("Calculadora");
        } catch (RemoteException ex) {
            System.err.println("Error " + ex);
        } catch (NotBoundException ex) {
            System.err.println("Error al vincular " + ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean validarLista() {
        boolean bandera = false;
        vector = new double[tama];
        try {
            for (int i = 0; i < tablaNumeros.getRowCount(); i++) {
                vector[i] = Double.parseDouble((String) tablaNumeros.getValueAt(i, 0));
                System.out.println(vector[i]);
            }
            bandera = true;
        } catch (NumberFormatException ex) {
            System.err.println("No es un numero " + ex);
        }
        return bandera;
    }

    private void promedioODesviacion() {
        try{
            if(jComboBox2.getSelectedItem().equals("Promedio")){
                resultado2.setText(String.valueOf(calculadora.promedio(vector)));
            }
            else if(jComboBox2.getSelectedItem().equals("Desviacion")){
                resultado2.setText(String.valueOf(calculadora.desviacion(vector)));
            }
        } catch (RemoteException ex) {
            System.err.println("Error al consultar al objeto remoto " + ex);
        }
    }

}
