/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unus;

/**
 *
 * @author duran
 */
public class InterfaceGrafica extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceGrafica
     */
    public InterfaceGrafica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jPanel4.setLayout(null);

        jTextField10.setText("jTextField10");
        jPanel4.add(jTextField10);
        jTextField10.setBounds(50, 70, 65, 20);

        jTextField11.setText("jTextField11");
        jPanel4.add(jTextField11);
        jTextField11.setBounds(40, 170, 65, 20);

        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setText("Avaliação");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(60, 40, 46, 14);

        jLabel12.setForeground(new java.awt.Color(102, 0, 102));
        jLabel12.setText("Frequência");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(40, 150, 53, 14);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unus/imagens/diretor.jpg"))); // NOI18N
        jLabel18.setText("jLabel18");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(-3, -10, 400, 330);

        jTabbedPane7.addTab("Inserir", jPanel4);

        jTabbedPane2.addTab("Professor", jTabbedPane7);

        jPanel5.setLayout(null);

        jTextField12.setText("jTextField12");
        jPanel5.add(jTextField12);
        jTextField12.setBounds(35, 89, 65, 20);

        jTextField13.setText("jTextField13");
        jPanel5.add(jTextField13);
        jTextField13.setBounds(35, 165, 65, 20);

        jTextField14.setText("jTextField14");
        jPanel5.add(jTextField14);
        jTextField14.setBounds(197, 165, 65, 20);

        jLabel13.setForeground(new java.awt.Color(230, 230, 230));
        jLabel13.setText("Histórico");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(47, 69, 41, 14);

        jLabel14.setForeground(new java.awt.Color(230, 230, 230));
        jLabel14.setText("Disciplina");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(211, 145, 43, 14);

        jLabel15.setForeground(new java.awt.Color(230, 230, 230));
        jLabel15.setText("Frequência");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(46, 145, 53, 14);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unus/imagens/academy-celebrate-celebration-267885.jpg"))); // NOI18N
        jLabel19.setText("jLabel19");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(0, 0, 400, 320);

        jTabbedPane8.addTab("Consultar", jPanel5);

        jTabbedPane2.addTab("Aluno", jTabbedPane8);

        jTabbedPane1.addTab("Doc/Disc.", jTabbedPane2);

        jPanel1.setLayout(null);

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(10, 27, 138, 20);

        jTextField2.setText("jTextField2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(3, 128, 59, 20);

        jTextField3.setText("jTextField3");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(72, 128, 94, 20);

        jLabel2.setForeground(new java.awt.Color(230, 230, 230));
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(23, 7, 27, 14);

        jLabel3.setForeground(new java.awt.Color(230, 230, 230));
        jLabel3.setText("Turma");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 108, 30, 14);

        jLabel4.setForeground(new java.awt.Color(230, 230, 230));
        jLabel4.setText("Disciplina");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(89, 108, 43, 14);

        jTextField4.setText("jTextField4");
        jPanel1.add(jTextField4);
        jTextField4.setBounds(230, 30, 59, 20);

        jLabel1.setForeground(new java.awt.Color(230, 230, 230));
        jLabel1.setText("Matricula");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(238, 7, 43, 14);

        jTextField5.setText("jTextField5");
        jPanel1.add(jTextField5);
        jTextField5.setBounds(140, 80, 91, 20);

        jLabel5.setForeground(new java.awt.Color(230, 230, 230));
        jLabel5.setText("Histórico");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(157, 57, 60, 14);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unus/imagens/academy-celebrate-celebration-267885.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(-3, 7, 400, 340);

        jTabbedPane4.addTab("Cadastro Aluno", jPanel1);

        jTabbedPane1.addTab("Secretaria", jTabbedPane4);

        jPanel2.setLayout(null);

        jTextField6.setText("jTextField6");
        jPanel2.add(jTextField6);
        jTextField6.setBounds(40, 70, 59, 20);

        jTextField7.setText("jTextField7");
        jPanel2.add(jTextField7);
        jTextField7.setBounds(40, 190, 59, 20);

        jTextField8.setText("jTextField8");
        jPanel2.add(jTextField8);
        jTextField8.setBounds(270, 190, 59, 20);

        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Curso");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 50, 28, 14);

        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("Professor");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(280, 170, 46, 14);

        jLabel9.setForeground(new java.awt.Color(102, 0, 102));
        jLabel9.setText("Disciplina");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(50, 170, 43, 14);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unus/imagens/diretor.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(0, 0, 400, 350);

        jTabbedPane5.addTab("Cadastro", jPanel2);

        jTabbedPane1.addTab("Direção", jTabbedPane5);

        jPanel3.setLayout(null);

        jTextField9.setText("jTextField9");
        jPanel3.add(jTextField9);
        jTextField9.setBounds(41, 87, 59, 20);

        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText("Disciplina");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(41, 55, 43, 14);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unus/imagens/diretor.jpg"))); // NOI18N
        jLabel16.setText("jLabel16");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(-13, -7, 420, 360);

        jTabbedPane3.addTab("Cadastro", jPanel3);

        jTabbedPane1.addTab("Coordenação", jTabbedPane3);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
