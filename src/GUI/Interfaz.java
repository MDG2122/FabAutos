/*
// Realizado por César Salazar y Massimo Di Gennaro.
*/

package GUI;

import Logica.*;
import java.awt.Color;

public class Interfaz extends javax.swing.JFrame {

    Administrador admin;
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.admin = new Administrador(DatosCola1,DatosCola2,DatosCola3,DatosReparacion, id, prioridad, estado, carros);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        DatosReparacion = new javax.swing.JTextArea();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DatosCola3 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        prioridad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DatosCola1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DatosCola2 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        id = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        estado = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        carros = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(192, 26, 26));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(878, 461));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(46, 46, 46));
        jPanel1.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.setMinimumSize(new java.awt.Dimension(878, 461));
        jPanel1.setLayout(null);

        jScrollPane4.setBackground(new java.awt.Color(72, 72, 72));
        jScrollPane4.setBorder(null);

        DatosReparacion.setEditable(false);
        DatosReparacion.setBackground(new java.awt.Color(72, 72, 72));
        DatosReparacion.setColumns(20);
        DatosReparacion.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        DatosReparacion.setForeground(new java.awt.Color(254, 254, 254));
        DatosReparacion.setLineWrap(true);
        DatosReparacion.setRows(5);
        DatosReparacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DatosReparacion.setDisabledTextColor(new java.awt.Color(254, 254, 254));
        jScrollPane4.setViewportView(DatosReparacion);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(730, 110, 130, 210);
        jPanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(716, 221, 0, 0);

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Prioridad 3");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(619, 85, 62, 16);

        jButton1.setBackground(new java.awt.Color(62, 62, 62));
        jButton1.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Iniciar");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(740, 20, 90, 25);

        jLabel9.setBackground(java.awt.Color.white);
        jLabel9.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Estado del Carro");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(26, 232, 94, 16);

        jLabel2.setBackground(new java.awt.Color(204, 1, 1));
        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("ID Carro seleccionado");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 100, 125, 16);

        jScrollPane3.setBackground(new java.awt.Color(72, 72, 72));
        jScrollPane3.setBorder(null);
        jScrollPane3.setEnabled(false);
        jScrollPane3.setFocusable(false);
        jScrollPane3.setOpaque(false);
        jScrollPane3.setRequestFocusEnabled(false);
        jScrollPane3.setVerifyInputWhenFocusTarget(false);
        jScrollPane3.setWheelScrollingEnabled(false);

        DatosCola3.setEditable(false);
        DatosCola3.setBackground(new java.awt.Color(72, 72, 72));
        DatosCola3.setColumns(20);
        DatosCola3.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        DatosCola3.setForeground(new java.awt.Color(254, 254, 254));
        DatosCola3.setLineWrap(true);
        DatosCola3.setRows(5);
        DatosCola3.setDisabledTextColor(new java.awt.Color(254, 254, 254));
        jScrollPane3.setViewportView(DatosCola3);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(591, 108, 130, 213);

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Prioridad 1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(340, 85, 62, 16);

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Prioridad 2");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(478, 85, 62, 16);

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Reparaciones");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(750, 85, 79, 16);

        prioridad.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        prioridad.setForeground(new java.awt.Color(254, 254, 254));
        prioridad.setText("X");
        jPanel1.add(prioridad);
        prioridad.setBounds(190, 160, 30, 20);

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Fabrica de Autos IBMW C.A");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(12, 12, 340, 36);

        jScrollPane1.setBackground(new java.awt.Color(72, 72, 72));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(72, 72, 72));

        DatosCola1.setEditable(false);
        DatosCola1.setBackground(new java.awt.Color(72, 72, 72));
        DatosCola1.setColumns(20);
        DatosCola1.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        DatosCola1.setForeground(new java.awt.Color(254, 254, 254));
        DatosCola1.setLineWrap(true);
        DatosCola1.setRows(5);
        DatosCola1.setBorder(null);
        DatosCola1.setDisabledTextColor(new java.awt.Color(254, 254, 254));
        jScrollPane1.setViewportView(DatosCola1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(311, 108, 130, 213);

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Nivel de Prioridad");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 160, 99, 16);

        jScrollPane2.setBackground(new java.awt.Color(72, 72, 72));
        jScrollPane2.setBorder(null);

        DatosCola2.setEditable(false);
        DatosCola2.setBackground(new java.awt.Color(72, 72, 72));
        DatosCola2.setColumns(20);
        DatosCola2.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        DatosCola2.setForeground(new java.awt.Color(254, 254, 254));
        DatosCola2.setLineWrap(true);
        DatosCola2.setRows(5);
        DatosCola2.setDisabledTextColor(new java.awt.Color(254, 254, 254));
        jScrollPane2.setViewportView(DatosCola2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(451, 108, 130, 213);

        jSeparator1.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator1.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(580, 400, 230, 50);

        id.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(254, 254, 254));
        id.setText("X");
        jPanel1.add(id);
        id.setBounds(190, 100, 30, 20);

        jScrollPane5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setEnabled(false);
        jScrollPane5.setFocusable(false);
        jScrollPane5.setOpaque(false);
        jScrollPane5.setWheelScrollingEnabled(false);

        estado.setEditable(false);
        estado.setBackground(new java.awt.Color(72, 72, 72));
        estado.setColumns(20);
        estado.setFont(new java.awt.Font("Roboto Condensed", 1, 12)); // NOI18N
        estado.setForeground(new java.awt.Color(254, 254, 254));
        estado.setLineWrap(true);
        estado.setRows(5);
        estado.setAutoscrolls(false);
        estado.setBorder(null);
        jScrollPane5.setViewportView(estado);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(26, 255, 250, 60);

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Carros en el mercado:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(581, 370, 200, 24);

        carros.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        carros.setForeground(new java.awt.Color(254, 254, 254));
        carros.setText("X");
        jPanel1.add(carros);
        carros.setBounds(790, 370, 30, 24);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/bmw-log0.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 330, 200, 130);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/triangulos-1000.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, -480, 1030, 1060);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/triangulos-1000.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(-30, 0, 920, 670);

        jSeparator2.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator2.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(12, 50, 280, 10);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 878, 461));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        admin.execute();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DatosCola1;
    private javax.swing.JTextArea DatosCola2;
    private javax.swing.JTextArea DatosCola3;
    private javax.swing.JTextArea DatosReparacion;
    private javax.swing.JLabel carros;
    private javax.swing.JTextArea estado;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel prioridad;
    // End of variables declaration//GEN-END:variables
}
